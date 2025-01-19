import sys

input = sys.stdin.read
data = input().splitlines()

T = int(data[0])

answer = []

for i in range(1, T+1):
    A, B = map(int, data[i].split())
    answer.append(A + B)
    
sys.stdout.write('\n'.join(map(str, answer)) + '\n')