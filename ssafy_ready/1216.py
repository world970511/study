T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T+1):
    n=int(input())#회문 길이 입력
    arr =[list(input()) for i in range(100)]#글자판 입력
    max_list=[0,0]

    # 행에 있는 회문을 찾는 for문
    for i in range(100):#열
        for i2 in range(100):#행
            li1 = []
            li2 = []
            for i3 in range(i2,100):#한 행/열 내부에 있는 회문 체크
                li1+=arr[i][i3]
                li2 += arr[i3][i]
                if''.join(reversed(li1))==''.join(li1) and len(li1)>max_list[0]:
                    max_list[0]=len(li1)
                if''.join(reversed(li2))==''.join(li2) and len(li2)>max_list[1]:
                    max_list[1]=len(li1)
    print('#{} {}'.format(test_case,max(max_list)))#제일 긴 것 출력