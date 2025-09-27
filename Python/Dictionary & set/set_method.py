nums ={1,2,3,"Ranjeet"}
nums.add(87)
print(nums)

nums.remove(87)
print(nums)

nums.pop()
print(nums)

nums.clear()
print(nums)
print(len(nums))


nums ={1,2,3,"Ranjeet"}
nums1 ={"Ranjeet","Manjeet","Vishal", "Sonu","Monu"}
nums2 = nums.union(nums1)
print(nums2)

nums3 = nums.intersection(nums1)
print(nums3)
