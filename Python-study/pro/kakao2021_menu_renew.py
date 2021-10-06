#카카오2021 메뉴 리뉴얼
#https://programmers.co.kr/learn/courses/30/lessons/72411
#리펙토링하기!!!!

from itertools import combinations
def solution(orders, course):
    menu_renew={}
    for order in orders:
        order=sorted(list(order))#순서가 뒤죽박죽인 문자열 정렬
        for co in course:#후보가 2개 이상인 것만 조합
            for c in combinations(order, co):
                menu = ''.join(c)
                if menu in menu_renew:#동일한 키 값이 있을 경o
                    menu_renew[menu]+=1
                else:#동일한 키값이 없을 경우
                    menu_renew[menu] =1

    menu_renew=sorted([i for i in menu_renew.items() if i[1]>1],key=lambda x: len(x[0]))#최소 2명 이상의 손님에게서 주문된 것만 길이순으로 저장

    index=0
    maxlist=[]
    def add(max,maxlist,list):
        for li in list:
            if max[1] == li[1]:
                maxlist.append(li[0])
        return maxlist

    for c in course:#원하는 코스요리 개수만큼 반복
        max=menu_renew[index]#가장 많은 사람이 찾은 조합
        for i in menu_renew[index:]:# 가장 많이 찾은 조합을 찾음
            if c ==len(i[0]):#찾는 조합의 크기와 동일할때
                if max[1]<i[1]:
                    max=i
            else:#찾는 조합의 크기와 동일하지 않을 때
                maxlist=add(max,maxlist,menu_renew[index:])#이전 것에서 가장 많은 사람이 찾은 조합의 개수 체크
                index=menu_renew.index(i)# 다음 코스요리로 이동
                break
        maxlist = add(max, maxlist, menu_renew[index:])

    return sorted(list(set(maxlist)))#혹시 있을 중복 제거

print(solution(	["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"],[2,3,4]))
