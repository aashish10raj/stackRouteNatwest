import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  public username:string='Amrutha';

  public fruits:Array<string>=['Apple', 'Banana', 'Grapes', 'Cherry', 'Mango'];
  
//   Property Binding
    
     public id:string='text1';

     public isDisabled=false;

// Class Binding
    
    public applyStyles=false;

    public styles={
      'text-red':this.applyStyles,
      'text-green':this.applyStyles,
      'text-underline':this.applyStyles,
      'text-italics':this.applyStyles,
    }

  // Style Binding
     
     public isError=false;

     public colorname="Blue";

     public textSize="30pt";
    
     // Event Binding

     sayHello(fname:any){
     // console.log('Welcome to Angular');
    //  console.log(`welcome ${fname}`);
    console.log(`welcome ${fname.value}`);

     }

     // 2 way Data Binding

     public description:string='Rajeev';


    }

    
