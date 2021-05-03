def solution(p, c):
    p.sort()
    c.sort()
    #받은 참가자와 완주한 이들의 이름을 오름차순으로 정렬한다
    c.append('')#완주하지 못한 이 리스트의 끝에 '' 를 추가한다(만약 참가자 리스트의 끝에 빠진 사람이 있을 경우 대비)

    i = 0

    while True:
        if p[i]!=c[i]:#참가자의 요소와 참가하지 못한 이들의 요소가 다를 경우
            answer=p[i]#answer에 참가자 이름을 옮기고 반복문을 멈춘다.
            break
        i+=1

    return answer

#https://programmers.co.kr/learn/courses/30/lessons/42576