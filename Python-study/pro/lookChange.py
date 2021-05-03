import collections

def solution(dic):
    c1 = collections.Counter(dict(dic).values())
    # 입력받은 배열을 딕셔너리로 바꾸어 각 의상의 종류에 속한 옷의 개수만 따로 저장한다.

    answer = 1
    for i in c1.values():  # 옷의 개수에 각각 1을 더하고 곱한다
        i += 1
        answer *= i

    return answer - 1  # 마지막에 1을 뺀 값을 반환한다

#문제:https://programmers.co.kr/learn/courses/30/lessons/42578