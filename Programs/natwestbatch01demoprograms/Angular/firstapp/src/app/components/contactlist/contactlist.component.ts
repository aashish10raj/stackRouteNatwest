import { Component, OnInit } from '@angular/core';
import { IContact } from 'src/app/models/IContact';
import { ContactService } from 'src/app/services/contact.service';

@Component({
  selector: 'app-contactlist',
  templateUrl: './contactlist.component.html',
  styleUrls: ['./contactlist.component.css']
})
export class ContactlistComponent implements OnInit {

  constructor(private service:ContactService) { }

  public contacts:Array<IContact>=[];
  // public firstname:string='';
  public contact:IContact={} as IContact;

  ngOnInit(): void {
    this.service.GetContacts().subscribe(data=>this.contacts=data);
  }

  addContact(){
    this.service.AddContact(this.contact).subscribe((data:any)=>{
      this.contacts.push(data);
    });
  }
  
  removeContact(id:string){
    this.service.DeleteContact(id).subscribe(data=>{
      this.contacts=this.contacts.filter(item=>item.id!=id);
    });
  }
  getContact(id:string){
    this.service.GetContact(id).subscribe(data=>{
      this.contact=data;
    })
  }
  updateContact(){
    this.service.UpdateContact(this.contact.id, this.contact).subscribe((data:any)=>{
      let i=this.contacts.indexOf(this.contacts.filter(item => item.id=== this.contact.id)[0]);
      this.contacts[i]=data;
    })
  }

}
