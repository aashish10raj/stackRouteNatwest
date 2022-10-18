import { Component, OnInit } from '@angular/core';
import { CreditCardService } from 'src/app/services/credit-card.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-card-application',
  templateUrl: './card-application.component.html',
  styleUrls: ['./card-application.component.css']
})
export class CardApplicationComponent implements OnInit {

  card_type = "";
  purchase_rate = "";
  annual_fee = "";
  apr = 0.0;
  credit_limit = 0;
  custObj:any;

  get cardType(){
    return this.creditService.card_type;
  }

  get cardPR(){
    return this.creditService.card_pr;
  }

  get cardFee(){
    return this.creditService.card_fee;
  }

  constructor(private creditService: CreditCardService, private router:Router, private loginService: LoginService) { }

  ngOnInit(): void {
    this.card_type = this.cardType;
    this.purchase_rate = this.cardPR;
    this.annual_fee = this.cardFee;
    this.custObj = this.loginService.getCustomer();
    if(this.custObj.creditrating<=400){
      this.apr = 21.9;
      this.credit_limit = 1200;
    } else if(this.custObj.creditrating<=500){
      this.apr = 18.9;
      this.credit_limit = 5000;
    } else if(this.custObj.creditrating<=600){
      this.apr = 16.9;
      this.credit_limit = 10000;
    } else if(this.custObj.creditrating<=700){
      this.apr = 15.9;
      this.credit_limit = 100000;
    } else{
      this.apr = 13.9;
      this.credit_limit = 1000000;
    }
  }

  formSubmit(){
    console.log("Submit button clicked");

    this.card_type = this.cardType;
    this.purchase_rate = this.cardPR;
    this.annual_fee = this.cardFee;
    this.custObj = this.loginService.getCustomer();
    if(this.custObj.creditrating<=400){
      this.apr = 21.9;
      this.credit_limit = 1200;
    } else if(this.custObj.creditrating<=500){
      this.apr = 18.9;
      this.credit_limit = 5000;
    } else if(this.custObj.creditrating<=600){
      this.apr = 16.9;
      this.credit_limit = 10000;
    } else if(this.custObj.creditrating<=700){
      this.apr = 15.9;
      this.credit_limit = 100000;
    } else{
      this.apr = 13.9;
      this.credit_limit = 1000000;
    }

    let card={
      customerId: this.custObj.customerId, 
      cardType: this.card_type,
      purchaseRate: this.purchase_rate,
      annualFee: this.annual_fee,
      apr: this.apr,
      creditLimit: this.credit_limit,
      // tenure: this.tenure
    }
    console.log(card);
    var token=localStorage.getItem('token');
    this.creditService.addCardApplication(card,token).subscribe(
      (data)=>{
        console.log(data);
        Swal.fire("Success","Credit Card Applied","success");
        this.router.navigateByUrl('dashboard');
      },
      (error)=>{
        console.log(error);
        alert("Error!");
      }
    );
  }

}
