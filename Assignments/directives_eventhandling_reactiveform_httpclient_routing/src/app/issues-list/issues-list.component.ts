import { Component, OnInit } from '@angular/core';
import { IssueService } from '../services/issue.service';

@Component({
  selector: 'app-issues-list',
  templateUrl: './issues-list.component.html',
  styleUrls: ['./issues-list.component.css']
})
export class IssuesListComponent implements OnInit {


  constructor(private service:IssueService) { }

  public issues:Array<any>=[];

  // Write logic to get all issues from IssueService
  ngOnInit() {
    this.service.getIssues().subscribe((data:any)=>{
      // console.log(data);
      this.issues=data;  
    });
  

  }

  // Implement deleteIssue method to delete the issue
  deleteIssue(id: any) {
    console.log(id);  

      this.service.deleteIssue(id).subscribe((data:any)=>{
          this.service.getIssues().subscribe((issuedata:any)=>{
            this.issues=issuedata;
          })
      })
  }

}
