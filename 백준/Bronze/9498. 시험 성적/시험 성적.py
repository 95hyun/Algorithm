score = int(input())

answer = ""

if 90 <= score :
    answer += "A"
elif 79 < score < 90 :
    answer += "B"
elif 69 < score < 80 :
    answer += "C"
elif 59 < score < 70 :
    answer += "D"
else :
    answer += "F"

print(answer)