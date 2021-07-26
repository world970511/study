#백준 카드 2
from collections import deque# 콜렉션 큐 자료구조 사용

n=int(input())
queue = deque([i for i in range(1,n+1)])#1~n까지의 큐 생성
i=1
while len(queue)>1:#큐의 길이가 1보다 크면 반복
    if i%2==1:#위치가 홀수일 때
        queue.popleft()#맨 앞 요소 제거
        i+=1
    else:#위치가 짝수일 때
        queue.append(queue[0])#맨 앞 요소를 맨 뒤로 이동
        queue.popleft()#맨 앞 요소 제거
        i+=1
print(queue[0])
