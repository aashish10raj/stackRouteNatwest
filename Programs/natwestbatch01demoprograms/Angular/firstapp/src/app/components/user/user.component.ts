import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private service:UserService) { }

  public users:Array<any>=[];

  ngOnInit(): void {
    this.service.GetUsers().subscribe((data:any)=>{
    console.log(data.data);
    this.users=data.data;

  });
  }

}
