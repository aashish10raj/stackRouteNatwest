import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { ProductService } from '../services/product.service';


@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent {

  form=new FormGroup({
    name: new FormControl(null,[Validators.required ]),
     brand: new FormControl(null,[Validators.required]),
     quantity: new FormControl(null,[Validators.required]),
     price: new FormControl(null,[Validators.required])    
   });

   message = '';
  constructor(private service: ProductService) { }

  // Write Your Code Here

  handleFormSubmit() {
    // Write Your Code Here

    console.log("called");
    
    this.service.addProduct(this.form.value).subscribe(response=>{
      console.log(response);
      window.location.reload();        
     });
      
  
    (    error: any)=>{
      console.log(error); 
    this.message="error";
    alert(this.message);
    }
  
  }

}
