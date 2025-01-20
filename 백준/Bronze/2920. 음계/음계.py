numbers = list(map(int, input().split()))

sortNumbers = sorted(numbers)
reverseNumbers = sorted(numbers, reverse = True)

if numbers == sortNumbers :
    print("ascending")
elif numbers == reverseNumbers :
    print("descending")
else :
    print("mixed")