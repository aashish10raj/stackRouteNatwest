import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Blog } from '../models/Blog';
import { BlogService } from '../services/blog.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent implements OnInit {

  form: any = {};

  // message to be display if blog added or not
  message = '';
  blog: Blog;
  // Form is created in html file and write code to make it functional using FormBuilder
  // Write logic to make all fields as mandatory for form and check email is valid or not
  constructor(private blogService: BlogService, public fb: FormBuilder) {
    this.form = this.fb.group({
      title: ['', Validators.required],
      authorName: ['',Validators.required],
      email:  ['', [Validators.required, Validators.email]],
      content: ['', Validators.required]
    })
  }

  ngOnInit() {
  }

  // Implement onSubmit method to save a Blog, verify form is valid or not
  // Display message 'Please verify entered details!!!' if form is invalid
  // Display message 'Blog added' if Blog is added
  // Display message 'Failed to add Blog!!' while error handling
  onSubmit() {
    if (this.form.valid) {
      this.blogService.addBlog(this.form.value).subscribe(data => {
        this.blog = data;
        this.message = 'Blog added'
        this.clearForm();
      },
      err=>{
        this.message='Failed to add Blog!!'
      })
    }
    else {
      this.message = 'Please verify entered details!!!';
    }
  }
  // clearForm method is to reset the form after submitting
  clearForm() {
    this.form.reset({
      title: '',
      authorName: '',
      email: '',
      content: ''

    })
  }
}