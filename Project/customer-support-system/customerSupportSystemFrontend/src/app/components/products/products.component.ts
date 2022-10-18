import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {


customerData:any;
customerAge !:number;
customerCreditRating !:number;
  productPrefs: any[] = [];

  constructor(private login:LoginService) { }

  ngOnInit(): void {

    this.customerData=this.login.getCustomer();
      // console.log(this.cusobj.id);
      this.customerAge=this.customerData.age;
      this.customerCreditRating=this.customerData.creditrating;
      this.productPrefs=this.customerData.product.split(',');
      // console.log(this.productPrefs);   

  }




}
