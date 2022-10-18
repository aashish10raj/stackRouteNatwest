import { Injectable } from '@angular/core';
import { AngularFireDatabase, AngularFireList, AngularFireObject } from '@angular/fire/database';
import { Book } from './book';



@Injectable({
  providedIn: 'root'
})
export class BookService {

  booksRef: AngularFireList<any> | any;
  bookRef: AngularFireObject<any> | any;

  constructor(private db:AngularFireDatabase) { }

  AddBook(book:Book){
    this.booksRef.push({
      book_name: book.book_name,
      isbn_10: book.isbn_10,
      author_name: book.author_name,
      publication_date: book.publication_date,
      binding_type: book.binding_type,
      in_stock: book.in_stock,
      langugae: book.language
    })
    .catch((error:any)=>{
      this.errorMgmt(error);
    })
  }
  GetBook(id:string){
    this.bookRef=this.db.object('books-list/'+id);
    return this.bookRef;
  }

  GetBookList(){
    this.booksRef=this.db.list('books-list');
    return this.booksRef;
  }
  UpdateBook(id:string, book:Book){
    this.bookRef.update({
      book_name: book.book_name,
      isbn_10: book.isbn_10,
      author_name: book.author_name,
      publication_date: book.publication_date,
      binding_type: book.binding_type,
      in_stock: book.in_stock,
      langugae: book.language
    })
    .catch((error:any)=>{
      this.errorMgmt(error);
    })
  }

  DeleteBook(id:string){
    this.bookRef=this.db.object('books-list/'+id);
    this.bookRef.remove()
    .catch((error:any)=>{
      this.errorMgmt(error);
    })
  }
  errorMgmt(error: any) {
    throw new Error('Method not implemented.');
  }

}
