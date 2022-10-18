import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Contact } from '../models/contact.model';

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  constructor(private http:HttpClient) { }
  // Getting the data
  GetContacts():Observable<Contact[]>{
    return this.http.get<Contact[]>('http://localhost:3000/contacts');
  }
  // Editing the data
  GetContact(id:string):Observable<Contact>{
    return this.http.get<Contact>(`http://localhost:3000/contacts/${id}`);
  }
  // Adding the data
  AddContact(contact:Contact){
    return this.http.post('http://localhost:3000/contacts',contact);
  }
  // Removing the data
  DeleteContact(id:string){
    return this.http.delete(`http://localhost:3000/contacts/${id}`);
  }
  // Updating the data
  UpdateContact(id:string, contact:Contact){
     return this.http.put(`http://localhost:3000/contacts/${id}`,contact);
  }
}
