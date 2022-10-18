import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class NewsService {

  constructor(private http:HttpClient) { }

  GetHeadlines(){
    return this.http.get(`https://newsapi.org/v2/top-headlines?country=us&apiKey=${environment.apiKey}`);
  }
}
