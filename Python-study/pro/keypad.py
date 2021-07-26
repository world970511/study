def solution(numbers, hand):
    answer = ''
    pad = {'1': (0, 0), '2': (0, 1), '3': (0, 2), '4': (1, 0), '5': (1, 1), '6': (1, 2), '7': (2, 0),
           '8': (2, 1), '9': (2, 2), '*': (3, 0), '0': (3, 1), '#': (3, 2)}#패드 위치를 기록한 딕셔너리
    numbers=list(map(int,''.join(map(str,numbers))))#숫자들을 문자열 리스트로 변경
    l=['*']#왼손 이동
    r=['#']#오른손 이동
    for i in numbers:
        num=str(i)#i를 문자열로 변경
        if num in ['1','4','7']:#1,4,7일 때 'L'을 넣고 왼손 이동 리스트에 추가
            answer+='L'
            l.append(num)
        elif num in['3','6','9']:#3,6,9일 때 'R'을 넣고 오른손 이동 리스트에 추가
            answer+='R'
            r.append(num)
        else:#abs-절대값 함수
            #왼손의 위치-입력된 숫자의 위치
            left=abs(pad[l[-1]][0]- pad[num][0]) + abs(pad[l[-1]][1]- pad[num][1])
            # 오른손의 위치-입력된 숫자의 위치
            right=abs(pad[r[-1]][0]- pad[num][0]) + abs(pad[r[-1]][1]- pad[num][1])

            if left<right:#왼손의 위치-입력된 숫자의 위치 <오른손의 위치-입력된 숫자의 위치 일때 'L'을 넣고 왼손 이동 리스트에 추가
                answer += 'L'
                l.append(num)
            elif left>right:#왼손의 위치-입력된 숫자의 위치 <오른손의 위치-입력된 숫자의 위치 일때 'R'을 넣고 오른손 이동 리스트에 추가
                answer += 'R'
                r.append(num)
            else:#서로 같을 경우
                answer+=hand[0].upper()#오른손잡이인지 왼손잡이인지 확인한 후 그에 맞춰 이동리스트에 추가
                if answer[-1]=='R':r.append(num)
                else: l.append(num)
    return answer

print(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5],"right"))