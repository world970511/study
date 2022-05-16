T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T+1):
    n=int(input())#회문 길이 입력
    arr =[input().split() for i in range(100)]#글자판 입력
    p=[arr[-1].index('2'),99]#도착지점 인덱스
    for i in range(99,0,-1):
        if p[0]!=0 and arr[p[1]][p[0]-1]=='1':#x!=0 이고 왼쪽이 1 일경우
            while arr[p[1]][p[0]-1]=='1':
                p[0] -= 1
                if p[0]==0:#끝에 다다르면 강제종료
                    break
        elif p[0]!=99 and arr[p[1]][p[0]+1]=='1':#x!=99 이고 오른쪽이 1일 경우
            while arr[p[1]][p[0]+1]=='1':
                p[0]+=1
                if p[0]==99:#오른쪽 끝에 다다르면 강제종료
                    break
        p[1]-=1#1열 위로 이동
    print('#{} {}'.format(test_case,p[0]))