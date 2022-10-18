import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Contact } from 'src/app/models/contact.model';
import { ContactService } from 'src/app/services/contact.service';

@Component({
  selector: 'app-contactlist',
  templateUrl: './contactlist.component.html',
  styleUrls: ['./contactlist.component.css']
})
export class ContactlistComponent implements OnInit {

  flag: boolean = false;
  updateid: string=''; 

  constructor(private service:ContactService, private cdr: ChangeDetectorRef) { }
  public contacts:Array<Contact>=[];

  public contact:Contact={} as Contact;


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
      this.flag=true;
      this.updateid=id;
    });    
  
  }

  onsubmit(){
    this.service.UpdateContact(this.updateid,this.contact).subscribe((result:any)=>
    {
      this.contact=result;
      this.flag=false; 
      this.cdr.detectChanges();
      window.location.reload();
     
  
  });
  }
}
  

  



