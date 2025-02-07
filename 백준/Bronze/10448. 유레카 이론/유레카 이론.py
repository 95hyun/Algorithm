T = int(input())

K_list = [int(input()) for i in range(T)]

ureka = []
n = 1
while (n * (n + 1)) // 2 <= 1000:  # 1000 이하 삼각수만 저장
    ureka.append((n * (n + 1)) // 2)
    n += 1

for K in K_list :
    isFound = False

    for i in range(len(ureka)) :
        for j in range(i, len(ureka)) :
            for k in range(j, len(ureka)) :
                if ureka[i] + ureka[j] + ureka[k] == K :
                    isFound = True
                    break
            if isFound :
                break
        if isFound :
            break

    if isFound :
        print(1)
    elif not isFound:
        print(0)