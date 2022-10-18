import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoanService {

  constructor(private http:HttpClient) { }

  loanType: string ="";
  loanIntRate: string ="";
  loanAmt: string = "";
  loanTenure: string = "";
  
  setLoanType(value:string){
    this.loanType = value;
  }
  setLoanIntRate(value:string){
    this.loanIntRate = value;
  }
  setLoanAmt(value:string){
    this.loanAmt = value;
  }
  setLoanTenure(value:string){
    this.loanTenure = value;
  }

  // showCustomLoans(parameters:any){
  //   // let queryParams = new HttpParams(params); //{ "customerId": customerId , "requiredAmt": req_amt }; 
  //   return this.http.get('http://localhost:9000/api/v1/bankloan/showLoans',{params:parameters});
  // }
  showCustomLoans(parameters:any,token:any){
    // let queryParams = new HttpParams(params); //{ "customerId": customerId , "requiredAmt": req_amt }; 
    console.log(token);
    var headers_object = new HttpHeaders().set("Authorization", "Bearer " + token);
    //headers : { Authorization: `Bearer ${token}` }
    return this.http.get('http://localhost:9000/api/v1/bankloan/showLoans',{ headers : { Authorization: `Bearer ${token}` },params:parameters });
  }

  addLoan(loan:any,token:any){
    // return this.http.post('http://localhost:9000/api/v1/loan/addLoan',loan);
    //headers : { Authorization: `Bearer ${token}` };
    //var headers_object = new HttpHeaders().set("Authorization", "Bearer " + token);
    const httpOptions = {
      headers: new HttpHeaders({
        Authorization: `Bearer ${token}`
      })
    };
    return this.http.post('http://localhost:9000/api/v1/loan/addLoan',loan,httpOptions);
  }

  getLoans(customerId:string,token:any){
    return this.http.get('http://localhost:9000/api/v1/loan/loans', {headers : { Authorization: `Bearer ${token}` },params:{"customerId":customerId}});
  }
}