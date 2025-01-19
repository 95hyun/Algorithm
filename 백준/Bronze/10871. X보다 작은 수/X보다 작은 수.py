import sys

input = sys.stdin.read
data = input().splitlines()
N, X = map(int, data[0].split())
digitList = map(int, data[1].split())

answer = [str(i) for i in digitList if i < X]

print(" ".join(answer))