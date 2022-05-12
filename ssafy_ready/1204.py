T = int(input())
for t in range(1, T + 1):
    n = input()
    grade_cnt = [0] * 101  # 인덱스가 점수. idx=1이 1점을 받은 인원수
    mymax = 0  # 가장 많은 인원 수
    grade = 0  # 그 인원수가 있던 인덱스 번호 => 점수
    arr = list(map(int, input().split()))  # 각 값은 100이하, 개수는 1000개
    for i in range(len(arr)):
        grade_cnt[arr[i]] += 1
    for x in range(1, len(grade_cnt)):
        if mymax <= grade_cnt[x]:
            mymax = grade_cnt[x]
            grade = x

    print('#{} {}'.format(t, grade))
