#프로그래머스 오픈채팅방
def solution(record):
    a = []
    id={}
    for i in record:
        str=i.split(' ')# 문자열을 공백으로 분리
        if str[0] =='Enter':#제일 앞이 enter인 경우
            id[str[1]]=str[2]#(똑같은 사람이 들어올 경우는 값을 변경)딕셔너리에 값 추가
            a.append([str[1],"님이 들어왔습니다."])#id(딕셔너리의 키값)과 문자열 저장
        elif i.split(' ')[0]=='Leave':#제일 앞이 leave인 경우
            a.append([str[1],"님이 나갔습니다."])#id(딕셔너리의 키값)과 문자열만 저장
        else: id[str[1]]=str[2]#제일 앞이 change인 경우. 키를 이용하여 딕셔너리의 값을 변경
    return  [id[x[0]]+x[1] for x in a]#리스트 컴프리핸션을 사용하여 반복. ket->value로 바꾼다


print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))