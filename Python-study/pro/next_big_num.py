#프로그래머스 다음 큰 숫자
#https://programmers.co.kr/learn/courses/30/lessons/12911
def solution(n):
    for i in range(n+1,1000000):#조건이 1000000까지니까 그걸 최종으로 잡은
        if format(n, 'b').count('1')==format(i,'b').count('1'):#입력된 숫자보다 크고 이진법으로 변환했을때 1의 개수가 동일할경우 리턴
            return i
print(solution(15))