#2022 카카오 블라인드- 주차요금계산
#https://programmers.co.kr/learn/courses/30/lessons/92341
#아직 초기라 짧거나 신기한 코드가 없음.... 나중에 리펙토링

import re
import datetime
import math

def solution(fees, records):
    #문자열을 리스트로 변경
    records=[re.findall('[a-zA-Z0-9:]+', i) for i in records]

    #차번호:입차-출차 사이 간격의 딕셔너리로 생성
    dic={}
    for i in records:
        if i[1] in dic:
            if type(dic[i[1]][-1])==str:
                diff=datetime.datetime.strptime(i[0],"%H:%M")-datetime.datetime.strptime(dic[i[1]][-1],"%H:%M")
                dic[i[1]][-1]=diff.seconds/60
            else:
                dic[i[1]] += [i[0]]
        else:
            dic[i[1]]=[i[0]]

    #차번호가 작은 순으로 출력해야 함으로 차번호 순으로 정렬
    dic=dict(sorted((dic.items())))


    for i in dic:
        # 마지막까지 출차되지 않은 차들 처리
        if type(dic[i][-1])==str:
            diff = datetime.datetime.strptime("23:59", "%H:%M") - datetime.datetime.strptime(dic[i][-1], "%H:%M")
            dic[i][-1] = diff.seconds / 60
        #누적된 시간 구하기
        s=sum(dic[i])
        #기본 시간보다 작을 경우 기본요금, 아닐 경우 기본요금+추가요금 청구
        if s<=fees[0]:
            dic[i]=fees[1]
        else:
            dic[i]= fees[1]+(math.ceil((s-fees[0])/fees[2]))*fees[3]

    return list(dic.values())



#[14600, 34400, 5000]
print(solution([180, 5000, 10, 600],["05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                                     "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"]))
#[0, 591]
print(solution([120, 0, 60, 591],["16:00 3961 IN","16:00 0202 IN",
                                  "18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"]))
#[14841]
print(solution([1, 461, 1, 10],["00:00 1234 IN"]))