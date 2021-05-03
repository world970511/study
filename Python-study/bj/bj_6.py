#백준 15596
# 추가로 비어있는 리스트에 값을 넣는 과정까지 추가함!
n=int(input())
list=[]
for i in range(0,n):
    num=int(input())
    list.append(num)
    i+=1
print(sum(list))

def sum(list):
    ans=0
    for i in list:
        ans+=i
    return ans