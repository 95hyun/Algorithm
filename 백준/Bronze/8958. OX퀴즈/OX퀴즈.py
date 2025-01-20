t = int(input())

answer = 0
count = 0

for i in range(t) :
    word = input().strip()
    for j in range(len(word)) :
        if word[j] == "O" :
            count += 1
            answer += 1 * count
        else :
            count = 0
    print(answer)
    count = 0
    answer = 0
    