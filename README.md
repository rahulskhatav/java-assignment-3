```python
val1 = input("Enter a number :")
print("You entered ", val1)




op1 = int(input("First operand : "))
op2 = int(input("Second operand : "))
sum_result = op1 + op2
print("Sum : ", sum_result)





year = int(input("Enter year : "))
leap = 0
if year%4 == 0:
  if year%100 == 0 and year%400 == 0:
    leap = 1
  elif year%100 != 0:
    leap = 1
if leap == 1:
  print("Its a leap year")
else:
  print("Its not a leap year")






def swap(a, b):
  c = a
  a = b
  b = c
  # return the swapped values
  return (a, b)

a = int(input("a = "))
b = int(input("b = "))
# call the swap function
(a, b) = swap(a, b)
print("After swap\na =", a, "b =", b)







a = int(input("a = "))
b = int(input("b = "))
# using tuples to switch values
(a, b) = (b, a)
print("After swap\na =", a, "b =", b)






a = input("Enter character : ")
if len(a) > 1:
  print("Enter only one character.")
else :
  # ord function helps get the ASCII value
  print(f"ASCII value of {a} is {ord(a)}")
  
  
  
  
  
  
  
  
  
import math as m

n = float(input("Enter number : "))
print(f"Square root of {n} is {round(m.sqrt(n),3)}")




import numpy as np

begin_range = 0
end_range = 15
random_number = np.random.rand()*(end_range-begin_range)+begin_range
print(f"Random number = {int(random_number)}")




arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print("1.", arr[6:])
print("2.", arr[:6])
print("3.", arr[2:8])






def valid_triangle(a, b, c):
  # sum of length of 2 sides cannot be less than the third side
  if (a+b < c) or (b+c < a) or (a+c < b): return 0
  else: return 1

def find_area(a, b, c):
  # heron's formula
  s = (a+b+c)/2
  area = m.sqrt(s*(s-a)*(s-b)*(s-c))
  return area

a = float(input("a = "))
b = float(input("b = "))
c = float(input("c = "))
# check for validity of triangle
if bool(valid_triangle) :
  area = find_area(a, b, c)
  print(f"Area = {area}")
else:
  print("Invalid triangle")
  
  
 ```
