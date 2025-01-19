import sys

input = sys.stdin.read
data = list(map(int, input().splitlines()))

for i in range(1, 31) :
    if i not in data :
        print(i)