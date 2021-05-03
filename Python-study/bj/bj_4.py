#백준 2523/2446
print(2523)
n=int(input())
for i in range(1,n+1):
    print('*'*i)
for i in range(n-1,0,-1):
    print('*'*i)
print(2446)
n2=int(input())
a=0
for i in range(n2,0,-1):
    print(' '*a,end='')
    print('*'*(2*i-1))
    a+=1
for i in range(1,n2+1,+1):
    a-=1
    if i>1:
        print(' ' * a, end='')
        print('*' * (i*2-1))