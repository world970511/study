# 프로그래머스-정수 삼각형
#https://programmers.co.kr/learn/courses/30/lessons/43105

def solution(triangle):
    for i in range(1,len(triangle)):#열마다 이동
        for i2 in range(len(triangle[i])):#행 내부의 리스트 반복
            if i2==0:#첫번째 열일 경우- 리스트의 첫번째 숫자
                triangle[i][0]+=triangle[i-1][0]
            elif i2==i:#마지막 열일 경우- 리스트의 마지막 숫자
                triangle[i][i2]+=triangle[i-1][i2-1]
            else:#그 사이에 위치한 것은 크기가 큰 것을 배치
                n=triangle[i][i2]
                triangle[i][i2]=max(n+triangle[i-1][i2-1],n+triangle[i-1][i2])
    return max(triangle[-1])#마지막 열의 가장 큰 수 리턴


print(solution([[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [11, 5, 2, 6, 5]]))