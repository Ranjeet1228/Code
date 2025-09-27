var s1=document.getElementById("sq1");

s1.addEventListener("mouseenter",function(){
    s1.style.backgroundColor="green";
    var num = Math.ceil(Math.random()*100);
    s1.innerHTML = `<h1>${num}</h1>`
});
s1.addEventListener("mouseleave",function(){
    s1.style.backgroundColor="white";
    s1.innerHTML = "<h1>1</h1>"
})


//changing color green red blue;
 let s2=document.getElementById("sq2");
 let clr= "green";
    s2.addEventListener("mouseenter",function(){
    if(clr === "green"){
        s2.style.backgroundColor="green";
        clr="red";
    }
     else if(clr==="red"){
        s2.style.backgroundColor="red";
        clr = "blue";
    } else if(clr==="blue"){
        s2.style.backgroundColor="blue";
        clr ="green";
    }
});

s2.addEventListener("mouseleave",function(){
    s2.style.backgroundColor="white";
    
})


//rgb(color)
var s3 = document.getElementById("sq3");
s3.addEventListener("mouseenter",function(){
    let a = Math.ceil(Math.random()*256);
    let b = Math.ceil(Math.random()*256);
    let c = Math.ceil(Math.random()*256);
    s3.style.backgroundColor = `rgb(${a},${b},${c})`;
});

s3.addEventListener("mouseleave",function(){
    s3.style.backgroundColor="white";
});

var s4 = document.getElementById("sq4");

s4.addEventListener("mouseenter",function(){
    let r1 = Math.ceil(Math.random()*256);
    let r2 = Math.ceil(Math.random()*256);
    let r3 = Math.ceil(Math.random()*256);
    s1.style.backgroundColor = `rgb(${r1},0,0)`;
    s2.style.backgroundColor = `rgb(0,${r1},0)`;
    s3.style.backgroundColor = `rgb(0,0,${r1})`;
    s4.style.backgroundColor = `rgb(${r1},${r2},${r3})`
})

s4.addEventListener("mouseleave",function(){
    s3.style.backgroundColor="white";
    s2.style.backgroundColor="white";
    s1.style.backgroundColor="white";
    s4.style.backgroundColor="white";
});

let main = document.getElementById("main");
let csr = document.getElementById("cursor");
main.addEventListener("mousemove",function(details){
  csr.style.left = details.x+"px";
  csr.style.top = details.y+"px";  
})