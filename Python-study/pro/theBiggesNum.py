def solution(numbers):
        str_list=list(map(str, numbers))
        str_list.sort(key= lambda x:x*10**(4-len(x)) ,reverse=True)

        if numbers[0]==0:return "0"
        else: return str(int(''.join(str_list)))

numbers=[3,44,34,30,5,40,4,50]
print(solution(numbers))