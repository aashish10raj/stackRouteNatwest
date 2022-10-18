// Some of the Built-in Browser Object
//    1. Window
//    2. Document
//    3. Screen
//    4. Navigator
//    5. Location
//    6. History

// Window Object

// alert("Hello ! Window ");

// var num=prompt("Enter a value ", " ")
// console.log(num);

// var num1=prompt("Enter First value ", " ");
// var num2=prompt("Enter Second value ", " ")
// console.log(num1+num2);

// var num1=parseInt(prompt("Enter First value ", " "));
// var num2=parseInt(prompt("Enter Second value ", " "));
// console.log(num1+num2);

// var username=prompt("Enter your name", " ");
// console.log(`Welcome ${username}`);

// var res=confirm('Do you want to close window');
// if(res){
//     window.close();
// }

// var res=confirm('Do you want to open window');
// if(res){
//     window.open();
// }

// Document Object

// document.write("JavaScript is very interesting");

// function show(){
//     var username=document.getElementById('username').value;
//     document.write(`Welcome ${username}`);
// }

// function show(){
//     var username=document.getElementById('username').value;
//     document.getElementById('message').innerHTML=`Welcome ${username}`;
    
// }

// function changeColor(colorName){
//     document.body.style.backgroundColor=colorName;
// }

// Screen Object

// console.log(screen.width);
// console.log(screen.height);
// console.log(screen.colorDepth);
// console.log(screen.orientation);

// Navigator Object

// console.log(navigator.platform);
// console.log(navigator.appVersion);
// console.log(navigator.language);
// console.log(navigator.userAgent);

// Location Object

// console.log(location.host);
// console.log(location.protocol);
// console.log(location.port);

// Stop Watch

// setInterval()

// var ref;
// var h=0;
// var m=0;
// var s=0;

// function start(){
    

//    ref= setInterval(()=>{
//         s++;
//         if(s >=60){
//             s=0;
//             m++;
//         }
//         if(m >=60){
//             m=0;
//             h++;
//         }
//         if(h >=24){
//             h=0;
//         }
//         document.getElementById('hour').innerHTML=h;
//         document.getElementById('minute').innerHTML=m;
//         document.getElementById('second').innerHTML=s;
//     },100);
// }
// function pause(){
//    clearInterval(ref);
// }
// function reset(){
//       clearInterval(ref);
//         h=0;
//         m=0;
//         s=0;
//         document.getElementById('hour').innerHTML=h;
//         document.getElementById('minute').innerHTML=m;
//         document.getElementById('second').innerHTML=s;
// }

// Digital Watch

setInterval(()=>{
    var d=new Date();
               document.getElementById('hour').innerHTML=d.getHours();
               document.getElementById('minute').innerHTML=d.getMinutes();
               document.getElementById('second').innerHTML=d.getSeconds();
}, 1000);









































