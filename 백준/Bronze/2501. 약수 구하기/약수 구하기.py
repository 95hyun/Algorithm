N, K = map(int, input().split())

yak = []
for i in range(1, N+1) :
    if N % i == 0 :
        yak.append(i)

if len(yak) < K :
    print(0)
else :
    print(int(yak[K-1]))