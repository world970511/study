#프로그래머스 행렬의 곱셈
#https://programmers.co.kr/learn/courses/30/lessons/12949
def solution(arr1, arr2):
    answer = []#정답을 저장하는 리스트
    for i in range(len(arr1)):#첫번째 행렬의 행의 길이만큼 반복
        li=[]
        for i2 in range(len(arr2[0])):#첫번째 행렬의 열의 길이만큼 반복
            p=0
            for i3 in range(len(arr1[0])):#두번째 행렬의 열의 길이만큼 반복
                p += arr1[i][i3] * arr2[i3][i2]#첫번째 행렬의 행*두번째 행렬의 열
            li.append(p)#곱을 새로운 행에 추가
        answer.append(li)#행을 정답 리스트에 추가
    return answer
print(solution( [[1, 4], [3, 2], [4, 1]],[[3, 3], [3, 3]]))