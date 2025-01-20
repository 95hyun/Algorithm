import sys

input = sys.stdin.read
data = input().splitlines()

for i in range(len(data)) :
    print(str(data[i]))