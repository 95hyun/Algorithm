n, m = map(int, input().split())
board = [input().strip() for _ in range(n)]

max_side = min(n, m)
found = False

for l in range(max_side, 0, -1):
    for i in range(n - l + 1):
        for j in range(m - l + 1):
            top_left = board[i][j]
            top_right = board[i][j + l - 1]
            bottom_left = board[i + l - 1][j]
            bottom_right = board[i + l - 1][j + l - 1]
            
            if top_left == top_right == bottom_left == bottom_right:
                print(l * l)
                found = True
                break
        if found:
            break
    if found:
        break

if not found:
    print(1)