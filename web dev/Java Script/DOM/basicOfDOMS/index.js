// //seleting in html
// // let x = document.querySelectorAll("h1");
// // console.log(x);

// // let v = document.querySelectorAll(".yes");
// // console.log(v);



// //changing color 
// let v= document.querySelector("h1");
// v.style.color = "blue";

// v.style.backgroundColor = "green";
// v.style.fontFamily = "Gill Sans";



// //changing html
// v.innerHTML = "Ranjeet"; // chang the inner html
// // change name after 2 sec
// setTimeout(function() {
//     v.innerHTML = "Hi baby";
// },2*1000);



// //change background after 4 sec
// let x= document.querySelector(".yes");
// setTimeout(function(){
//     x.style.backgroundColor="yellow";

// },4000);


//EventListener : kisi element ko click kro ya element se mouse se hover kro , ya for element se bahar nikalu to kuch changes ho
var x = document.getElementById("yes");
// x.innerHTML = "Ranjeet";
x.style.color="blue";
x.addEventListener("click",function(){
    x.style.backgroundColor="yellow";
})

x.addEventListener("mouseleave",function(){
    x.style.backgroundColor="white";
})

var y = document.getElementById("yes1");
y.addEventListener("mousemove",function(){
    y.style.color = "White";
    y.style.backgroundColor = "blue"
    x.style.color="Green";
})
y.addEventListener("mouseleave",function(){
    y.style.color = "black";
    y.style.backgroundColor = "white"
    x.style.color="black";
})

var z =document.getElementById("yes2");
y.addEventListener("click",function(){
    z.style.color="blue";
    z.style.backgroundColor ="black";
    z.innerHTML="Ranjeet";
})

z.addEventListener("mouseover",function(){
    z.style.color="black";
    z.style.backgroundColor ="yellow";
    z.innerHTML="Ranjeet";
})

