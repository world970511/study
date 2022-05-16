#https://swexpertacademy.com/main/solvingProblem/solvingProblem.do
T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T+1):
    n=int(input())#회문 길이 입력
    arr =[list(input()) for i in range(8)]#글자판 입력
    count=0
    for i in range(8):#열
        for i2 in range(8):#행
            li_x = []
            li_y = []
            if (i2+n)-1<8:#행에 있는 문자열 생성
                li_x=arr[i][i2:i2+n]
            if (i+n)-1<8:#열에 있는 문자열 생성
                li_y=[arr[i+y][i2] for y in range(n)]
            #빈칸이 아니고, 회문이 맞는지 확인
            if li_x!=[] and ''.join(reversed(li_x))==''.join(li_x):
                count+=1
            #빈칸이 아니고, 회문이 맞는지 확인
            if li_y!=[] and ''.join(reversed(li_y))==''.join(li_y):
                count+=1
    print('#{} {}'.format(test_case,count))