#카카오2020블라인드-괄호 변환
#https://programmers.co.kr/learn/courses/30/lessons/60058

import re
def Correct(p):#올바른 괄호인지 체크하는 함수
    stack = []
    for c in p:
        if c == '(':
            stack.append(c)
        else:
            if not len(stack):
                return False
            elif stack[-1] == '(':
                stack.pop()
    return False if len(stack) else True

def sep(p):#u,v를 분리하는 함수
    u=''
    for w in p:
        u+=w
        if len(re.findall('\(',u))==len(re.findall('\)',u)):#둘의 개수를 구해 반환
            break
    v=p[len(u):]
    return u,v

def check(p):#재귀
    ans=''

    if len(p)==0: return ''#입력된 p 길이가 0일때 빈 문자열 반환

    u,v=sep(p)

    if Correct(u)==True:#u가 올바른 괄호일 경우
        ans+=u + check(v)
    else:#u가 올바른 괄호가 아닌 경우
        ans= '('
        ans+=check(v)
        ans+=')'
        for i in u[1:-1]:
            if i == ')':
                ans += '('
            else:
                ans += ')'
    return ans

def solution(p):
    if Correct(p)==True:
        return p
    else:
        return check(p)

print(solution(")("))