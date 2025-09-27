def part(a,low,high):
    pivot = a[high]
    i = low - 1
    for j in range(low,high):
        
        if a[j]<=pivot:
            i+=1
            a[i],a[j] = a[j],a[i]

    a[i+1],a[j] =a[j],a[i+1]
    return i+1

def sort(a,low,high):
    if(low>=high):
        return
    pi = part(a,low,high)

    sort(a,low,pi-1)
    sort(a,pi+1,high)


list =[24,45,78,41,28]
sort(list,0,len(list)-1)
print(list)