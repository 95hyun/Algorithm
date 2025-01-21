import sys

def triangle (x, y, z) :

  a = 0
  b = 0
  c = 0

  if x > y and x > z :
    c = x
    a = y
    b = z
  elif y > x and y > z :
    c = y
    a = x
    b = z
  elif z > x and z > y :
    c = z
    a = x
    b = y

  if a ** 2 + b ** 2 == c ** 2 :
    return "right"
  else :
    return "wrong"


data = sys.stdin.read().splitlines()

for i in range(len(data) - 1) :
  x, y, z, = map(int, data[i].split())
  print(triangle(x, y, z))
