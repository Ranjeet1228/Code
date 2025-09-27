age = int(input("Enter the age of person:- "))
gender = input("Enter M for male and F form female:- ")

if (gender ==  "M"):
    if(age>=65):
        print("Eligible for concession")
    else:
        print("Not eligible for concession")
elif(gender  =="F"):
    if(age >=60):
        print("Elegible for concession")
    else:
        print("Not eligible for concession")
else:
    print("Not Eligible for Concession")