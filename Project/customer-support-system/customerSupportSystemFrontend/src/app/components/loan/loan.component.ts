import { Component, OnInit } from '@angular/core';
import { LoanService } from 'src/app/services/loan.service';
import { ActivatedRoute } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-loan',
  templateUrl: './loan.component.html',
  styleUrls: ['./loan.component.css']
})
export class LoanComponent implements OnInit {

  requiredAmt = "";
  customLoans:any;
  loan_type:any;
  token:any;
  constructor(private loanService: LoanService, private _Activatedroute:ActivatedRoute,private login:LoginService) { }

  ngOnInit(): void {
    this.loan_type = this._Activatedroute.snapshot.paramMap.get("type");
  }

  onSubmit(){
    let parameters = {
      "customerId":this.login.getCustomer().customerId,
      "requiredAmt":this.requiredAmt,
      "creditrating":this.login.getCustomer().creditrating
    }

    console.log(parameters);
    
    this.loan_type = this._Activatedroute.snapshot.paramMap.get("type");

    // this.loanService.showCustomLoans(parameters).subscribe(
    // this.login.getToken().subscribe(
    //   (data)=>{
    //       token=data;
    //   }
    // );
    this.token=localStorage.getItem('token');
    this.loanService.showCustomLoans(parameters,this.token).subscribe(
      (data)=>{
      console.log(data);
      //alert("Success");
      // Swal.fire("Success","Customer registered","success");
      // this.router.navigateByUrl('signin');
      this.customLoans = data;
    },
    (error)=>{
      console.log(error);
      // alert("customer already exist");
      // this.snack.open("Customer already exist.","Ok");
    });
  }

  onApplyClick(loan:any){
    this.loanService.setLoanAmt(this.requiredAmt);
    this.loanService.setLoanIntRate(loan.interestRate);
    this.loanService.setLoanTenure(loan.time);
    this.loanService.setLoanType(this.loan_type);
    console.log("Apply Online is clicked!");
  }
}
