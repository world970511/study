n=int(input())
list= list(map(int, input().split()))#입력된 문장을 공백을 기준으로 쪼개서 int로 리스트에 입력
b, c = map(int, input().split())#입력된 문장을 공백을 기준으로 쪼개서 int로 리스트에 입력

count=0#각 시험장의 감독인원을 모두 더한 것을 입력받는 변수
for i in range(0,n):
    count+=1#무조건 감독관은 시험장에 한명은 있다
    if(list[i]-b>0):#응시인원-감독관이 감시할 수 있는 인원이 0보다 클 경우
        count+=(list[i] - b)//c#(응시인원-감독관이 감시할 수 있는 인원)/부감독관이 감시할 수 있는 인원의 몫
        if((list[i] - b)%c!=0): count+=1#위의 나머지가 0이 아닐 경우 부감독관이 한명 더 필요하다
print(count)