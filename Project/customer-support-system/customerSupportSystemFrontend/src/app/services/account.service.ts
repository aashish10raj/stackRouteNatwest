import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(private http: HttpClient) { }

  getAccounts(customerId:string){
    return this.http.get('http://localhost:9000/api/v1/bankservice/getaccounts', {params:{"customerId":customerId}});
  }

}