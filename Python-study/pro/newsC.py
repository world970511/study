import re
import math

def count(w1, w2):
    c = [len(w1 + w2), 0]
    if len(w1) > len(w2):
        for i in w2:
            if i in w1:
                w1.pop(w1.index(i))
                c[1] += 1
    else:
        for i in w1:
            if i in w2:
                w2.pop(w2.index(i))
                c[1] += 1
    print(c)
    return c

def solution(str1, str2):
    str1=str1.upper()
    str2 = str2.upper()
    w1=[]
    w2=[]
    for i in range(1,len(str1)):
       if re.match('[가-힣A-Z]',str1[i-1])!=None and re.match('[가-힣A-Z]',str1[i])!=None:
            w1.append(str1[i-1]+str1[i])
    for i in range(1, len(str2)):
        if re.match('[가-힣A-Z]', str2[i-1]) != None and re.match('[가-힣A-Z]', str2[i])!=None:
            w2.append(str2[i-1] + str2[i])
    print(w1,w2)
    if w1==[] and w2==[]:
        return 65536
    else:
        c=count(w1,w2)
        return math.trunc((c[1]/(c[0]-c[1]))*65536)



print(solution('aa1+aa2','AAAA12'))