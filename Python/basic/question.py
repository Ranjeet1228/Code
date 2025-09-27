a=0
b=0
c=0
d=0

ques1 = int(input("ans Question 1:- "))
if(ques1==1):
    a=a+1
    b=b+1
elif(ques1==2):
    c=c+1
    d=d+1
else:
    print("invalid input")

ques2 = int(input("Enter ans of ques2:- "))
if(ques2==1):
    a+=2
elif(ques2==2):
    b+=2
elif(ques2==3):
    c+=2
elif(ques2 ==4):
    d+=2
else:
    print("Invailid input")


ques3 = int(input("Enter ans of ques3:- "))

if(ques3==1):
    c+=4
elif(ques3==2):
    a+=4
elif(ques3==3):
    d+=4
elif(ques3==4):
    b+=4
else:
    print("Invailid")


print(a,b,c,d)