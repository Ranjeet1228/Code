let arr =[9,24,1,87,26,9]
arr = arr.sort();
console.log(arr); // false sorting

brr = arr.sort((a,b) =>{
    return a-b;
})
console.log(brr);

// arr = arr.sort(function(a,b){
//      return b-a;
// });

arr = arr.sort((a,b)=>{
     return b-a;
});

console.log(arr);