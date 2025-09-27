# class student:
#     name ="Ranjeet"


# s1=student()
# print(s1.name)
# s1.name = "Manjeet"
# print(s1.name)


#using constructor

class Student:
    def __init__(self, fullname ):
        print(self)
        self.name = fullname

s1 = Student("Ranjeet")
print(s1.name)
print(s1)
