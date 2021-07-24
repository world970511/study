def solution(answers):
    people=[[1,2,3,4,5]*8,[2,1,2,3,2,4,2,5]*5,[3,3,1,1,2,2,4,4,5,5]*4]#각 리스트의 크기를 40으로 동일하게 맞춘다
    answer = []
    print(len(answers))
    if len(answers)<=40:#40보다 작을 경우
        for i in range(0,3):
            p=people[i][:len(answers)]#수포자 리스트의 크기를 답 리스트에 맞춰 슬라이싱
            answer.append([i+1,con(p,answers)])#비교 후 [수포자 명단,맞춘 답안 개수]로 리스트 만들어서 추가
    else:#40보다 클 경우
        for i in range(0,3):
            if len(answers) % 40 == 0:#답 리스트의 길이가 40으로 완전히 나누어 떨어질 경우
                p = (people[i] * (len(answers) // 40))#딱 답 리스트의 길이 만큼 리스트를 늘린다
            else: #40으로 완전히 나누어 떨어지지 않을 경우
                p = (people[i] * ((len(answers) // 40) + 1))[:len(answers)]#답 리스트의 길이보다 40 개 더 많게 늘린 다음 크기만큼 슬라이싱
            answer.append([i+1,con(p, answers)])#비교 후 [수포자 명단,맞춘 답안 개수]로 리스트 만들어서 추가
    return  [k for k, v in dict(answer).items() if max(dict(answer).values()) == v]
            #answer을 딕셔너리로 만든 다음 리스트 컴프리핸션을 사용하여 값의 최대값과 같은 것을 넣고, 그 키만 뽑아 반환한다

def con(p, a):#반복되는 곳(비교)은 함수를 사용하여 묶어둔다
    c = 0
    for i in range(0, len(p)):
            if p[i] == a[i]: c += 1
    return c

print(solution([3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5]))