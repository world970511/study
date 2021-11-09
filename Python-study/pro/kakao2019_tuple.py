#카카오 2019 겨울 인턴십 -튜플
#https://programmers.co.kr/learn/courses/30/lessons/64065?language=python3ㅅ옹
import re
def solution(s):
    answer = []
    # 문자열 앞의 {{ 과}}를 제거하고 숫자가 아닌 나머지 N으로 변경 후 '},{' 인 NNN으로 split
    s_li=re.sub('[^0-9]','N',s[2:-2]).split('NNN')
    if len(s_li)==1:#리스트 길이가 1일 때
        return list(map(int,s_li))#문자열을 숫자로 변환 후 리턴
    else:
        s_li=sorted(s_li,key=lambda x: len(x))#문자열 길이로 정렬
        for s in s_li:
            li=s.split('N')#1N2N3 등으로 변환된 문자열을 N으로 split
            plus=set(li)-set(answer)#변수 plus에 차집합인 문자 저장
            answer+=list(plus)#정답 리스트에 추가
    return list(map(int,answer))#문자열을 숫자로 변환 후 리턴

if __name__ == '__main__':
    li=["{{2},{2,1},{2,1,3},{2,1,3,4}}","{{1,2,3},{2,1},{1,2,4,3},{2}}",
          "{{20,111},{111}}","{{123}}","{{4,2,3},{3},{2,3,4,1},{2,3}}"]
    for i in li:
        print(solution(i))