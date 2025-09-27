def sort(a,left,right):
    if(left>=right): return
    mid = int((left+right)//2)
    sort(a,left,mid)
    sort(a,mid+1,right)

    merg(a,left,mid,right)



def merg(a,left,mid,right):

    l=[]
    r =[]
    for el in range(left,mid+1):
        l.append(el)
    
    for el in range(mid+1,right):
        r.append(el)
    
    i =0
    j=0
    k=mid+1
    while(j<=len(l) and k<len(r)):
        if(l[j]<r[k]):
            a[i]=l[j]
            i+=1
            j=j+1
        else:
            a[i]=r[k]
            i+=1
            k+=1
    while j<len(l):
        a[i]=l[j]
        i+=1
        j+=1
    while j<len(r):
        a[i]=r[k]
        i+=1
        k+=1

list =[24,45,78,41,28]
sort(list,0,len(list)-1)
print(list)