#1단계 여러가지

#월간코드첼린지 시즌 1 내적
def solution(a, b):
    return sum([i[0]*i[1] for i in zip(a,b)])

#월간코드첼린지 시즌 3 없는 숫자 더하기
def solution(numbers):
    return sum([i for i in [0,1,2,3,4,5,6,7,8,9] if i not in numbers])

#위클리챌린지 최소직사각형
def solution(sizes):
    a=max([sorted(i)[0]for i in sizes])
    b=max([sorted(i)[1]for i in sizes])
    return a*b

#찾아라 프로그래밍 마이스터 폰켓몬
def solution(nums):
    a=list(set(nums))
    return len(a) if len(nums)/2>len(a) else len(nums)/2



