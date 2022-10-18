import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder,FormControl,Validators,FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { LoginService } from 'src/app/services/login.service';
import { Router } from '@angular/router';
import { CustomerService } from 'src/app/services/customer.service';
import { EncrDecrService } from 'src/app/services/encr-decr.service';


@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  message='';
  
  loginData={
    customerId:'',
    password:'',
  };



  constructor(private router:Router, private snack:MatSnackBar,
    private customer:CustomerService, private login:LoginService, private encrdcr:EncrDecrService) {}


  ngOnInit(): void {   
    this.customer.setCustomerName("");
    
  }
  cusobj:any;
  formSubmit(){
    console.log("login button clicked");
    
    if(this.loginData.customerId.trim() == '' || this.loginData.customerId==null){
      this.snack.open("CustomerId is required!",'',{
        duration:3000,
      });
      return;
    }
    if(this.loginData.password.trim()=='' || this.loginData.password==null){
      this.snack.open("Password is required!",'',{
        duration:3000,
      });
      return;
    }
    this.loginData.password=this.encrdcr.set('123456$#@$^@1ERF', this.loginData.password);
    //request to server to generate token
    this.login.generateToken(this.loginData).subscribe((data:any)=>{
      // console.log("success");
      // console.log(data);
      this.login.loginUser(data.token);
    
      // console.log(this.login.getCustomer())
      this.goToPage("products");

    },
    (error)=>{
      console.log("Error!");
      console.log(error);
      this.snack.open('Invalid Details !! Try again', '', {
        duration: 3000,
      });
    });
    this.login.getCustomerfromDB(this.loginData.customerId).subscribe((data:any)=>{
      // console.log(data);
      this.login.setCustomer(data);
      this.cusobj=this.login.getCustomer();
      // console.log(this.cusobj.id);
      // this.customerAge=this.cusobj.age;
      // this.customerCreditRating=this.cusobj.creditrating;    
      
    });
    // this.customer.setCustomerName(this.loginData.customerId);
    // this.goToPage("products");
  }

  goToPage(pagename:string){
    this.router.navigateByUrl(pagename);
  }

}
