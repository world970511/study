def solution(prices):# 프로그래머스 주식 문제
    # 최대한 O(N)을 만들어야 하는 문제(==O(n^2) 에서 상수를 최대한 줄이기)
    # POP(), 슬라이싱 등을 최대한 줄여야 함.
    answer = []
    for i in range(0,len(prices)-1):#0번째 요소부터 맨 끝의 두번째 요소까지 반복
        c=0#카운트를 위한 함수
        for i2 in range(i+1,len(prices)):#i의 다음부터 끝까지 반복
            if prices[i2]<prices[i]:#가격이 내려갈 경우
                c=i2-i#c를 i2-i로 변경하고 break
                break
            else:c+=1
        answer.append(c)#가격이 떨어지지 않을 경우 카운트한 그대로
    answer.append(0)#끝의 값은 무조건 0이므로 끝에 추가한다
    return answer
#*****최대한 O(n)에 가깝게 짜지 않으면 효율성 테스트 통과 안됨*****
print(solution([1,2,3,2,3,5,1,7,3,2]))