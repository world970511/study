T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T+1):
    n=int(input())
    box = list(map(int, input().split()))
    box.sort()
    for i in range(0,n):
        box[0]+=1
        box[-1]-=1
        box.sort()
    print('#{} {}'.format(test_case,box[-1]-box[0]))
# 아니 진짜 이거 기준이 뭐야
