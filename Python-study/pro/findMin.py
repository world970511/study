def solution(A,B):
    ans=0
    As=sum(A)
    Bs=sum(B)
    if(As>=Bs):#A 리스트의 총합이 B리스트의 총합보다 크거나 같을 경우
        A.sort(reverse=True)#A리스트를 큰 숫자 순서대로 정렬
        B.sort()#B리스트를 작은 숫자 순서대로 정렬
        for i in range(0,len(A)):
            ans+=A[i]*B[i]
    else:#B리스트의 총합이 A리스트의 총합보다 크거나 같을 경우
        B.sort(reverse=True)#B리스트를 큰 숫자 순서대로 정렬
        A.sort()#A리스트를 작은 숫자 순서대로 정렬
        for i in range(0, len(A)):
            ans += A[i] * B[i]
    print(ans)
    return ans
