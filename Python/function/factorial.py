def fact(n):
    fac =1
    for el in range(1,n+1):
        fac*=el
    return fac 

print(fact(4))