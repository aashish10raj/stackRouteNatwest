import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customerName: string = "";

  constructor(private http:HttpClient) { }

  setCustomerName(name:string){
    this.customerName = name;
  }

  addCustomer(customer:any){
      return this.http.post('http://localhost:9000/api/v1/customerservice/addCustomer',customer);
      // return this.http.post('http://localhost:8082/api/v1/customerservice/addCustomer',customer);
  }
}
