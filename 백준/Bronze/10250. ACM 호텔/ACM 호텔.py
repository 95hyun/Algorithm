import sys

data = sys.stdin.read().splitlines()
T = int(data[0])

for i in range(T) :
    H, W, N = map(int, data[i + 1].split())
    
    floor = N % H if N % H != 0 else H
    room = (N - 1) // H + 1
    
    print(f"{floor}{room:02d}")