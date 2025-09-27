// var h= document.querySelector("h1");

// var str ="";
// for(let i =1;i<=5;i++){
//     str+="<h2>Hi, this is Ranjeet</h2>";
// }

// setTimeout(function(){
//     h.innerHTML=str;
// },2000);

/* <div class="card">
            <img src="https://cdn.pixabay.com/photo/2023/05/12/10/47/ai-generated-7988262_1280.jpg">
        </div> */

/* <div class="card">
            <img src="https://pngimg.com/uploads/pokemon/pokemon_PNG111.png">
        </div> */


        var main = document.getElementById("main");

        var arr = [`<div class="card">
            <img src="https://cdn.pixabay.com/photo/2023/05/12/10/47/ai-generated-7988262_1280.jpg">
        </div>`,`<div class="card">
            <img src="https://pngimg.com/uploads/pokemon/pokemon_PNG111.png">
        </div>`, `<div class="card">
            <img src="https://pngimg.com/uploads/pokemon/pokemon_PNG37.png">
        </div>`]
     let str ="";
        for(let i =0;i<52;i++){
            let num = Math.floor(Math.random()*10) %arr.length;
            str+= arr[num];
        }
        main.innerHTML = str;