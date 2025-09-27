function fun(ele){
    if(ele%2 ==0){
        return true;
    } else return false;
}

let arr = [1,2,5,7,4,7];
console.log(arr);

let brr = arr.filter(fun);
console.log(brr);


let crr = arr.filter(function(ele){
    if(ele%2!=0) return true;
    else return false;
})

console.log(crr);
console.log(arr);

let drr = arr.filter((ele)=>{
    if(ele%2==0) return true;
    else return false;
});

console.log(drr);


let err = arr.filter((ele)=> (ele%2==0));
console.log(err);