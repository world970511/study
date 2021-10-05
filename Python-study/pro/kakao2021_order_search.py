#카카오2021 순위 검색
#https://programmers.co.kr/learn/courses/30/lessons/72412
import re
import bisect as bis
from itertools import combinations
"""
def solution(info, query):#정확도 패스, 효율 논패스
    answer=[]
    n_info=[[int(i.split(' ')[4])]+i.split(' ')[0:4] for i in info]
    q_li = [re.sub('and |-', '', q).split(' ') for q in query]
    n_info.sort(reverse=True)
    print(q_li)
    print(n_info)

    for q in q_li:
        c=0
        for i in n_info:
            if i[0]>=int(q[4]):
                if (i[1] == q[0] or q[0] == '') and (i[2] == q[1] or q[1] == '') \
                            and (i[3] == q[2] or q[2] == '') and (i[4] == q[3] or q[3] == ''):
                    c+=1
                else:continue
            else: break
        answer += [c]
    return answer
"""

def solution(info, query):
    answer = []
    info_dict={}
    for i in info:
        n=i.split(' ')#info를 ' '를 기준으로 분리
        for j in range(5):  # 키로 만들 수 있는 모든 조합 생성
            for c in combinations(n[:-1], j):
                tmp = ''.join(c)
                if tmp in info_dict:#동일한 키 값이 있을 경우
                    info_dict[tmp].append(int(n[-1]))
                else:#동일한 키값이 없을 경우
                    info_dict[tmp] = [int(n[-1])]
    for k in info_dict:info_dict[k].sort()#점수 순서대로 정렬

    for q in query:
        qu=re.sub('and |-', '', q).split(' ')#and와 -를 제거하고 ' '을 기준으로 문자열 분리
        k=''.join(qu[:-1])#조건
        v=int(qu[-1])#기준이 되는 점수
        if k in info_dict:#동일한 키 값이 있을 경우(==동일한 조건일 경우)
            if info_dict[k]:#점수가 있을 경우
                ent=bis.bisect_left(info_dict[k],v)#기준이 되는 점수보다 작은 값
                answer+=[len(info_dict[k])-ent]#기준이 되는 점수보다 큰 값을 개수
        else:answer+=[0]
    return answer
print(solution(["java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"],["java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"]))