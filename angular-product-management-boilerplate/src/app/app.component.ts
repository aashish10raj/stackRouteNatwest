import { Component } from '@angular/core';
import { ProductService } from './services/product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'productapp';
  constructor(private service: ProductService) { }

  products: Array<any> = [];

  ngOnInit(): void {
    // Write Your Code Here
  }

  addProduct(product: any) {
    // Write Your Code Here
  }

  deleteProduct(id: any) {
    // Write Your Code Here
  }

}
