#월간코드첼린지_2번 문제
def solution(s):
    str = list(s)
    r1 = ['[', '(', '{']
    r2 = [']', ')', '}']
    l = []
    ans = 0

    for i in range(0, len(str)):
        st=""
        st1 = ""
        st2 = ""
        if i > 0:
            f=l[0]
            l = l[1:]
            l.append(f)
            st="".join(l)
        else:
            l = str
            st="".join(l)

        for i2 in st:
            if (i2 in r1 or i2 in r2):
                st += i2
            else:
                st2 += '0'

            st = st.replace("{}", "")
            st = st.replace("[]", "")
            st = st.replace("()", "")

        a = (len(st2) == len(l))

        if st == "" and a == 0:
            ans += 1
        elif st == " " and a == 0:
            ans += 1

    return ans

s="[](){}"
print(solution(s))