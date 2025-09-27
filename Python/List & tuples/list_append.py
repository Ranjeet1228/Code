list=[2,1,3]
list.append(8) # 2 1 3 8
print(list)

list.sort()
print(list) # 1 2 3 8

list.sort(reverse=True)
print(list) # 8 3 2 1

list.reverse()
print(list) # it reverse the list :- 1 2 3 8

list.insert(1,8) #insert 8 at index 1:- 1 8 2 3 8
print(list)

list.remove(8) #remove first occurence of element :- 1 2 3 8
print(list)

list.pop(3) #it remove element of index i:- 1 2 3
print(list)