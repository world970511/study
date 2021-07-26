#프로그래머스 더 맵게
import heapq as hp#힙 자료구조를 사용하게 해주는 파이썬 모듈
def solution(scoville, K):
    hp.heapify(scoville)#리스트 힙 자료구조로 변환
    answer = 0
    while len(scoville)>1:#길이가 1보다 클 때만 반복
        min_h = hp.heappop(scoville)#가장 작은 수
        if min_h >=K: return answer#가장 작은 수가 K보다 크거나 같으면 answer반환
        else:
            min_h2=hp.heappop(scoville)#두번째로 작은 수
            hp.heappush(scoville, min_h +min_h2*2)#힙에 가장 작은 수+두번째로 작은수*2 한 값 추가
            answer+=1#카운트
    if sum(scoville)<K: return -1#전체 반복하고도 크기가 K 보다 작으면 -1반환
    else: return answer#아닐 경우 answer 반환
print(solution([1, 9],7))
# 무조건 힙 모듈을 사용해야 하는 문제(안그러면 바로 시간초과)
#min()또한 리스트로 계산해서 효율성이 낮음-> 시간초과