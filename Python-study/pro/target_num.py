#타겟 넘버
#https://programmers.co.kr/learn/courses/30/lessons/43165
def solution(numbers, target):
    tree = [0]
    for i in numbers:
        tmp = []
        for j in tree:
            tmp.append(j+i)
            tmp.append(j-i)
        tree = tmp
    return tree.count(target)

print(solution([1, 1, 1, 1, 50],3))