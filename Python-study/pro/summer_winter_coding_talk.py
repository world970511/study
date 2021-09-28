#영어 끝말잇기
#https://programmers.co.kr/learn/courses/30/lessons/12981
import math
def solution(n, words):
    for i,w in enumerate(words):#단어 리스트 반복
        if i != len(words)-1:#맨 마지막 단어가 아닐 경우
            if w[-1] != words[i + 1][0]:  #지금 단어의 끝이 다음 단어의 시작과 동일하지 않을 경우
                return [((i + 1) % n) + 1, math.ceil((i + 2) / n)]
            else:
                li=words[i + 1:]#다음 단어 모음 리스트 생성
                if w in li:#동일한 단어가 리스트에 있을 경우
                    for i2,w2 in enumerate(li):
                        if w==w2:
                            words[i]='1234'#가장 첫번째로 나온 동일한 단어를 숫자로 변환
                            return [(words.index(w2)%n)+1,math.ceil((words.index(w2)+1)/n)]
                        elif w2[-1]!=li[i2+1][0]:#리스트 내에서 단어의 끝이 다음 단어의 시작과 동일하지 않을 경우
                            return [((i2 + 1) % n) + 1, math.ceil((i2 + 2) / n)]
        else:#문제가 없을 경우
            return [0,0]

print(solution(2, ["abb", "baa", "ccc", "cda", "abb"]))