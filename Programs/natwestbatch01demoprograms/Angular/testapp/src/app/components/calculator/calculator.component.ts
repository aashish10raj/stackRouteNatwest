import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  Add(num1:number, num2:number):number{
    return num1+num2;
  }
  Subtract(num1:number, num2:number):number{
    return num1-num2;
  }
  Multiply(num1:number, num2:number):number{
    return num1*num2;
  }
  Division(num1:number, num2:number):number{
    return num1/num2;
  }

  GetLength(name:string){
    return name.length;
  }

}
