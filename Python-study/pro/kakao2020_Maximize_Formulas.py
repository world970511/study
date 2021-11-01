#카카오 2020 인턴십- 수식 최대화
#https://programmers.co.kr/learn/courses/30/lessons/67257
from itertools import permutations as permu
import re

def solution(expression):
    answer = []
    combinations =list(permu(['+','-','*'],3))#콤비네이션 조합 생성

    for combination in combinations:#연산자 우선 순위에 맞춰 반복
        num = re.sub('[^0-9]',' ',expression).split(' ')#숫자
        oper = list(re.sub('[0-9]','',expression))#연산자

        for comb in combination:
            while comb in oper:#우선순위에 맞는 연산자
                i = oper.index(comb)#연산자 인덱스
                num[i] = str(eval(num[i] + comb + num[i+1]))#리스트 변경
                del num[i+1]#사용한 수 삭제
                del oper[i]#사용한 연산자 삭제
        answer.append(abs(int(num[0])))#마지막으로 남은 것의 절대값을 저장
    return max(answer)#최대값출력


print(solution("2*2*2*2-2*2*2"))