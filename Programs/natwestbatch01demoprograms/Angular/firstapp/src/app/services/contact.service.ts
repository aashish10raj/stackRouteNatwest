import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IContact } from '../models/IContact';

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  constructor(private http:HttpClient) { }
  // Getting the data
  GetContacts():Observable<IContact[]>{
    return this.http.get<IContact[]>('http://localhost:3000/contacts');
  }
  // Editing the data
  GetContact(id:string):Observable<IContact>{
    return this.http.get<IContact>(`http://localhost:3000/contacts/${id}`);
  }
  // Adding the data
  AddContact(contact:IContact){
    return this.http.post('http://localhost:3000/contacts',contact);
  }
  // Removing the data
  DeleteContact(id:string){
    return this.http.delete(`http://localhost:3000/contacts/${id}`);
  }
  // Updating the data
  UpdateContact(id:string, contact:IContact){
     return this.http.put(`http://localhost:3000/contacts/${id}`,contact);
  }
}

