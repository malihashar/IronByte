"""
Basic recursion problems ( april 1st work):
Print number 5 times
Print linearly from 1 to n
Print from n to 1
Print linerlau from 1 to n (but backtrack
Print from n to 1 (by backtrack

"""

def pn(hw,cnt):
   if cnt<=5:
      print(hw)
      pn(hw,cnt+1)



def x(num,start):
   if start<=num:
      print(start)
      x(num,start+1)

def main(num):
    
    if num!=0:
     print(num)
     num-=1
     main(num)
def backhand1(num):
   if num==0:
      return
   backhand1(num-1)
   print(num)
def backhand2(num):
   if num==0:
      return
   print(num)
   backhand2(num-1)
def add(num):
    if num==0:
      return 0
    return num+add(num-1)
def factorial(num):
   if num==0: return 1
   return num*factorial(num-1)
def reverse(my_list):
   num=len(my_list)
   if num==0: return 0
   return my_list[num]+reverse(my_list[num-1])
list=[1,2,3]
pn(5,0)
main(5)
x(5,0)
backhand1(5)
backhand2(5)
print(add(3))
print(factorial(4))
print(reverse(list))