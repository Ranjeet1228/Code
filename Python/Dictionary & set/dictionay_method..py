info= {
    "name": "Ranjeet upadhyay",
    "Language" : ["C","Java","python","HTML","CSS"],
    "Today_topic" : ("dictionary","Sets"),
    "age": 21,
    "is_adult": True
}

print(info.keys()) # dict_keys(['name', 'Language', 'Today_topic', 'age', 'is_adult'])
print(info.values())  #dict_values(['Ranjeet upadhyay', ['C', 'Java', 'python', 'HTML', 'CSS'], ('dictionary', 'Sets'), 21, True])

#type casting
print(list(info.keys())) #['name', 'Language', 'Today_topic', 'age', 'is_adult']
print(tuple(info.keys())) #('name', 'Language', 'Today_topic', 'age', 'is_adult')

#length of dictionay
print(len(info.keys())) # 5
print(list[info.items()])


print()
print(info.get("name")) # if name not present it return null
print(info["name"]) # if name not present it return error

City ={"City": "buxar"}
info.update(City)

print(info)
