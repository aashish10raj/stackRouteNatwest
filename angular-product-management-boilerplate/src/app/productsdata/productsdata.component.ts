import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-productsdata',
  templateUrl: './productsdata.component.html',
  styleUrls: ['./productsdata.component.css']
})
export class ProductsdataComponent {

  constructor(private service:ProductService) { }


  public products:Array<any>=[];


  // Write Your Code Here
  ngOnInit(){
    this.service.getProducts().subscribe((data:any)=>{
      // console.log(data);
      this.products=data;  
    });

  }

  deleteProduct(id: number){
    // Write Your Code Here
    console.log(id);  

      this.service.deleteProduct(id).subscribe((data:any)=>{
          this.service.getProducts().subscribe((prodData:any)=>{
            this.products=prodData;
          })
      })

  }

}
