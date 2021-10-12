#프로그래머스 -올바른 괄호
#https://programmers.co.kr/learn/courses/30/lessons/12909
def solution2(s):#(스택 이용)
    temp=[]
    if s[0]!=')':# 시작이 '('이 아닐 경우 무조건 거짓으로 처리
        for i in s:
            if i=='(':#'('이 들어올 경우에는 무조건 스택에 추가
                temp+=i
            else:#')'이 들어올 경우
                temp+=i#스택에 추가한 다음
                if temp[-2:]==['(',')']:#새로 들어온 것과 그 이전 것이 () 일 경우 pop
                    temp=temp[:-2]
    else: return False
    return len(temp) == 0#스택이 비어있지 않으면 거짓으로, 비어있으면 참으로 반환

print(solution2("(()("))

