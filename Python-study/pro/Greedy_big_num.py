#큰 수 만들기
#https://programmers.co.kr/learn/courses/30/lessons/42883
def solution(number, k):
    li=list(number)#문자열을 리스트로 변경
    ans=li[:1]#정답을 저장할 스택
    i=1
    while k>0:
        if ans[-1]<li[i]:#스택의 끝에 있는 것<넣을 숫자
            ans.pop(-1)#끝의 것을 제거
            k-=1
            if len(ans)>0:#스택의 길이가 0이 아닐 때
                if ans[-1]<li[i]:#스택의 끝에 위치한 수<넣을 숫자
                    continue#재귀로 반복(작은 숫자들을 모두 뺄 때까지)
            else:#스택의 길이가 0일 때
                ans+=[li[i]]#숫자 넣기
                i += 1
        else:
            ans+=[li[i]]#스택의 끝에 있는 수가 넣을 숫자보다 크거나 같을 경우
            i+=1
            if len(ans)==len(li)-k:#스택의 길이가 정답의 길이일때(EX: (9999999,4)와 같은 케이스)
                return ''.join(ans)
    return ''.join(ans)+number[i:]#스택+문자열의 끝 리턴

print(solution("99999999",4))