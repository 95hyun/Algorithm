A, B = map(int, input().split())

answer = ""

if A > B :
    answer += ">"
    
if A < B :
    answer += "<"
    
if A == B :
    answer += "=="
    
print(answer)