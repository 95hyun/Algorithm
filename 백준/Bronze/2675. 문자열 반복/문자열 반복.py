T = int(input())

for i in range(T) :
    strR, S = map(str, input().split())
    R = int(strR)
    answer = ""
    for j in range(len(S)) :
        char = S[j]
        answer += char * R
    print(answer)
    