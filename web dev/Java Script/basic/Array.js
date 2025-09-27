arr =[112,12,14,41];
console.log(arr); // [ 112, 12, 14, 41 ]

n =arr.length;
console.log(n); //4
arr.push(4); // add at last

for(let i =0; i<arr.length;i++){
    process.stdout.write(arr[i]+" ");
} //112 12 14 41 4
console.log();

arr.pop(); // remove last element
console.log(arr);

arr.unshift(2); // add at 0th place
console.log(arr);

arr.shift(); // remove first element
console.log(arr);