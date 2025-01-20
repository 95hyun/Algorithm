H, M = map(int, input().split())

if (M - 45) < 0 :
    if H != 0 :
        print(H - 1, 60 - abs(M-45))
    else :
        print(23, 60 - abs(M-45))
else :
    print(H, M - 45)