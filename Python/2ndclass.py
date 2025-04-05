# escape sequence (chaning of normal flow of code)
# \t (create a tab ,8 spaces by default)
# \n (change the line)
#\" content\"  <- for printing double quote
print("My name is  \"Ahsan\" ")    
# 'Ahsan' <- for printing single quote
print("My name is 'Ahsan'") # just write string in single quote 'string'
# to print \ in code just write it as double  \\
print("My name is Ahsan \\ and my caste is Talpur") # use double \\ to print one \ slash
print("my name is ahsan / and my caste is talpur") # to print single backward slash just write it once
# string formating 
# to leave the space for any data and pass those data in parameter
print("my name is {} and my caste is {}".format("Ahsan","Tlpur"))  #old way
print("Im {} and my religion is {} ,Alhamdullilah and im {} years old".format("pakistani",'Islam',20))
# in formating we can also intialize the value of variable
name = 'Raza'
age = 20   # string foemating aslo take number
studentOf = 'computer science'
print(f"My name is {name} and my age is {age} and im student of {studentOf}") # use f word before print to tell compiler that im 
nic = 2334-5667-7865
phone_No = 39438433
print("my name is Ahsan and my nic no is {nic} and my mobile nomber is {phone_No}")
# formating otherwise it print as it is

# String indexing (acessing elements of sequence using [] (indexing operator,))
# [start : end : step]
# string is collection / array of character
name = "Ahsan Raza talpur"
print(name[0]) #starting index
print(name[0:7]) # starting and end index
print(name[6:9:2]) # starting , end index and step
number = "3445_5654_4545"
print("with starting ,ending and staping index",number[1:8:2])
# in case if we dont describe starting index python by default start from 0 index
# in case if we dont describr end index python by default run till string end
# in case if we dont describe the step index so python by default decribe as 1 step
print("skiping start index",number[:3:2])
print("skiping step index",number[::2])
print(number[::])
print(number[:])
 # print(number[:::]) syntax error
nuu = "1234567"
print(nuu[0:4]) # staring index start from 0  and  ending index start from 1
print("-ve direction :",nuu[-5:-1:2]) # opposite direction  76543 here staping index must be +ve
print("+ve direction :",nuu[0:])
print(nuu[::-1])




