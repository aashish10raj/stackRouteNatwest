import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder,FormControl,Validators,FormGroup } from '@angular/forms';
// import { Chart } from 'chart.js';

@Component({
  selector: 'app-emi-calculator',
  templateUrl: './emi-calculator.component.html',
  styleUrls: ['./emi-calculator.component.css']
})
export class EmiCalculatorComponent implements OnInit {

  emi_val = 0;
  interest_val = 0;
  total_val = 0;
  flag = false;

  canvas: any;
  ctx: any;
  @ViewChild('mychart') mychart: any;

  emiForm = this.fb.group({
    loanAmount:['', [Validators.required]],
    interestRate:['', [Validators.required]],
    tenure:['', [Validators.required]],

  });
  
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  calculateEMI() {
    //console.warn(this.emiForm.value);
    let formVal = this.emiForm.value;
    let interest = formVal.interestRate / 12 / 100;
    let emi = formVal.loanAmount * interest * 
              (Math.pow(1+interest, formVal.tenure) / (Math.pow(1+interest, formVal.tenure) - 1));

    //console.log(formVal.loanAmount * 2);
    //console.log(emi)
    //emi = Math.round(emi);
    this.emi_val = Math.round(emi);
    
    let toalPayment = emi * formVal.tenure;
    this.total_val = Math.round(toalPayment);

    let interest_component = toalPayment - formVal.loanAmount;
    this.interest_val = Math.round(interest_component); 

    //this.displayChart();
    if (isNaN(this.emi_val)){
        this.flag = true;
    }
    
  }

  // displayChart(){
  //   this.canvas = this.mychart.nativeElement;
  //     this.ctx = this.canvas.getContext('2d');

  //   new Chart(this.ctx, {
  //     type: "pie",
  //     data: {
  //       labels: ["Total Interest", "Principal Loan Amount"],
  //       datasets: [
  //         {
  //           data: [this.interest_val, this.emiForm.value.loanAmount],
  //           backgroundColor: ["#e63946", "#14213d"],
  //           borderWidth: 0,
  //         },
  //       ],
  //     },
  //   });
  // }
}
