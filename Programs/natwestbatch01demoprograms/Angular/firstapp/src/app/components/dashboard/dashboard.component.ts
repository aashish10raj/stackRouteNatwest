import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { EVENT_MANAGER_PLUGINS } from '@angular/platform-browser';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  public products= [
    {
        id:1,
        name:'Laptop',
        brand:'Apple',
        price:120000
    },
    {
        id:2,
        name:'Tablet',
        brand:'Samsung',
        price:16000
    },
    {
        id:3,
        name:'Camera',
        brand:'Nikon',
        price:24000
    },
    {
        id:4,
        name:'Mobile',
        brand:'One Plus',
        price:54000
    },
    {
        id:5,
        name:'Pendrive',
        brand:'Kingston',
        price:2000
    }

]

//ngSwitch directive

public color='red';

// Parent to Child
@Input("parentData")
public name:string='';

// Child to Parent
@Output()
public childEvent=new EventEmitter();

sendData(){
  this.childEvent.emit('Newton');
}

// Pipes
public empname:string='Sam';
public salary:number=70000;
public doj=new Date();
public mobno:string='9966554433';

}
