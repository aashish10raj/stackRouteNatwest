import { Component, OnInit, ViewChild } from '@angular/core';
import { Book } from 'src/app/shared/book';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { BookService } from 'src/app/shared/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})


export class BookListComponent implements OnInit {

  dataSource!: MatTableDataSource<Book>;
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  BookData: any = [];
  displayedColumns: any[] = [
    '$key',
    'book_name',
    'author_name',
    'publication_name',
    'in_stock',
    'action'
  ];

  constructor(private bookApi: BookService) {
    this.bookApi.GetBookList().snapshotChanges().subscribe((books:any[])=>{

      books.forEach(item => {
        let a = item.payload.toJSON();
        a['$key']= item.key;
        this.BookData.push(a as Book);
      });
      //Data table
      this.dataSource = new MatTableDataSource(this.BookData);
      //Pagination
      setTimeout(()=>{
        this.dataSource.paginator = this.paginator;
      }, 0);
    })
   }

   ngOnInit(){}

   deleteBook(index:number, e:any){
    if(window.confirm('Are you sure?')){
      const data = this.dataSource.data;
      data.splice(
        this.paginator.pageIndex* this.paginator.pageSize + index,1
        );
        this.dataSource.data = data;
        this.bookApi.DeleteBook(e.$key);
    }
   }

}
