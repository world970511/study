T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T+1):
    n=int(input())
    #100을 기준으로 리스트를 나눈다
    li = [list(map(int, input().split())) for i in range(100)]
    max_list=[]
    right,left=[0,0]
    for y in range(100):
        m1=m2=0#행,렬 max 저장 변수
        left += li[y][y]#좌측 대각선
        right += li[y][99 - y]#우측 대각선
        for x in range(100):
            m1+=li[y][x]
            m2+=li[x][y]
        max_list+=[m1,m2]
    max_list+=[left,right]
    max_list.sort()
    print('#{} {}'.format(test_case,max_list[-1]))