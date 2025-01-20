import sys

data = sys.stdin.read().splitlines()

T = int(data[0])

for i in range(T) :
    print((data[i+1])[0] + (data[i+1])[len(data[i+1])-1])