import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { CustomerService } from 'src/app/services/customer.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';
import { EncrDecrService } from 'src/app/services/encr-decr.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  // Data: Array<any> = [
  //   { name: 'Loans', value: 'loans' },
  //   { name: 'Credit Card', value: 'creditCard' },
  //   { name: 'Fixed Deposit', value: 'FD' },
  //   { name: 'Insurance', value: 'insurance' },
  //   { name: 'RoosterMoney', value: 'rooster' },
  //   { name: 'HouseMate App', value: 'housemate' }
  // ];

  form:any=this.fb.group({
    customerId:['',[Validators.required]],
    name:['',[Validators.required]],
    mobileno:['',[Validators.required,Validators.minLength(10)]],
    email:['',[Validators.required,Validators.pattern("[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}")]],
    age:['',[Validators.required]],
    emp_type:['',[Validators.required]],
    password:['',[Validators.required,Validators.minLength(8)]],
    cnfpassword:['',[Validators.required,Validators.minLength(8)]],
    loans: [],
    creditcard: [],
    fd:[],
    insurance:[],
    roostermoney:[],
    housemate:[]
  });

  message = '';
  errormsg='';
  creditrating!: number;
 prod: Array<any> = [];

  constructor(private fb:FormBuilder, private customerservice:CustomerService, 
    private snack:MatSnackBar, private router:Router, private encrdcr:EncrDecrService) { }

  ngOnInit(): void {
  }

  // onCheckboxChange(e) {
  //   const checkArray: FormArray = this.form.get('checkArray') as FormArray;
  //   if (e.target.checked) {
  //     checkArray.push(new FormControl(e.target.value));
  //   } else {
  //     let i: number = 0;
  //     checkArray.controls.forEach((item) => {
  //       if (item.value == e.target.value) {
  //         checkArray.removeAt(i);
  //         return;
  //       }
  //       i++;
  //     });
  //   }
  // }
  
  onSubmit() {
    // console.log("form value");
    
    // console.log(this.form.value);
    this.errormsg='';
    
    if(this.form.valid == false){
      this.errormsg='Please verify entered details!!!';
      // console.log("form is invalid");
    }
    else{
      if(this.form.value.password == this.form.value.cnfpassword){

        if(this.form.value.emp_type=="Self-Employed"){
          this.creditrating=this.getRandomInt(400,800);          

        }
        if(this.form.value.emp_type=="Unemployed"){
          this.creditrating=this.getRandomInt(300,400);          

        }
        if(this.form.value.emp_type=="Salaried"){
          this.creditrating=this.getRandomInt(500,850);          

        }
      
        if(this.form.value.loans){
          this.prod.push("loans")
        }
        if(this.form.value.creditcard){
            this.prod.push("creditcard")
        }
        if(this.form.value.fd){
          this.prod.push("FD")
        }
        if(this.form.value.insurance){
          this.prod.push("insurance")
        }
        if(this.form.value.roostermoney){
          this.prod.push("roosterMoney")
        }
        if(this.form.value.housemate){
          this.prod.push("HouseMate")
        }
        var productchoice = this.prod.toString(); 

        if(this.prod.length == 0){
          this.errormsg='Please Select atleast 1 product!!!';
          this.snack.open("Please select atleast one product","Ok");
          // console.log("form is invalid");
        }
        else{


        let customer={
          customerId: this.form.value.customerId, 
          name: this.form.value.name,
          mobileno: this.form.value.mobileno,
          email : this.form.value.email,
          age:this.form.value.age,
          emp_type:this.form.value.emp_type,
          // password: this.form.value.password,
          product: productchoice,
          creditrating: this.creditrating,
          password:this.encrdcr.set('123456$#@$^@1ERF', this.form.value.password)
          //password: this.form.value.password
        }
       
        
        this.customerservice.addCustomer(customer).subscribe(
          (data)=>{
            console.log(data);
            //alert("Success");
            Swal.fire("Success","Customer registered","success");
            this.router.navigateByUrl('signin');
          },
          (error)=>{
            console.log(error);
            alert("customer already exist");
            this.snack.open("Customer already exist.","Ok");
          }
        );
        }
      }
      else{
        console.log("Password mismatch");
        console.log("form is invalid");
        alert("Password mismatch");
        this.snack.open("Password mismatch","Ok");
      }
    }
    
  }

  clearForm() {
    this.form.reset();
  }
  get CustomerId() {
    return this.form.get('customerId');
  }
  get Name() {
    return this.form.get('name');
  }
  get MobileNo() {
    return this.form.get('mobileno');
  }
  get Email() {
    return this.form.get('email');
  }
  get Age() {
    return this.form.get('age');
  }
  get EmpType() {
    return this.form.get('emp_type');
  }
  get Password() {
    return this.form.get('password');
  }
  get CnfPassword() {
    return this.form.get('cnfpassword');
  }

  getRandomInt(min: number, max: number) : number{
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min; 
  }
}
