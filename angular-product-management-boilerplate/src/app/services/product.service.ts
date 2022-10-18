import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }

  addProduct(product: any) {
    // Write Your Code Here
    return this.http.post("http://localhost:3001/products", product);
  }

  getProducts() {
    // Write Your Code Here
    return this.http.get("http://localhost:3001/products");
  }

  deleteProduct(id: number) {
    // Write Your Code Here    
    return this.http.delete(`http://localhost:3001/products/${id}`);
  }
}
