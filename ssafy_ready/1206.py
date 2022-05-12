# https://swexpertacademy.com/main/code/problem/problemDetail.do
#입출력 주의 백준이랑 또 다름...;;;
T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T+1):
    n=int(input())
    test = list(map(int, input().split()))
    ans = 0
    for i in range(2, len(test) - 2):
        m = max([test[i - 2], test[i - 1], test[i + 1], test[i + 2]])
        if test[i] > m:
            ans += (test[i] - m)
    print('#{} {}'.format(test_case,ans))


