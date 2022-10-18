import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private service:UserService, private route:ActivatedRoute) { }
  public userId:any;
  public userdata:any;

  ngOnInit(): void {
    // this.service.GetUserById(this.route.snapshot.params.id).subscribe((data:any)=>{
    //   console.log(data);
      
    // })
    this.userId=this.route.snapshot.paramMap.get('id');
    // console.log(this.userId);
    this.service.GetUserById(this.userId).subscribe((data:any)=>{
      this.userdata=data;
    })
    
  }



}
