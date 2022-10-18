import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  
  
  constructor(private http:HttpClient, private router:Router) { }
    //generate Token
    customer:any;
    public generateToken(loginData:any){
      // return this.http.post('http://localhost:8080/login',loginData);
      return this.http.post('http://localhost:9000/api/v1/customerservice/login',loginData);
    }
    public getCustomerfromDB(customerId:any){
      //return this.http.get('http://localhost:8080/getcustomer?customerId=1'); 

      // return this.http.get('http://localhost:8080/getcustomer',{params:{"customerId":customerId}});
      return this.http.get('http://localhost:9000/api/v1/customerservice/getcustomer',{params:{"customerId":customerId}}); 
      // this.customer = this.http.get('http://localhost:8080/getcustomer',customerId);
      // console.log(this.customer);
      // this.setCustomer(this.customer);
      // return this.customer;
      //return this.customer;
    }
    public setCustomer(customer:any) {
      localStorage.setItem('customer', JSON.stringify(customer));
    }
    public getCustomer() {
      let userStr = localStorage.getItem('customer');
      if (userStr != null) {
        return JSON.parse(userStr);
      } else {
        return null;
      }
    }
    public loginUser(token:any)
    {
      localStorage.setItem('token',token);
      return true;
    }
    //to check if user is logged in or not
    //isLogin:user is logged in or not
    public isLoggedIn(){
      let tokenStr=localStorage.getItem("token")
      if(tokenStr==undefined || tokenStr=='' || tokenStr==null){
        return false;
      }
      else{
      return true;	
      }
    }
    //Logout:remove token from local Storage
    public logout(){
        // localStorage.removeItem("token");
        // localStorage.removeItem("customer");
        localStorage.clear();
        this.router.navigate(['/']);
        
        return true;
    }
    //get token
    public getToken(){
      return localStorage.getItem('token');
    } 
}
