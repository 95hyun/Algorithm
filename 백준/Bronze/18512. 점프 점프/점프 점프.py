import math

X, Y, P1, P2 = map(int, input().split())


A_pos = P1
B_pos = P2

LCM = math.lcm(X, Y)


while A_pos <= LCM + max(P1, P2):
    B_temp = P2
    while B_temp <= LCM + max(P1, P2):
        if A_pos == B_temp:
            print(A_pos)
            exit()
        B_temp += Y
    A_pos += X

print(-1)