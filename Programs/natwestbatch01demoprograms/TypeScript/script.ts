console.log("Welcome to TypeScript");
// console.log("Super set of JS");

// Types

// let username:string;
// // username=25;
// username='john';
// console.log(username);

// let username:string;
// let age:number;
// let taskCompleted:boolean;
// let hobbies:string[]; // Array
// let book:[number, string, string] // Tuple

// username="Peter";
// age=21;
// taskCompleted=true;
// hobbies=['Singing', 'Dancing', 'Reading']
// book=[1, 'The origin', 'Complete Reference of Java'];

// console.log(username);
// console.log(age);
// console.log(taskCompleted);
// console.log(hobbies);
// console.log(book);

// Enum - It is a group of fixed constant.

// enum color{
//     Red,
//     Green,
//     Blue
// }

// let c:string=color[2];
// console.log(c);

// let c1:color=color.Green;
// console.log(c1);

// Unknown - Type of variable not known

// let notSure:unknown=4;

// notSure='May be a String instead';

// console.log(notSure);

// let myvar:unknown;
// myvar='Hello';
// myvar=40;

// console.log(myvar);

// Function

// function show():void{
//    // console.log('Hello ! World');
//    //return 'Hello ! World';
// }
// show();

// const show=():void=>{
//     console.log('Hello ! World');
// }
// show();

// const show=():string=>{
//     return 'Hello ! World';
// }
// console.log(show());

// const sayHello=(username):string=>{
//     return `Hello ${username}`;
// }
// console.log(sayHello('Rishi'));

// Object

// var person:Object;

// person={
//     firstName:"Sam",
//     lastName:"Patric",
//     age: 25
// };

// console.log(person);


// interface

// interface Person{
//     firstName:string;
//     lastName:string;
//     age:number;
// }

// let p:Person={
//     firstName:'Amal',
//     lastName:'N',
//     age:22
// }
// console.log(p.firstName);

// let q:Person={
//     firstName:'Divyani',
//     lastName:'Das',
//     age:23
// }
// console.log(q.firstName);

// classes

// class Person{
//     constructor(){
//         console.log("This is constructor");
//     }
// }

// let p1=new Person();


class Person{
    public firstName:string;
    public lastName:string;
    constructor(){
        console.log("This is constructor");
    }
    show(){
        console.log(this.firstName, this.lastName);
    }
    assign(fname:string, lname:string){
        this.firstName=fname;
        this.lastName=lname;
    }
}

let p1=new Person();
p1.assign('Deepi','Garg');
p1.show();













