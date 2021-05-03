str=[]#문자열을 받기 위한 리스트
lenCom=[]#문자열의 길이를 저장하기 위한 리스트
for i in range(0,5):
    str.append(input())#문자열 입력
    lenCom.append(len(str[i]))#입력된 문자열의 길이 저장


ans=[]#각 문자 저장을 위한 리스트
n=max(lenCom)#입력된 문자열의 길이중 최대치를 기준으로 잡는다
for i in range(0,n):#문자열의 최대치를 기준으로 반복
    for i2 in range(0,5):#입력된 5개의 문자열을 반복
        if i >= len(str[i2]):#만약 최대치보다 길이가 작은 문자열일 경우 다음 문자열로 넘긴다
            i2+=1
        else:
            c=str[i2][i]#각 문자열의 요소들을 리스트에 담는다
            ans.append(c)

print(''.join(ans))#공백 없이 붙여서 출력