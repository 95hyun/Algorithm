N, M = map(int, input().split())

numbers = list(map(int, input().split()))

answer = 0

for i in range(2, N+1) :
    for number in numbers :
        if i % number == 0 :
            answer += i
            break

print(answer)