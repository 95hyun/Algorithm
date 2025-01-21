def sosu(num) :
    if num < 2 :
        return False
    else :
        for i in range(2, int(num**0.5) + 1) :
            if num % i == 0 :
                return False
    return True

N = int(input())
numbers = list(map(int, input().split()))
answer = 0

for i in numbers :
    if sosu(i) :
        answer += 1

print(answer)