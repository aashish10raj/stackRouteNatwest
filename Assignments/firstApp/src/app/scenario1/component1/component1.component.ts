import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-component1',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.css']
})
export class Component1Component implements OnInit {

  details = this.formBuilder.group({
    name: '',
    address: ''
  });

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }
  onSubmit(): void {
  
    console.warn('Your order has been submitted', this.details.value);
    this.details.reset();
  }

}
