#신규 아이디 추천: https://programmers.co.kr/learn/courses/30/lessons/72410
import re
def solution(new_id):
    answer=re.sub("(^\\.)|(\\.$)", "",re.sub('\.{2,}','.',re.sub(r"[^a-z0-9-_.]", "", new_id.lower())))
    if answer=='': answer+='a'
    if len(answer)>15:
        answer=answer[:15]
        if answer[-1]=='.':answer= answer[:-1]
    if len(answer)<3: answer+=answer[-1]*(3-len(answer))
    return  answer

s=str(input('id'))
print(solution(s))