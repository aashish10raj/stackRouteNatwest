import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private route:ActivatedRoute, private service:UserService) { }

  public userid:any;
  public userdata:any;

  ngOnInit(): void {
    this.userid=this.route.snapshot.paramMap.get('userid');
    this.service.GetUser(this.userid).subscribe((data:any) =>{
      this.userdata=data;
      console.log(this.userdata);
    })
  }

}
