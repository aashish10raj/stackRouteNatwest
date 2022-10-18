import { Component, OnInit, ViewChild } from '@angular/core';
import { COMMA, ENTER } from '@angular/cdk/keycodes';
import { MatChipInputEvent } from '@angular/material/chips';
import { BookService } from 'src/app/shared/book.service';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
import { AsyncValidatorFn } from '@angular/forms';
export interface Language {
  name: string;
}

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent implements OnInit {

  visible = true;
  selectable = true;
  removable = true;
  addOnBlur = true;
  languageArray: Language[] = [];

  @ViewChild('chipList') chipList: any;

  readonly seperatorKeysCodes: number[] = [ENTER, COMMA];
  selectedBindingType: string | undefined;
  editbookForm!: FormGroup;
  BindingType: any = [
    'Paperback', 
    'Case binding', 
    'Perfect binding',
    'Saddle stitch binding',
    'Spiral binding'
  ];

  ngOnInit(){
    this.updateBookForm();
  }

  constructor(public fb: FormBuilder,
    private location: Location,
    private bookApi: BookService,
    private actRout: ActivatedRoute,
    private router: Router){

      var id : string = this.actRout.snapshot.params.id;
      this.bookApi
         .GetBook(id)
         .valueChanges()
         .subscribe((data:any)=>{
            this.languageArray = data.languages;
            this.editbookForm.setValue(data);
        });
    }

    // update book form 

    updateBookForm(){
      this.editbookForm = this.fb.group({
        book_name: ['', [Validators.required]],
        isbn_10: ['', [Validators.required]],
        author_name: ['', [Validators.required]],
        publication_date: ['', [Validators.required]],
        binding_type: ['', [Validators.required]],
        in_stock: ['', [Validators.required]],
        languages: [''],
      })
    }

    // Add languages

    add(event: MatChipInputEvent): void{
      var input: any = event.input;
      var value: any = event.value;
      if((value || '').trim() && this.languageArray.length<5)
      {
         this.languageArray.push({
          name: value.trim()
         });
      }

      if(input){
        input.value='';
      }
    }

    // Remove language

    remove(language: any): void{
      const index=this.languageArray.indexOf(language);
      if(index>=0){
        this.languageArray.splice(index,1);
      }
    }

    // Handle error

    public handleError = (controlName: string, errorName: string)=>{
      return this.editbookForm.controls[controlName].hasError(errorName);
    }

    // Date 
    formatDate(e: any){
      var convertDate = new Date(e.target.value).toISOString().substring(0,10);
      this.editbookForm.get('publication_date')?.setValue(convertDate, {
        onlyself: true,
      });
    }

    goBack(){
      this.location.back();
    }

    //Submit book
    updateBook(){
      var id: string = this.actRout.snapshot.params.id;
      if(window.confirm('Are you sure you wanna update?')){
        this.bookApi.UpdateBook(id, this.editbookForm.value);
        this.router.navigate(['books-list']);
      }
    }

}
