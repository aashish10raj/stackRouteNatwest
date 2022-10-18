import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-profile-page',
  templateUrl: './profile-page.component.html',
  styleUrls: ['./profile-page.component.css']
})
export class ProfilePageComponent implements OnInit {

  constructor(private login:LoginService) { }
  cusobj:any;
  ngOnInit(): void {
      this.cusobj=this.login.getCustomer();
  }
 
  
}
