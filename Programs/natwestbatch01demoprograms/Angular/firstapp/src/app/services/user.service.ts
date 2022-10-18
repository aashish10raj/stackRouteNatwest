import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  GetUsers(){
    return this.http.get(`https://dummyapi.io/data/v1/user?limit=12`,{
      headers:{
        'app-id':'61dc10e506b38bcd8289868c'
      }
    });
  }

  GetUser(id:string){
    return this.http.get(`https://dummyapi.io/data/v1/user/${id}`,{
      headers:{
        'app-id':'61dc10e506b38bcd8289868c'
      }
    });

  }
  GetPosts(id:string){
    return this.http.get(`https://dummyapi.io/data/v1/user/${id}/post?limit=10`,{
      headers:{
        'app-id':'61dc10e506b38bcd8289868c'
      }
    });

  }
}
