# 테스트 케이스 수 입력
T = int(input())

# 결과 저장 리스트
results = []

# 각 테스트 케이스 처리
for _ in range(T):
    a, b, c = map(int, input().split())
    count = 0
    
    # 완전 탐색으로 모든 경우의 수 확인
    for x in range(1, a + 1):
        for y in range(1, b + 1):
            for z in range(1, c + 1):
                if (x % y == y % z == z % x):  # 조건을 만족하면 카운트 증가
                    count += 1
    
    # 결과 저장
    results.append(count)

# 결과 출력
for result in results:
    print(result)
