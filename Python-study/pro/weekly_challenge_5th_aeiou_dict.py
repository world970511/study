#위클리 챌린지 5주차 모음사전
#https://programmers.co.kr/learn/courses/30/lessons/84512
def solution(word):
    answer = 0
    dic={'A':1,'E':2,'I':3,'O':4,'U':5}#AEIOU가 의미하는 숫자
    n=[0,5,25,125,625]#위치에 따른 값(5진법)
    for i,w in enumerate (word):
        answer+=sum(n[0:5-i])*(dic[w]-1)+dic[w]
        """
        예시:
        1) 'I'==(0+5+25+125+625)*(3-1)+3 =1563
        2) 'AE'=={(0+5+25+125+625)*(1-1)+1}+{(0+5+25+125)*(2-1)+2}=158
        """
    return answer
print(solution("AAAE"))