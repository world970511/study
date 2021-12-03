#프로그래머스 베스트앨범
#https://programmers.co.kr/learn/courses/30/lessons/42579
def solution(genres, plays):
    record={}#재생 횟수와 장르 이름 저장
    ans=[]#고유번호 저장
    for i,g in enumerate(genres):
        if g in record:record[g].append(plays[i])#장르가 있을 경우 재생횟수를 리스트에 추가
        else:record[g] = [plays[i]]#장르가 없을 경우 딕셔너리에 재생 횟수와 함께 추가

    # 재생횟수를 크기순으로 정렬
    record=dict([(i[0],sorted(i[1],reverse=True)) for i in record.items()])
    # 총 재생 횟수 크기 순으로 장르 정렬
    record= dict(sorted(record.items(), key=lambda item: sum(item[1]),reverse= True))
    print(record)

    for v in record.values():
        if len(v)<2:#재생 횟수 리스트의 크기가 2보다 작을 경우
            print(plays.index(v[0]))
            ans+=[plays.index(v[0])]#재생횟수의 고유번호 리스트에 추가
            plays[plays.index(v[0])] = 'done'#사용된 것은 done으로 변경

        else:
            print(plays.index(v[0]), plays.index(v[1]))
            n1=plays.index(v[0])#리스트에서 가장 큰 재생횟수를 가진 노래의 고유번호
            plays[plays.index(v[0])]='done'#사용된 것은 done으로 변경

            n2=plays.index(v[1])#리스트에서 두번쨰로 큰 재생횟수를 가진 노래의 고유번호
            plays[plays.index(v[1])]='done'#사용된 것은 done으로 변경

            ans+=[n1,n2]#모든 재생 횟수 리스트에 추가

    return ans

print(solution(["classic", "pop", "classic", "classic", "pop"],	[500, 600, 150, 500, 2500]))