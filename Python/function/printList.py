def printList(l,idx=0):
    if(len(l)==idx):
        print(l[0])
        return
    print(l[idx],end=" ")
    printList(l, idx+1)
    
    return

nums =[3,4,54,53,22,22,45]
printList(nums)