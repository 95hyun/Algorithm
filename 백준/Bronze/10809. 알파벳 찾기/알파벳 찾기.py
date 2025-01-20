word = str(input())

alphabet = ("a", "b", "c", "d", "e", "f", "g", "h",
            "i", "j", "k", "l", "m", "n", "o", "p", 
            "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")

answer = ""

for char in alphabet :
    if word.count(char) > 0 :
        if char == "z" :
            answer += str(word.index(char))
        else :
            answer += str(word.index(char)) + " "
    else :
        if char == "z" :
            answer += "-1"
        else : answer += "-1" + " "

print(answer)