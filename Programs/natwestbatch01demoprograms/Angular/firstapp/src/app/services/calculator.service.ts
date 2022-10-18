import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  constructor() { }

  public Sum(x:number, y:number){
    return x+y;
  }

  public Factorial(num:number){
    let fact=1;
    for(let i=1; i<=num;i++){
      fact=fact*i;
    }
    return fact;
  }
}
