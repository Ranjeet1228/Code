str1 = "this is a string"
str2 ='this is second string'
str3 = """This is third string"""
print(str1)
print(str2)
print(str3)

# for next line
str1 = "this is a code in which we use \nfor next line"
print(str1)
str2 = "this is code to use space (tab)\t in this so print "
print(str2)
#

#concatination
str1= "Ranjeet"
str2 = " upadhyay"
print(str1+str2) # this will print Ranjeet upadhyay

print(len(str1)) # this print length  of string str1
print(len(str2)) # this will print length of string str2
print(str1[2]) # this print charcter at indext 2 which is n

# slicing
print(str1[0: 3]) # this print character at 0 1 2
print(str1[ :4]) #this print character from start(0) to 3
print(str1[1:]) #this print chracter from 1 to end

# negative indexing
# R  a  n  j  e  e  t
# -7 - 6 -5 -4 -3 -2 -1     <- this is negative indexing
print(str1[-7:-1]) # this print from -7 to -1

