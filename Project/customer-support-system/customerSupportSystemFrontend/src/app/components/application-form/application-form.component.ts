import { Component, OnInit } from '@angular/core';
// import { ActivatedRoute } from '@angular/router';
import { LoanService } from 'src/app/services/loan.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';


@Component({
  selector: 'app-application-form',
  templateUrl: './application-form.component.html',
  styleUrls: ['./application-form.component.css']
})
export class ApplicationFormComponent implements OnInit {

  constructor(private loanService: LoanService, private router:Router, private loginService: LoginService) { }

  get loanType(): string{
    return this.loanService.loanType;
  }

  get interestRate(): string{
    return this.loanService.loanIntRate;
  }

  get loanAmount(): string{
    return this.loanService.loanAmt;
  }

  get loanTenure(): string{
    return this.loanService.loanTenure;
  }

  loan_type:any;
  interest_rate:any;
  amount:any;
  tenure:any;
  custObj:any;

  ngOnInit(): void {
    this.loan_type = this.loanType;
    this.interest_rate = this.interestRate;
    this.amount = this.loanAmount;
    this.tenure = this.loanTenure;
    this.custObj = this.loginService.getCustomer();
  }

  formSubmit(){
    this.custObj = this.loginService.getCustomer();
    console.log("Submit button clicked");
    let loan={
      customerId: this.loginService.getCustomer().customerId, 
      amount: this.amount,
      interestRate: this.interest_rate,
      loanType : this.loan_type,
      tenure: this.tenure
    }
    var token=localStorage.getItem('token');
    this.loanService.addLoan(loan,token).subscribe(
      (data)=>{
        console.log(data);
        Swal.fire("Success","Loan Applied","success");
        this.router.navigateByUrl('dashboard');
      },
      (error)=>{
        console.log(error);
        alert("Error!");
      }
    );
  }

}
