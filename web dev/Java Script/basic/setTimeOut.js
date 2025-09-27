// // print 1 to 10 but delay with 10sec of dealay
// function h(){
//     console.log("hello");
// }

// function t(){
//     console.log("MEllow");

// }

// setTimeout(h,3*1000)
// setTimeout(t,1*1000);


// // it can be done by this methode also
// setTimeout(function(){
//     console.log("HELLO");
// },2*1000);



// // print 1 to 10 in 10 sec
// // timer
// for(let i =1; i<=10; i++){
//     setTimeout(function(){
//         console.log(i);
//     },i*1000);
// }

// // reverse timer can be made by
// for(let i =10; i>=1; i--){
//     setTimeout(function(){
//         console.log(11-i);
//     }, i*1000);
// }

// using function

// function print(i){
//     console.log(i);
// }

// for(let i =1; i<=30;i++){
//     setTimeout(()=> print(31-i),i*1000);
// }

//print random number till 10 sec
for(let i =0;i<10; i++){
    setTimeout(function(){
        console.log(Math.random());
    },i*1000);
}