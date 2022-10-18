import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  constructor(private service:UserService, private route:ActivatedRoute) { }
  public userid:any;
  public posts:any;

  ngOnInit(): void {
    this.route.parent?.params.subscribe((params)=>{
      this.service.GetPosts(params['userid']).subscribe((data:any)=>{
        this.posts=data.data;
        console.log(this.posts);
      });
    });

  }

}
