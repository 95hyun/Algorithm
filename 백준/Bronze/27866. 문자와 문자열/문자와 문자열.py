import sys

input = sys.stdin.read
data = input().splitlines()

S = str(data[0])
i = int(data[1])

print(S[i-1])