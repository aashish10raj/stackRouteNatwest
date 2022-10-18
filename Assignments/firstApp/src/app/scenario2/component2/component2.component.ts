import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-component2',
  templateUrl: './component2.component.html',
  styleUrls: ['./component2.component.css']
})
export class Component2Component implements OnInit {
  
  // details = this.formBuilder.group({
  //   name: '',
  //   address: ''
  // });
  public name="";

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

}
