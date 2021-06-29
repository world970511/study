def solution(board, moves):
#프로그래머스 크레인 인형뽑기 게임
    m=0
    count=0
    stack=[]#인형을 담는 바구니
    while(True):
        a=moves[m]#a==크레인이 작동한 위치
        for i in board:
        #리스트 안의 원소 리스트를 반복한다.
            if i[a-1]!=0: #조건의 원소리스트의 요소들 중 크레인이 작동한 위치-1을 인덱스로 가진 요소가 0이 아닐 경우
                stack.append(i[a-1])#요소를 바구니에 저장
                i[a-1]=0#요소의 값을 0으로 변경
                break #for문에서 탈출(이미 찾는 값을 찾았으니 더 반복하지 않는다)
        if len(stack)>1:#바구니가 비어있지 않을 경우
            if stack[-1]==stack[-2]:#최근에 들어온 값과 그 전의 값이 동일할 경우
                    stack.pop(-1)
                    stack.pop(-1)
                    # 두 값 다 제거한다.
                    count+=2#터트려져 사라진 인형의 개수 카운트
        m+=1#다음 위치로 이동
        if m==len(moves):#moves를 모두 다 돌았을때 while문 종료.
            break
    return count