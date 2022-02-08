#2022 카카오 블라인드 -신고 결과 받기
#https://programmers.co.kr/learn/courses/30/lessons/92334
#아직 초기라 짧거나 신기한 코드가 없음.... 나중에 리펙토링

import re
def solution(id_list, report, k):
    #리스트로 변경하는 코드
    #findall을 쓴 이유= split을 쓸 경우 시간이 초과되서
    report= [re.findall('[a-zA-Z]+',i) for i in report]
    r_dict={}

    for i in report:#딕셔너리 형으로 변경, 동일한 사람이 신고한 경우 리스트로 추가
        if i[0] in r_dict:
            r_dict[i[0]]+=[i[1]]
        else:
            r_dict[i[0]]=[i[1]]

    #한 사람이 동일한 사람을 반복적으로 신고힐 경우 1번으로 처리됨,
    r_dict=dict([[i[0],list(set(i[1]))]for i in r_dict.items()])

    #k번 이상 신고된 유저를 찾는 코드
    c=[]
    for i in r_dict.values():
        c+=i
    notice=[i for i in id_list if c.count(i)>=k]

    # 정지 메일 보내기
    answer=[]
    for i in id_list:
        if i not in r_dict:#유저를 신고한 적이 없는 경우
            answer+=[0]
        elif r_dict[i]==notice:
            answer+=[len(r_dict[i])]
        else:
            answer+=[len(set(r_dict[i]) & set(notice))]

    return answer



#[2,1,1,0]
print(solution(["muzi", "frodo", "apeach", "neo"],["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"],2))
#[0,0]
print(solution(["con", "ryan"],["ryan con", "ryan con", "ryan con", "ryan con"],3))