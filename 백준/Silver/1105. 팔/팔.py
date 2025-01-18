L, R = input().split()

count = 0

if len(L) == len(R) :
    for l_digit, r_digit in zip(L, R):
        if l_digit != r_digit:
            break
        if l_digit == '8':
            count += 1
            
print(count)