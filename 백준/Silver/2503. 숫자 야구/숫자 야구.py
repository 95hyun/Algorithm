N = int(input())
hint = [list(map(str, input().split())) for _ in range(N)]

answer = 0

for a in range(1, 10) :
    for b in range(1, 10) :
        for c in range(1, 10) :
            counter = 0

            if a == b or a == c or b == c :
                continue

            for arr in hint :
                check = list(arr[0])
                strike = int(arr[1])
                ball = int(arr[2])

                strike_cnt = 0
                ball_cnt = 0

                if a == int(check[0]) :
                    strike_cnt += 1
                if b == int(check[1]) :
                    strike_cnt += 1
                if c == int(check[2]) :
                    strike_cnt += 1

                if a == int(check[1]) or a == int(check[2]) :
                    ball_cnt += 1
                if b == int(check[0]) or b == int(check[2]) :
                    ball_cnt += 1
                if c == int(check[0]) or c == int(check[1]) :
                    ball_cnt += 1

                if strike != strike_cnt :
                    break
                if ball != ball_cnt :
                    break

                counter += 1

            if counter == N:
                answer += 1

print(answer)