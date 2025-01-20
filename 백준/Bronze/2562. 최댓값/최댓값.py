import sys

numbers = list(map(int, sys.stdin.read().splitlines()))

HighNumber = max(numbers)
HighNumberIndex = numbers.index(HighNumber) + 1

print(HighNumber)
print(HighNumberIndex)