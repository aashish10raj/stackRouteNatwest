import { Component, OnInit } from '@angular/core';
import { NewsService } from 'src/app/Services/news.service';
import {MatSnackBarModule} from '@angular/material/snack-bar';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(private service:NewsService, private snak:MatSnackBarModule) { }
  
  public news:Array<any>=[];

  ngOnInit(): void {
    this.service.GetHeadlines().subscribe((data:any)=>{
     this.news=data.articles;          
    });
  }

  

}
