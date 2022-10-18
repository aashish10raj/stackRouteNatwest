import { Component, OnInit } from '@angular/core';
import { CreditCardService } from 'src/app/services/credit-card.service';

@Component({
  selector: 'app-creditcard',
  templateUrl: './creditcard.component.html',
  styleUrls: ['./creditcard.component.css']
})
export class CreditcardComponent implements OnInit {


  creditCards = [
    {type:"Purchase & Balance Transfer card",
    purchaseRate:"21.9% p.a. (variable)",
    annualFee:"£0",
    desc:["Good for - time to pay off purchases and balances","0% for 23 months from account opening on purchases","0% for 23 months from account opening on balance transfers made within the first 3 months","2.49% balance transfer fee"]
    },
    {type:"Balance Transfer credit card",
    purchaseRate:"21.9% p.a. (variable)",
    annualFee:"£0",
    desc:["Good for - no fee to transfer a balance","0% for 22 months from account opening on balance transfers made within the first 3 months","No fee to transfer a balance to this credit card","0% on purchases for 3 months from account opening"]
    },
    {type:"The NatWest Credit Card",
    purchaseRate:"12.9% p.a. (variable)",
    annualFee:"£0",
    desc:["Good for - low rates and saving money abroad","No foreign transaction fees on purchases","Low rates on purchases and balance transfers","No balance transfer fees"]
    },
    {type:"Reward credit card",
    purchaseRate:"21.9% p.a. (variable)",
    annualFee:"£24",
    desc:["Good for - Rewards on spending","Earn 1% back in Rewards on supermarket spend (0.25% at their petrol stations and everywhere else)","Get between 1-15% back at selected MyRewards retailers"]
    },
  ];

  constructor(private creditService: CreditCardService) { }

  ngOnInit(): void {
  }

  onApplyClick(card: any){
    this.creditService.setCardType(card.type);
    this.creditService.setCardPR(card.purchaseRate);
    this.creditService.setCardFee(card.annualFee);
  }

}
