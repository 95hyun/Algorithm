N = int(input())

x = 1
y = 1

while x * y < N :
    if x > y :
        y += 1
    else :
        x += 1

print(x, y)