import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable} from 'rxjs';
import { Issue } from '../models/Issue';


@Injectable({
  providedIn: 'root'
})

export class IssueService {

  constructor(private http:HttpClient) { }

  // Implement addIssue method using HttpClient for a saving a Issue details
  addIssue(issue:Issue): Observable<any> {
   
    return this.http.post("http://localhost:3000/issues", issue);
  }

  getIssues(): Observable<any> {
    return this.http.get<Issue>("http://localhost:3000/issues");
  }

  // Implement deleteIssue method to delete a issue by id
  deleteIssue(id: any): Observable<any> {
   return this.http.delete(`http://localhost:3000/issues/${id}`);
  }
}
