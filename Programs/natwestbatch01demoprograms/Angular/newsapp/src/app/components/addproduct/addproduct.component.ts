import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private fb: FormBuilder) { }

  // public productName=new FormControl('',[Validators.required]);
  // public brand=new FormControl('',[Validators.required])

  productForm=this.fb.group({
    productName: ['',[Validators.required]],
    brand: ['',[Validators.required]],
    description: ['',[Validators.required, Validators.minLength(10)]],
    quantity: ['',[Validators.required, Validators.pattern("[0-9]{1,2}")]],
    price: ['',[Validators.required]],


  })

  ngOnInit(): void {
  }

  AddProduct(){
    console.log("Event Fired");
    // console.log(this.productName.value);
    // console.log(this.brand.value);
  }

  // get ProductName(){
  //   return this.productName;
  // }
  // get Brand(){
  //   return this.brand;
  // }

  get ProductName(){
    return this.productForm.get('productName');
  }
  get Brand(){
    return this.productForm.get('brand');
  }
  get Description(){
    return this.productForm.get('description');
  }
  get Quantity(){
    return this.productForm.get('quantity');
  }
  get Price(){
    return this.productForm.get('price');
  }
}
