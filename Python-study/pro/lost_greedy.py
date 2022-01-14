#프로그래머스 체육복
#https://programmers.co.kr/learn/courses/30/lessons/42862
def solution(n, lost, reserve):#조금 무식하게 푼 풀이
    dic=dict([[i,1] for i in range(1,n+1)])#잃어버리거나 여분의 체육복을 가져온 학생이 없다고 할 경우
    for i in range(1,n+1):
        if i in lost:#잃어버린 학생의 경우 -1
            dic[i]-=1
        if i in reserve:#여분의 체육복을 가져온 경우
            dic[i]+=1

    for i in range(1,n+1):
        if i !=n and i !=1:#첫번째 학생이거나 마지막 학생이 아닐 경우
            #앞과 뒤를 확인해서 여분의 체육복을 가진 학생이 있으면 1개를 받아온다.
            if dic[i]==0:
                if dic[i-1]==2:
                    dic[i]+=1
                    dic[i-1]-=1
                elif dic[i+1]==2:
                    dic[i]+=1
                    dic[i+1]-=1
        elif i==n:#마지막 학생일 경우
            if dic[i]==0:
                #앞의 학생이 여분의 체육복을 가져온 것인지 확인
                if dic[i-1]==2:
                    dic[i]+=1
                    dic[i-1]-=1
        elif i==1:#첫번째 학생일 경우
            if dic[i]==0:
                #뒤의 학생이 여분의 체육복을 가져온 것인지 확인
                if dic[i+1]==2:
                    dic[i]+=1
                    dic[i+1]-=1

    return sum([1 for i in dic.items() if i[1]>0])#체육복을 가진 학생만 체크해서 반환

print(solution(5,[2, 4],[1, 3, 5]))#5
print(solution(5,[2, 4],[3]))#4
print(solution(3,[3],[1]))#2

