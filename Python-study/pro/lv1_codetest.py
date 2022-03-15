#https://programmers.co.kr/learn/courses/30/lessons/12977?language=python3
#소수 만들기
from itertools import combinations

def is_prime_number(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

def solution_1(nums):
    li=[sum(i) for i in list(combinations(nums, 3))]
    return sum([1 for i in li if is_prime_number(i)==True ])

#https://programmers.co.kr/learn/courses/30/lessons/68935
#3진법 뒤집기
def change(n, q):
    base = ''
    while n > 0:
        n, mod = divmod(n, q)
        base += str(mod)
    return base[::-1]

def solution_2(n):
    ternary=change(n, 3)
    return sum([(3**i)*int(ternary[i])for i in range(0,len(ternary))])

#https://programmers.co.kr/learn/courses/30/lessons/87389
#나머지가 1이 되는 수 찾기
def solution_3(n):
    for i in range(2,n):
        if (n-1)%i==0:
            return i