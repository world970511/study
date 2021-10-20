#프로그래머스 SUMMER/WINTER CODING 2018 방문 길이
#https://programmers.co.kr/learn/courses/30/lessons/49994
def solution(dirs):
    leng=[[0,0]]
    for d in dirs:#이동
        if d=='U'and leng[-1][1]<5:#y값이 5보다 작을 때 위로 이동
           leng.append([leng[-1][0],leng[-1][1]+1])
        elif d=='D'and leng[-1][1]>-5:#y값이 -5보다 클 때 아래로 이동
            leng.append([leng[-1][0], leng[-1][1] - 1])
        elif d=='R' and leng[-1][0]<5:#x값이 5보다 작을 때 오른쪽으로 이동
            leng.append([leng[-1][0]+1,leng[-1][1]])
        elif d=='L' and leng[-1][0]>-5:#x값이 -5보다 작을 때 왼쪽으로 이동
            leng.append([leng[-1][0] - 1, leng[-1][1]])

    answer=[]
    for l in range(1,len(leng)):#[[-1,-2],[-1,-3]]과 [[-1,-3],[-1,-2]]처럼 같은 길이지만 좌표 위치가 다른 경우 처리
        str1=''.join(list(map(str,leng[l-1]+leng[l])))
        str2=''.join(list(map(str,leng[l]+leng[l-1])))
        if str1 in answer or str2 in answer:pass
        else:answer.append(str1)

    return len(answer)

print(solution("ULURRDLLU" ))