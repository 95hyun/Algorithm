starCount = int(input())

for i in range(1, starCount + 1) :
    print(" " * (starCount-i) + "*" * i)