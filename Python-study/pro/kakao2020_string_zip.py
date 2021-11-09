#2020 KAKAO BLIND RECRUITMENT 문자열 압축
#https://programmers.co.kr/learn/courses/30/lessons/60057?language=python3
def solution(s):
    answer = []#정답을 저장할 리스트
    divide=1#문자열을 나누는 단위
    if len(s)>1:#입력받은 문자열의 길이가 1보다 클 경우
        while len(s)//divide>1:#문자열을 단위로 나눈 몫이 1보다 클 때 반복
            p=0#단위로 컷하는 포인터
            ans=[]#단위로 나눈 문자열 리스트
            c=1#반복되는 것 카운터
            for i in range(len(s)//divide):#단위로 나눈 몫만큼 반복
                if p==0:
                    ans+=[s[p:p + divide]]
                else:
                    if ans[-1]==s[p:p + divide]:
                        c+=1#반복되는 것의 개수 카운트
                    else:
                        if c>1:
                            ans+=[str(c)]#반복된 개수 추가
                        ans+=[s[p:p + divide]]#반복되지 않은 것 추가
                        c=1#카운터 초기화
                p+=divide
            if c!=1:#끝의 카운터가 1이 아닐 경우
                ans+=[str(c)]#리스트에 추가
            #압축한 문자열 길이+단위로 나뉘어지지 않은 문자열 길이
            answer.append(len(''.join(ans))+len(s[p:]))
            divide+=1
        return min(answer)#최소값 반환
    else: return 1# 길이가 1일 경우 1 반환
print(solution("af"))