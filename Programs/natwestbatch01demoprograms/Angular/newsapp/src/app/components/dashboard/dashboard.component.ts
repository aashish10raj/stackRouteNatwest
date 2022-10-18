import { Component, OnInit } from '@angular/core';
import { NewsService } from 'src/app/services/news.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(private service:NewsService) { }

  public newsArticles: Array<any>=[];

  ngOnInit(): void {
    // this.service.GetHeadlines().subscribe(data=>console.log(data));
    this.service.GetHeadlines().subscribe((data:any)=>{
      console.log(data.articles);
      this.newsArticles=data.articles;

    });

  }
    

}
