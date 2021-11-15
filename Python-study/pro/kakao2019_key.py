from itertools import combinations

def solution(relation):
    # 각자 유일한 키를 갖고 있는 경우
    ans=[]
    not_only=[]
    for r in range(len(relation[0])):
        li = []
        for low in range(len(relation)):
            if relation[low][r] not in li:#중복되는 것이 없을 경우
                li+=[relation[low][r]]
            else:#중복이 있을 경우
                not_only+=[str(r)]
                break
        if len(li)==len(relation):ans+=[set(str(r))]#속성 1개로 후보키를 구성하는것이 가능한 튜플

    if len(relation[0])==1: return len(ans)#릴레이션의 속성이 1개일 경우

#두개 이상의 속성을 사용하여 후보키를 구성할 경우
    else:
        for i in range(2,len(not_only)+1):#위에서 구한 not_only에 기록된 튜플을 이용한다
            for i2 in list(combinations(not_only,i)):#콤비네이션을 이용하여 가능한 조합 생성
                a=[]
                for i3 in range(len(relation)):#조합에 따라 키 생성
                    st=''.join([relation[i3][int(p)]for p in i2])
                    if st in a:break#중복이 있을 경우 브레이크
                    else:a+=[st]
                if len(a)==len(relation):#후보키로 사용가능한 조합
                    ps=[]
                    for j in ans:#후보키로 사용가능한 조합 중 최소성을 갖지 못하는 조합 제거
                        if j &set(i2)==j:break#조합의 부분집합이 리스트에 있을 경우 추가하지 않음
                        else:ps+=[0]
                    if len(ps)==len(ans):ans+=[set(i2)]
    return len(ans)

print(solution([['a','1','aaa','c','ng'],['b','1','bbb','c','g'],['c','1','aaa','d','ng'],['d','2','bbb','d','ng']]))