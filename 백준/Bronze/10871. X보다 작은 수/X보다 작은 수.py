import sys

input = sys.stdin.read
data = input().splitlines()
N, X = map(int, data[0].split())
number = map(int, data[1].split())

answer = [str(i) for i in number if i < X]

print(" ".join(answer))