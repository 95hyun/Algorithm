import sys

input = sys.stdin.read
data = input().splitlines()
N = int(data[0])
numbers = list(map(int, data[1].split()))
v = int(data[2])

answer = numbers.count(v)

print(answer)