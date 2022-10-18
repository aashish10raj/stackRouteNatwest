import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { IssueService } from '../services/issue.service';

@Component({
  selector: 'app-issue',
  templateUrl: './issue.component.html',
  styleUrls: ['./issue.component.css']
})
export class IssueComponent implements OnInit {

  form=new FormGroup({
    title: new FormControl(null,[Validators.required]),
     description: new FormControl(null,[Validators.required]),    
   });

  // message to be display if Issue added or not
  message = '';

  // Form is created in html file and write code to make it functional using FormBuilder
  // Write logic to make all fields as mandatory

  constructor(private formBuilder: FormBuilder, private service:IssueService) {}

  ngOnInit() {
    this.clearForm();
  }

  // Implement onSubmit method to save a Issue, verify form is valid or not
  // Display message 'Title and Description should not be empty!!! Please verify details' if form is invalid
  // Display message 'Failed to add Issue!!' while error handling
  // Display message 'Issue added' if Issue is added
  onSubmit() {
   this.service.addIssue(this.form.value).subscribe(response=>{
    console.log(response);
    this.message="success";
    alert(this.message);
    
   });
    

  error=>{
    console.log(error); 
  this.message="error";
  alert(this.message);
  }
}
  

  // clearForm method is to reset the form after submitting
  clearForm() {
    this.form.reset();
  }

}
