import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

const httpOptions={headers:new HttpHeaders({
  'Content-Type': 'application/json'
})}

@Injectable({
  providedIn: 'root'
})
export class BlogService {

  constructor(private http: HttpClient) { }
  // Implement addBlog method using HttpClient for a saving a Blog details
  addBlog(blog): Observable<any> {
    return this.http.post(environment.API,{
      title: blog.title,
      authorName: blog.authorName,
      email: blog.email,
      content: blog.content
    },httpOptions)
  }

}