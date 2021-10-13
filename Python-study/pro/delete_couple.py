#2017 팁스타운 - 짝지어 제거하기
#https://programmers.co.kr/learn/courses/30/lessons/12973
#+ 올바른 괄호 문제 활용 - 결국 스택
def solution(s):
    temp=[s[0]]# 제일 첫번째 철자 입력
    for i in range(1,len(s)):
        temp+=s[i]#철자 추가
        if ''.join(temp[-2:])==s[i]*2:#새로 들어온 것과 이전 것이 짝을 이루면 pop
                temp.pop()
                temp.pop()
    return 1 if len(temp)==0 else 0#temp길이가 0이면 1 반환 , 아닐 경우 0 반환
print(solution('baabaa'))