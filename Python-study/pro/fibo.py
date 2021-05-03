#프로그래머스 피보나치 수
#2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 
def sol(n):
    ans=0
    fibo = [0, 1]#피보나치 수를 저장할 리스트 fibo[0]=0,fibo[1]=1 이 저장되어 있다.
    if(n<2):#n이 2보다 작을 경우 
        ans=fibo[n]
    else:#n이 2보다 클 경우
        for i in range (2,n+1):
            fibo.append(fibo[i-1]+fibo[i-2])
    #2부터 n+1까지 반복시키며 fibo[i-1]+fibo[i-2]의 값을 리스트의 끝에 추가한다.
    ans=fibo[n]
    answer = ans%1234567
    return answer
    #
 
n=int(input())#n을 입력
print(sol(n))#결과 출력
