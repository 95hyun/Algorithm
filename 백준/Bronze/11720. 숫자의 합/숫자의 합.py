import sys

data = sys.stdin.read().splitlines()

N = int(data[0])

answer = 0

for i in range(len(data[1])) :
    answer += int((data[1])[i])
    
print(answer)