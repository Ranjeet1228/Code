num =(12,13,45,65,65)
i=0
nums=-1
while(i<len(num)):
    if(num[i]==65):
        nums=i
        break
    i+=1

print(nums)