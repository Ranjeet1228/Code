// callback fn is a function which pass into a function
// function product(a,b,c){
//     return a*b*c;
// }

// function fun(x,y){
//     console.log(x-7);
// }

// console.log(product(2,3,4));
// fun(product(3,8,9),7);


function product(a,b,c){
    return a*b*c;
}

function fun(x,y){
    console.log(x(3,9,4)-7);
}

console.log(product(2,3,4));
fun(product,7);