#카카오2018- 방금그곡
#https://programmers.co.kr/learn/courses/30/lessons/17683
def solution(m, musicinfos):
    answer = {}
    #기억한 멜로디에서 문제가 될 요소 변경
    m=m.replace('C#','c').replace('D#','d').replace('F#','f').replace('G#','g').replace('A#','a')
    for minfo in enumerate(musicinfos):
        li=minfo.split(',')#,로 문자열 리스트 분리
        h1,m1=li[0].split(':')#재생 시작 시간
        h2, m2 = li[1].split(':')#재생 종료 기간
        t=(int(h2)-int(h1))*60+int(m2)-int(m1)#재생 시간
        #악보에서 문제가 될 요소 변경
        li[-1]=li[-1].replace('C#','c').replace('D#','d').replace('F#','f').replace('G#','g').replace('A#','a')
        if m in (li[-1]*1439)[:t]:#기억한 멜로디가 재생된 곡 안에 있을 경우
            """
            li[-1]*1439[:t]->문자열 li[-1]를 1439(악보의 최대 길이, 곡의 길이가 1일 수도 있어서 최대 길이 곱함)반복시킨후 재생 시간 길이만큼 자른 것
            """
            if t not in answer:#동일한 시간을 갖는 키가 없을 경우 딕셔너리에 추가
                answer[t]=li[2]
    if answer=={}: return "(None)"#딕셔너리가 비어 있을 경우 (None)리턴
    else:return sorted(answer.items(),key=lambda item: int(item[0]),reverse=True)[0][1]#딕셔너리가 차 있을 경우 재생 시간이 긴 순으로 정렬 후 제일 앞의 곡명 리턴

print(solution("AB#C",["12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF","14:00,14:14,HELLO2,CDEFGAB"]))