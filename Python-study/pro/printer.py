def solution(priorities, location):
    answer = 0
    idex=[]
    for i in range(0, len(priorities)):idex.append(i)#키를 저장할 새로운 리스트

    while True:
        if priorities[0]< max(priorities):#가장 앞에 있는 것이 가장 중요도가 높은 것보다 작을 경우
            idex.append(idex[0])
            idex.pop(0)
            #앞에 있는 위치의 키값을 뒤로 보낸다(이전 값은 삭제)
            priorities.append(priorities[0])
            priorities.pop(0)
            #가장 앞에 있는 문서를 대기열의 가장 뒤로 보낸다
        elif priorities[0]==max(priorities):
            #가장 앞에 있는 문서가 가장 중요도가 높을 경우
            priorities.pop(0)#출력
            idex.pop(0)#키 값 제거
            answer+=1
            if location not in idex: break;
            # 만약 출력하고자 하는 문서의 키 값이 리스트에 없으면
            #출력되었다는 뜻이므로 for문을 중단한다
    return answer
