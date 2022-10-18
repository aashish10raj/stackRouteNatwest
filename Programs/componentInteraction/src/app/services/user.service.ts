import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  GetUsers(){
    return this.http.get(`https://dummyapi.io/data/v1/user?limit=10`,{
      headers:{
        'app-id':'631ac4a46a8dd1ab921d4f04'
      }
    });
  }

  GetUserById(id:string){
    return this.http.get(`https://dummyapi.io/data/v1/user/${id}`,{
      headers:{
        'app-id':'631ac4a46a8dd1ab921d4f04'
      }
    });
  }

  GetPostsById(id:string){
    return this.http.get(`https://dummyapi.io/data/v1/user/${id}/post?limit=10`,{
      headers:{
        'app-id':'631ac4a46a8dd1ab921d4f04'
      }
    });
  }
}
