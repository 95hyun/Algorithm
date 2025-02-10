N = int(input())

start = max(1, N - (len(str(N)) * 9))

result = 0

for num in range(start, N):
    decomposition_sum = num + sum(map(int, str(num)))
    if decomposition_sum == N:
        result = num
        break

print(result)