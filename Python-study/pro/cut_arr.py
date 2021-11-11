#월간코드챌린지 시즌 3 - n^2 배열 자르기
#https://programmers.co.kr/learn/courses/30/lessons/87390
def solution(n, left, right):
    arr=[[i for i in range(1,n+1)]]*n#제일 첫번째 행
    ans=[]
    for i in range(left//n,right//n+1):# 구해야 하는 크기만큼만 규칙에 맞게 행을 생성
        ans+=[i+1]*(i)+ arr[0][i:]
    return ans[left%n:left%n+(right-left)+1]#슬라이싱하여 리턴

print(solution(3,2,5))
print(solution(4,7,14))