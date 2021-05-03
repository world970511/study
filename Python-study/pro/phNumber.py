def solution(pb):
    pb.sort()# 전화번호 목록을 오름차순으로 정리한다

    for i in pb:
        a=help(i,pb)#비교할 기준과 대상을 help로 보냄
        if(a==1):#help에서 1이 반환될 경우 false를 반환
            answer=False
            break
        else: answer=True#help에서 0이 반환될 경우 true를 반환
        #이를 통해 모든 요소를 비교해본다.
    return answer

def help(i,pb2):
    del pb2[pb2.index(i)]#i를 제외한 전화번호 목록
    cut=len(i)#i의 길이
    for i2 in pb2:
        if i == i2[0:cut]:#i와 i의 길이만큼 자른 요소가 같을 경우 1을 반환.
            ans=1
            break
        else: ans=0
    return ans

#https://programmers.co.kr/learn/courses/30/lessons/42577