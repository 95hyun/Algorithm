t = int(input())



for i in range(t) :
    word = input().strip()
    answer = 0
    count = 0
    for j in range(len(word)) :
        if word[j] == "O" :
            count += 1
            answer += 1 * count
        else :
            count = 0
    print(answer)
    