#2021 데브매칭 로또의 최고 순위와 최저 순위
#https://programmers.co.kr/learn/courses/30/lessons/77484
def solution(lottos, win_nums):
    rank={6:1,5:2,4:3,3:4,2:5,1:6,0:6}
    count=[0,0]
    for i in range(len(lottos)):
        if lottos[i] in win_nums:
            count[0]+=1
        elif lottos[i]==0:
            count[1]+=1
    return [rank[sum(count)],rank[(count[0])]]

print(solution([44, 1, 0, 0, 31, 25],[31, 10, 45, 1, 6, 19]))
print(solution([0, 0, 0, 0, 0, 25],[38, 19, 20, 40, 15, 25]))
print(solution([45, 4, 35, 20, 3, 9],[20, 9, 3, 45, 4, 35]))