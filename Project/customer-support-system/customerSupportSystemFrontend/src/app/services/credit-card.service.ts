import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CreditCardService {

  card_type: string = "";
  card_pr:string = "";
  card_fee:string = "";

  setCardType(cardtype:string){
    this.card_type = cardtype;
  }

  setCardPR(value:string){
    this.card_pr = value;
  }

  setCardFee(value:string){
    this.card_fee = value;
  }

  constructor(private http: HttpClient) { }

  addCardApplication(card: any,token:any){
    const httpOptions = {
      headers: new HttpHeaders({
        Authorization: `Bearer ${token}`
      })
    };
    return this.http.post('http://localhost:9000/api/v1/creditcard/addCard',card,httpOptions);
  }

  getCards(customerId:string,token:any){
    
    return this.http.get('http://localhost:9000/api/v1/creditcard/cards', {headers : { Authorization: `Bearer ${token}` },params:{"customerId":customerId}});
  }

}
