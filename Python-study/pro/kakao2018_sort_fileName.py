#파일명 정렬
#https://programmers.co.kr/learn/courses/30/lessons/17686?language=python3
import re;
def solution(files):
    head=dict([[i,re.findall('[a-zA-Z-. ]+',h)[0]]for i,h in enumerate(files)])#정규표현식을 사용하여 head분리
    num=dict([[i,re.findall('[0-9]+',n)[0]]for i,n in enumerate(files)])#정규표현식을 사용하여 숫자 분리
    head=sorted(head.items(), key=lambda item: item[1].lower())#head를 소문자로 변경하여 정렬

    index=[]
    i=0

    while(i<len(head)):
        same = head[i][1].lower()
        if i<len(head)-1 and same==head[i+1][1].lower() :#이전 것과 동일한 head가 있을 경우
            n_l={}
            for i2 in range(i,len(head)):
                if head[i2][1].lower()==same:#동일한 head 있을 경우
                    n_l[head[i2][0]]= num[head[i2][0]]#딕셔너리에 저장
                    if i2==len(head)-1:#모두 다 동일할 경우
                        index += dict(sorted(n_l.items(), key=lambda item: int(item[1]))).keys()#숫자에 따라 정렬하고 종료
                        i += len(n_l)
                        break
                else:#동일하지 않은 head가 있을 경우
                    index+= dict(sorted(n_l.items(), key=lambda item: int(item[1]))).keys()#저장된 딕셔너리를 정렬시켜 저장
                    i+=len(n_l)
                    break
        else:#이전 것과 head가 동일하지 않을 경우
            index+=[head[i][0]]#이번 것을 저장하고 다음으로 이동
            i+=1
    return  [files[a] for a in index]#정렬된 인덱스 리스트에 따라 파일 리스트 정렬하고 반환

print(solution( ["img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]))