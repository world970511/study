#2018 KAKAO BLIND RECRUITMENT-[1차] 프렌즈4블록
#https://programmers.co.kr/learn/courses/30/lessons/17679

def solution(m, n, board):
    board=[list(i) for i in board]#문자열을 리스트로 변경
    while True:
        c = []
        for i in range(0,m-1):
            for i2 in range(0,n-1):
                if board[i][i2]!='':#[],''으로 변경할 경우 이것도 동일한 것이라 보고 반복함
                    if board[i][i2]==board[i][i2+1]:#양 옆이 같은 경우
                        #위의 값과 밑의 값이 동일하고, 양 옆이 같은 경우
                        if board[i][i2]== board[i+1][i2] \
                            and board[i+1][i2]==board[i+1][i2+1]:
                            c+=[[i,i2],[i,i2+1],[i+1,i2],[i+1,i2+1]]
        if len(c)==0:# 더이상 충족되는 것이 없으면 리턴
            return m*n-sum([len(''.join(i))for i in board])
        else:
            #포함되는 것 제거
            for i in c:
                    board[i[0]][i[1]]=''

            # 블록을 아래로 이동
            while True:
                moved = 0
                for i in range(m - 1):
                    for i2 in range(n):
                        if board[i][i2] and board[i + 1][i2] == '':
                            board[i + 1][i2] = board[i][i2]
                            board[i][i2] = ''
                            moved = 1
                if moved == 0:
                    break

print(solution(4,5,["CCBDE", "AAADE", "AAABF", "CCBBF"]))
print(solution(6,6,["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]))