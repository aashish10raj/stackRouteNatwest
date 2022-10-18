import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/app/services/customer.service';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  // customer_name = "";

  constructor(private customer: CustomerService, private logout:LoginService) { }

  get customerName(): string{
    return this.customer.customerName;
  }

  ngOnInit(): void {
  }
logoutmethod(){
  this.logout.logout();
}

}
