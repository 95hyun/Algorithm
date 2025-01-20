import sys

input = sys.stdin.read
data = input().splitlines()

N, M = map(int, data[0].split())


A = [list(map(int, data[i + 1].split())) for i in range(N)]
B = [list(map(int, data[i + 1 + N].split())) for i in range(N)]


result = []
for i in range(N):
    result.append([A[i][j] + B[i][j] for j in range(M)])


for row in result:
    print(" ".join(map(str, row)))