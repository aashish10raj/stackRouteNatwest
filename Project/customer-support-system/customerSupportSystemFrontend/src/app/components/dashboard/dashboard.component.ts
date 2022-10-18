import { Component, OnInit } from '@angular/core';
import { AccountService } from 'src/app/services/account.service';
import { CreditCardService } from 'src/app/services/credit-card.service';
import { LoanService } from 'src/app/services/loan.service';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  accountsList:any;
  loansList:any;
  cardsList:any;
  custObj:any;

  constructor(private login: LoginService, private accounts: AccountService, private loans: LoanService, private credit: CreditCardService) { }

  ngOnInit(): void {
    this.custObj = this.login.getCustomer();
    var token=this.login.getToken();
    this.accounts.getAccounts(this.custObj.customerId).subscribe(
      (data)=>{
      console.log(data);
      //alert("Success");
      // Swal.fire("Success","Customer registered","success");
      // this.router.navigateByUrl('signin');
      this.accountsList = data;
    },
    (error)=>{
      console.log(error);
      // alert("customer already exist");
      // this.snack.open("Customer already exist.","Ok");
    });
    this.loans.getLoans(this.custObj.customerId,token).subscribe(
      (data)=>{
      console.log(data);
      //alert("Success");
      // Swal.fire("Success","Customer registered","success");
      // this.router.navigateByUrl('signin');
      this.loansList = data;
    },
    (error)=>{
      console.log(error);
      // alert("customer already exist");
      // this.snack.open("Customer already exist.","Ok");
    });
    var token=this.login.getToken();
    this.credit.getCards(this.custObj.customerId,token).subscribe(
      (data)=>{
      console.log(data);
      //alert("Success");
      // Swal.fire("Success","Customer registered","success");
      // this.router.navigateByUrl('signin');
      this.cardsList = data;
    },
    (error)=>{
      console.log(error);
      // alert("customer already exist");
      // this.snack.open("Customer already exist.","Ok");
    });
  }

}
