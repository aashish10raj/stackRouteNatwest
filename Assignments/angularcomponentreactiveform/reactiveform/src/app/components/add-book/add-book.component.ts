import { Component, OnInit, ViewChild } from '@angular/core';
import { COMMA, ENTER, T } from '@angular/cdk/keycodes';
import { MatChipInputEvent } from '@angular/material/chips';
import { BookService } from 'src/app/shared/book.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

export interface Language {
  name: string;
}

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  visible = true;
  selectable = true;
  removable = true;
  addOnBlur = true;
  languageArray: Language[] = [];
  @ViewChild('chipList') chipList: any;
  @ViewChild('resetBookForm') myNgForm: any;

  readonly seperatorKeysCodes: number[] = [ENTER, COMMA];
  selectedBindingType: string | any;
  bookForm: FormGroup | any;
  BindingType: any = [
    'Paperback', 
    'Case binding', 
    'Perfect binding',
    'Saddle stitch binding',
    'Spiral binding'
  ];

  constructor(public fb: FormBuilder, private bookApi: BookService){}

  ngOnInit() {
    this.bookApi.GetBookList();
    this.submitBookForm();      
  }

  remove(language: Language): void{
     const index = this.languageArray.indexOf(language);
     if(index >= 0){
      this.languageArray.splice(index, 1);
     }
  }

  submitBookForm(){
    this.bookForm = this.fb.group({
      book_name: ['', [Validators.required]],
      isbn_10: ['', [Validators.required]],
      author_name: ['', [Validators.required]],
      publication_date: ['', [Validators.required]],
      binding_type: ['', [Validators.required]],
      in_stock: ['Yes'],
      languages: [this.languageArray],
    });
  }

  public handleError = (controlName: string, errorName: string)=>{
    return this.bookForm.controls[controlName].hasError(errorName);
  }

  add(event: MatChipInputEvent): void {
     const input = event.input;
     const value= event.value; 

     //Add Language
     if((value||'').trim() && this.languageArray.length<5){
      this.languageArray.push({
        name: value.trim(),
      });
     }
     // Reset 
     if(input){
      input.value = '';
     }
  }
  
  formatDate(e: any){
    var convertDate = new Date(e.target.value).toISOString().substring(0,10);
    this.bookForm
        .get('publication_date')
        .setValue(convertDate, {onlyself: true});
  }

  resetForm(){
    this.languageArray=[];
    this.bookForm.reset();
    Object.keys(this.bookForm.controls).forEach(key =>{
      this.bookForm.controls[key].setErrors(null)
    });
  }

  //Submit Book
  submitBook(){
    if(this.bookForm.valid){
        this.bookApi.AddBook(this.bookForm.value);
        this.resetForm();
    }
  }
}
