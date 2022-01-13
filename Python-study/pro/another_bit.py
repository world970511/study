#월간 코드 첼린지 시즌 2-2개 이하로 다른 비트
#https://programmers.co.kr/learn/courses/30/lessons/77885

def solution(numbers):
    answer = []
    for n in numbers:
        if n%2==0:# 짝수일 경우
            answer+=[n+1]
        else:
            # 최하위 비트 0을 찾아 1로 바꾸기
            zero_toOne = n | (n + 1) & (-n)
            # 최하위 비트 0의 다음 비트1을 0으로 변환
            temp = (zero_toOne & (~((n + 1) & (-n)) >> 1))
            answer+=[temp]

    return answer

#진짜 미친 것 같은 다른 풀이방법
#참고: https://wikidocs.net/1161
#해설을 봐도 이해가 안감 이게 어찌 되는 거야...
def another_solution(numbers):
        answer = []
        for idx, val in enumerate(numbers):
            answer.append(((val ^ (val + 1)) >> 2) + val + 1)

        return answer


print(solution([2,7]))