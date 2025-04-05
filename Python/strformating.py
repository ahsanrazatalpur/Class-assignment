# String (collection of character or array of an character) formating
# There are 3 ways to format string
# Method 1 
# by % (old style like C language)  %s for string ,% d for number and %f for any float value
print("My name is %s and im %d years old" % ("Ahsan",20))
print("My caste is %s and i love in %s" %("Talpur","123 Main street"))
print("My mob_number is %d and my sim is %s" %(3113122333,"zong"))
print("My enter class percentage is %f " %(72.79))

# method 2 
# .format() Method
# by using index
print("My name is {}".format("Ahsan Raza"))
print("I love my {} and want want to feel poud my {}".format("Pakistan","country"))
print("my freind name is {} and his age is{}".format("Ghani",21))
print("I got {} in {}  and got about {} percantage".format("A+","Enter_class",72.34))

# by using name placeholder
print("I live in {city}".format(city="Badin"))
print("My name is {name} and my age is {age}".format(name="Ahsan",age=20))
print("My dream to become a {pro}".format(pro="Developer"))
print("i got {marks} in {std} class".format(marks=88.65, std="Enter"))

# method 3
# f-String method (fast and recomended)
caste = "Talpur"
print(f"My caste is {caste}")
name ="Ahsan"
fname="Amir Ali"
print(f"My name is {name} and my fathers name is {fname}")
laptop = "5th generation"
dept = "computer Sciecnce"
print(f"I study in {dept} and i use {laptop}")


#EXERCISE
print("My name is %s and im %d year old" %("Alice",30))

print("pi = %f" %(3.14159))
print("Number = %d" %(42))
print("word = %s" %("Python"))
print("The value of Pi is %f and the number is %d and i love %s" %(3.142334,42,"Python"))

# data = {
#     name : "John",
#     score : 95
# }
# print("%d is and got %d in exam")

fruit = "apple"
pricee = 1.5
quantity = 3
print(f"i love {fruit} and i got {quantity}  in RS {pricee} per piece")
  
print("My name is {} and Im {} Years old .".format("Alice",30))
 
# info = { "city": "New York",
#         "Population" : 842238373}
# print(f"{city} is a very beautiful city and its population is {population}")

city = 'New york'
population = 83878943
print(f"{city} is a v.beautiful city and its population is{population}")

a = 10
b = 20
print(f"The sum of {a} and {b} is 30")
pi = 3.142343
salary = 1000000000
print(f"{pi:.2f} and the salary is {salary:,}")
per=0.34
print(f"The percenatge is {per:.0%}")
sal = 3000000000
print(f"My salary is {sal:,}")  