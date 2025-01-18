from datetime import datetime

# 현재 UTC 시간 가져오기
utc_now = datetime.utcnow()

# 연도, 월, 일 출력
print(utc_now.year)         # 연도
print(f"{utc_now.month:02}")  # 월 (2자리로 출력)
print(f"{utc_now.day:02}")    # 일 (2자리로 출력)
