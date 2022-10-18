import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable} from 'rxjs';
import { Contact } from '../models/Contact';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {
  }

  // Implement addContacts method using HttpClient for a saving a Contacts details
  addContact(contact: Contact): Observable<any> {
  return this.http.post<Contact>("http://localhost:3000/contacts",contact);
  }

  // Implement getAllContactss method using HttpClient for getting all Contacts details
  getAllContacts(): Observable<any> {
    return this.http.get<Contact>("http://localhost:3000/contacts");
  }
}
