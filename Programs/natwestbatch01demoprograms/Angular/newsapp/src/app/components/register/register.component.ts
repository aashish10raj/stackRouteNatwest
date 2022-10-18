import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }
  
  public isError:boolean=false;

  ngOnInit(): void {
  }

  registerUser(form:NgForm){
    if(form.valid){
  console.log(form.value);
    this.isError=false;
    console.log("Form is Valid");
    }
    else{
      this.isError=true;
      console.log("Form is not Valid");
    }
    
  }

}
