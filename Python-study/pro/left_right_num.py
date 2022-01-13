#월간 코드 첼린지 시즌 2 - 약수의 개수와 덧셈
#https://programmers.co.kr/learn/courses/30/lessons/77884
def solution(left, right):
    answer = 0
    d=[i*i for i in range(1,32)]
    for i in range(left,right+1):
        if i in d: answer-=i
        else: answer+=i
    return answer

print(solution(13,17))
print(solution(24,27))