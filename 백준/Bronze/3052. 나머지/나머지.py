import sys

data = list(map(int, sys.stdin.read().splitlines()))

removeNumbers = set(num % 42 for num in data)

print(len(removeNumbers))