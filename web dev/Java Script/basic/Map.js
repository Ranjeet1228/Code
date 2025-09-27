function twice(ele){
    return 2*ele;
}

function sqr(ele){
    return ele*ele;
}

let arr= [ 1,3,4,5];
console.log(arr);
// for(let i =0; i<arr.length;i++){
//     arr[i]= arr[i]*2;
// }
// console.log(arr); this can be done by

let brr= arr.map(twice);
console.log(brr);


let squ = arr.map(sqr);
console.log(squ);


let cube = arr.map(function(ele){
    return ele*ele*ele;
});
console.log(cube);

let ce= arr.map((ele) =>{
    return Math.log10(ele);
});
console.log(ce);


//or
arr = arr.map(ele=> ele*10);
console.log(arr);
