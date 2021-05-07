def solution(cacheSize, cities):
    answer = 0
    cache = []
    for i in cities:
        i=i.lower()#대소문자 상관하지 않는다 했으니 도시명 전부 소문자로 변경
        if not i in cache:#캐시 안에 도시명이 없을 경우
            if len(cache) < cacheSize:#캐시가다 차지 않았을 경우
                cache.append(i)#새로운 도시명을 입력한다
                answer += 5
            else:
                if cacheSize!=0:# 정해진 캐시 사이즈가 0 이 아니고 캐시가 다 차 있을 경우
                    cache.pop(0)#캐시에 가장 먼저 들어온 도시명을 내보낸다
                cache.append(i)  # 새로운 도시명을 입력한다
                answer += 5
        else:#캐시 안에 도시명이 있을 경우
            if cacheSize != 0:  # 정해진 캐시 사이즈가 0 이 아닐 경우
                cache.pop(cache.index(i))#도시명이 담긴 캐시를 내보내고 새로운 것을 입력한다.
                cache.append(i)
                answer+=1
            else:#정해진 캐시 사이즈가 0일 경우
                cache.append(i)  # 새로운 도시명을 입력한다
                answer += 5
    return answer

cacheSize=0
cities=["Jeju", "Pangyo", "NewYork", "newyork","LA"]
print(solution(cacheSize,cities))
