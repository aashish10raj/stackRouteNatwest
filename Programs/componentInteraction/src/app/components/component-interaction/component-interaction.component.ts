import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-component-interaction',
  templateUrl: './component-interaction.component.html',
  styleUrls: ['./component-interaction.component.css']
})
export class ComponentInteractionComponent implements OnInit {
  public products=[
    {
      id: 1,
      name: 'A',
      brand: 'X',
      price: 122
    },
    {
      id: 2,
      name: 'B',
      brand: 'Y',
      price: 1202
    }
  ]

  public color='green';
  public doj=new Date();

  @Input()
  public parentData:String='';

  @Output()
  public childEvent=new EventEmitter();

  sendData(){
    this.childEvent.emit('Raj');
  }

  constructor() { }

  ngOnInit(): void {
  }

}
