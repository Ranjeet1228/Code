// Object is kind of map / dictionary where we have key-value pairs
var details = ["Ranjeet", 21, 75, false];
//object creation
let obj ={
    name: "Ranjeet",
    age: 24,
    percentage: 75.5,
    isMarried : false
};

let car={
    name : "Honda city",
    milege: 25,
};
console.log(obj);

console.log(obj.isMarried);

console.log(obj['name']);


for(const key in obj){
    console.log(key, obj[key]);
}