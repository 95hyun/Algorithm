# 입력 문자열 받기
input_str = input().strip()

# 초기 설정: 화살표는 'A'에서 시작
current_position = 'A'
total_time = 0

# 각 문자를 순서대로 처리
for char in input_str:
    # 현재 위치와 목표 문자의 위치를 계산
    current_index = ord(current_position) - ord('A')
    target_index = ord(char) - ord('A')
    
    # 최소 이동 거리 계산
    clockwise_distance = abs(current_index - target_index)
    counterclockwise_distance = 26 - clockwise_distance
    total_time += min(clockwise_distance, counterclockwise_distance)
    
    # 화살표 위치 업데이트
    current_position = char

# 결과 출력
print(total_time)
