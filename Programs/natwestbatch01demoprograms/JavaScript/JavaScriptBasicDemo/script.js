console.log("Welcome to JavaScript");

// Data type
// Primitive Data type

// var str="Rajeev";
// console.log(typeof str);
// console.log(str);

// var num=30;
// console.log(typeof num);
// console.log(num);

// var x=10;
// var y=10
// var z=20

// console.log(x==y); // true
// console.log(x==z); // false
// console.log(typeof(x==y));

// var p;
// console.log(typeof p);
// console.log(p);

// var name=null;
// console.log(typeof name);
// console.log(name);

// Variable

// function f1(){
//     let number=20;
//     console.log(number);
// }
// f1();

// const pi=3.14;
// console.log(pi);
// pi=3.15;

// Conditional Construct

// let x=10;

// if(x%2==0){
//     console.log("Even Number");
// }
// else{
//     console.log("Odd Number")
// }

// var x=5;

// switch(x){
//     case 1:{
//         console.log("Monday");
//         break;
//     }
//     case 2:{
//         console.log("Tuesday");
//         break;
//     }
//     case 3:{
//         console.log("Wednesday");
//         break;
//     }
//     case 4:{
//         console.log("Thursday");
//         break;
//     }
//     default:{
//         console.log("Wrong Option");
//         break;
//     }
// }

// looping construct

// for(let i=0; i<=10; i++){
//     console.log(i);
// }

// Non Primitive Data Type

// Object

// let Person={
//     firstName: "Peter",
//     lastName: "Parker",
//     address:{
//         street:'DownStreet',
//         city:'London',
//     },

//     show(){
//        console.log("This is show function");
//     }
// }
// console.log(Person);
// console.log(Person.firstName);
// console.log(Person.address.city);
// console.log(typeof Person);
// Person.show();

// Arrays

// let fruits=['Apple', 'Banana', 'Cherry', 'Grapes', 'Mango']
// console.log(fruits);
// console.log(fruits[2]);

// let countries=new Array(5);
// countries[0]="India";
// countries[1]="Japan";
// countries[2]="America";
// countries[3]="Russia";
// countries[4]="France";

// console.log(countries[1]);
// console.log(countries);

// let langs=new Array('C', 'C++', 'Java', 'C#', 'Python');
// console.log(langs);
// console.log(langs[2]);

// Jagged Arrays

// let nums=[[10,20], [30,40,50], [60,70], [80,90,100]];
// console.log(nums);

// Function

// Old way

// function f1(){
//     console.log("Hello ! Function");
// }
// f1();

// New way -ES6 Way

// const f2=()=>{
//     console.log("Hello ! World");
// }
// f2();

// const sayHello=(userName)=>{
//     console.log('Hello '+userName);
// }
// sayHello('Rajeev');

// String InterPolation

// const x=10;
// const y=20;

// console.log("The sum of "+x+" and "+y+" = "+(x+y));

// console.log(`The sum of ${x} and ${y} is ${x+y}`);


// const sayHello=(userName,city)=>{
//   //  console.log('Hello '+userName);
//   console.log(`Hello ${userName} you lives in ${city}`)
// }
// sayHello('Rajeev', 'Bangalore');

// Function with return statement

// const cube=(num)=>{
//     return num*num*num;
// }
// const result=cube(5);
// console.log(result);

// const factorial=(num)=>{
//     let fact=1;
//     for(let i=1;i<=num;i++){
//         fact=fact*i;
//     }
//     return fact;
// }
// console.log(factorial(7));

// Arrays Function

var countries=['India','England','France','Russia','America','China']
// console.log(countries);

// for(let i=0; i<countries.length;i++){
//     console.log(countries[i]);
// }
// console.log(countries.length);

// forEach
// countries.forEach((value,index)=>{
//     // console.log(value);
//     console.log(`${index}, ${value}`);

// });

// map()
// countries.map((value, index)=>{
//     console.log(value);
// })

// const x=countries.map((value,index)=>{
//     return value;
// });
// console.log(x);

// push()
// countries.push('Nepal','Bhutan');
// console.log(countries);

// pop()
// countries.pop();
// console.log(countries);

// unshift()
// countries.unshift('Bhutan', 'South Africa');
// console.log(countries);

// splice()
// countries.splice(0,2);
// console.log(countries)
// countries.splice(1,1,'Maldives');
// console.log(countries);

// Object Array

var Products= [
    {
        id:1,
        name:'Laptop',
        brand:'Apple',
        price:120000
    },
    {
        id:2,
        name:'Tablet',
        brand:'Samsung',
        price:16000
    },
    {
        id:3,
        name:'Camera',
        brand:'Nikon',
        price:24000
    },
    {
        id:4,
        name:'Mobile',
        brand:'One Plus',
        price:54000
    },
    {
        id:5,
        name:'Pendrive',
        brand:'Kingston',
        price:2000
    }

]

// console.log(Products);


//map()
// Products.map(p=>{
//     // console.log(p.name);
//     console.log(p);
// });

// filter()
// const prd=Products.filter(p=>p.price>20000);
// prd.map(p=>{
//     console.log(p.name);
// });

// var prod=Products.find(p=>p.id==2);
// console.log(prod);

//sort()
// var result=Products.sort((a,b)=>{
//     if(a.price > b.price){
//         return 1;
//     }
//     else{
//         return -1;
//     }
// });
// console.log(result);

// reduce()
// var num=[20,12,56,17,30];
// var result=num.reduce((total,num)=>{
//     return total+num;
// });
// console.log(result);

// Jagged Array to Flatten Array
// let nums=[[10,20], [30,40,50], [60,70], [80,90,100]];
// // console.log(nums);
// var result=nums.reduce((a,b)=>{
//     return a.concat(b);
// });
// console.log(result);

// Spread Operator

var num1=[10,20,30,40];
var num2=[50,60,70,80];
// console.log(num1);

var resArr=[1,...num1,50,60,70,80];
console.log(resArr);

// var resArr=[...num1,...num2];
// console.log(resArr);























































