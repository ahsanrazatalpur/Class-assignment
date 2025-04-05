# qno 1 
# a = 15
# b = 25
# sum = a + b
# print("Sum of two number is : ",sum)

# # qno 2
# b = 45
# a = 100
# difference = a - b
# print("Difference of two number are : ",difference)

# # qno 3
# a = 8
# b = 12
# product = a * b
# print("multilpication of two number are ",product)

# # qno4
# a = 56 
# b = 7
# quotient = a / b
# print("quotient of two numbers is  :",+quotient)

# #qno 5
# a = 29
# b = 5
# modulo = a % b
# print("modulo of two number is :",modulo)

# # qno 6
# number1=int(input("please input number 1 : "))
# number2=int(input("please input number 2 : "))
# sum = number1 + number2
# Diff = number1 - number2
# Mul = number1 * number2
# Div = number1 / number2
# Mod = number1 % number2

# print("The sum of two number is :",sum)
# print("The Difference of two number is :",Diff)
# print("The Multilplication of two number is :",Mul)
# print("The Division of two number is :",Div)
# print("The Reminder of two number is :",Mod)

# # #qno 7
# num1 =int(input("please enter 1st number: "))
# num2 =int(input("please enter 2nd number: "))
# num3 =int(input("please enter 3rd number: "))
# average = (num1 + num2 + num3) /3
# print("The average of three numbers is :",average)

# #qno 8
# length = int(input("please enter length :"))
# width =int(input("please enter width :"))
# area = length * width
# print("The area of rectangle is :",area)

# #qno 9
# length = int(input("please enter legth side of square :"))
# perimeter = 4 * length
# print("The perimeter of square is  :",perimeter)
 
# #qno 10
# temincal = 34
# fahrenheit = (temincal*9/5)+32
# print("Temperature in Fahrenheit :",fahrenheit)

# # #qno 11
num = 54321
count = 0
while num > 0:
num //= 10
count += 1
print(count)

# #qno 12
# num = 1234
# product = 1
# while(num > 0)
# product = num % 10
# product = product*num
# num //= 10
# print(product)


#qno 13
# number = 12345
# reverse = 0
# while number>0:
# reverse = number % 10
# number = number // 10
# print(reverse)

# # # qno 14
# # number  = 1221
# str(number)
# if number == number[::-1] :
#     print("Number is Palindrome")
# else :
#     print("Number is not Palindrome")

# # qno15
sum of even odd 
number = 12345
sumofeven = 0
sumofodd = 0

while number > 0:
 digit = number % 10
if digit % 2 == 0:
 sumofeven += digit
else :
 sumofodd += digit 

 number //=10
 print("Sum of even :",sumofeven)
 print("Sum of odd",sumofodd)
 




# # qno16
number = 12345
even = 0
odd = 0
while number > 0:
    digit = number % 10
    if digit % 2 == 0:
     even += digit
    else :
       odd += digit
diff = even - odd
print("the difference of even and odd is:",diff)


# # qno17  check number is armstrong
number  = 123
while(number > 0):
 digit= number % 10
arms += digit ** 3
if arms == number:
 print("Number is armstrog")
else : 
    print("Number is not armstrong")


# # qno18
number = 123
while number > 0:
 digit = number % 10
 binary  += digit % 2
 print(binary)
 number //= 10





# # qno19


# # qno20 smallest number
# # number = 12345
# # print(number[0])



# # qno21
n  = 20 
if n %2 == 0:
 print("Number is even")
else:
    print("Number is odd")
# 

# qno22
# number = 12345     # - * / + %  // 
# reverse = 0
# while number > 0:
#     reverse = number % 10
#     number %= 10
# print(reverse)


# qno23
# a = 100
# p = 50
# r = 4
# n = 1
# t = 2
# a=p(1+r/n) ** nt
# print("Compund Interest is :",a) 

#qno 24
number = 57348
sum = 0
while (number>0): 
  sum += number %10  
  number//=10 
print(sum)

#qno25
# a = 4
# b = 2
# a , b = b ,a
# print(a)
# print(b)