salary = float(input("Enter the salary:- "))

time = int(input("Enter the time of service:- "))

if(time>=180):
    salary = salary+(salary*.15)
else:
    print("No bonus this time")

print("the salary of the intern:- ",salary)