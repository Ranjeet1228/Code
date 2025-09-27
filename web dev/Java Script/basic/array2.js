
// here variable can be change
arr =[12,23,45,78];
console.log(arr); //[ 12, 23, 45, 78 ]
arr=12; 
console.log(arr); //12


console.log();
console.log();
// brr is initially array so its data type can not be change 
// while the CRUD operation can be performed
const brr = [ 12, 23, 45, 78 ];
console.log(brr);
// brr = 12; // Invalid 
brr.push(23);
console.log(brr);

console.log();
console.log();

crr =["Ranjeet upadhyay", 12,3.3,true];
console.log(crr);


console.log("Concept of 2D array");
arr = [2,2,[1,2,45,56], "Ranjeet"];
console.log(arr);

console.log();

// for of loop
for (const num of arr) {
    console.log(num);
}

console.log();
console.log();
// for each loop
arr.forEach((ele,i) => {
    console.log(ele,i);
});