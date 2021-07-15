def solution(bridge_length, weight, truck_weights):
    answer = 0
    run_t = [0] * bridge_length#다리에 올라갈 수 있는 트럭의 수
    while len(run_t):
        answer += 1#시간+1
        run_t.pop(0)#다리 공간 생성
        if truck_weights!=[]:#truck_weights가 비어있지 않은 경우
            if sum(run_t) + truck_weights[0] <= weight:
                run_t.append(truck_weights[0])#트럭 탑재
                truck_weights.pop(0)#트럭이 대기열에서 빠짐
            else:
                run_t.append(0)
    return answer

print(solution(2,10,[7,4,5,6]))