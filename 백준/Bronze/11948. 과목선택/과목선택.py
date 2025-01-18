# 입력 받기
scores = [int(input()) for _ in range(6)]

# 물리, 화학, 생물, 지구과학 점수 (첫 4개)
science_scores = scores[:4]
# 역사, 지리 점수 (마지막 2개)
history_geography_scores = scores[4:]

# 과학 점수 중 상위 3개를 선택
top_three_science_scores = sorted(science_scores, reverse=True)[:3]

# 역사와 지리 중 높은 점수 선택
best_history_geography_score = max(history_geography_scores)

# 총점 계산
total_score = sum(top_three_science_scores) + best_history_geography_score

# 결과 출력
print(total_score)
