N = int(input())

S, M, L, XL, XXL, XXXL = map(int, input().split())

T, P = map(int, input().split())


list = [S, M, L, XL, XXL, XXXL]
sum = 0

for i in list :
  if i % T == 0 :
    sum += i // T
  else :
    sum += i // T + 1


# answer 1
print(sum)

# answer 2
print(N // P, N % P)