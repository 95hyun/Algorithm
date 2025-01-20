def gumjeungNumber(a, b, c, d, e) :
    return (a*a + b*b + c*c + d*d + e*e) % 10

numbers = list(map(int, input().split()))

print(gumjeungNumber(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]))