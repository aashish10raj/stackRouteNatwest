import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Todo } from '../models/Todo';


@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})

export class TodoComponent implements OnInit {
  // todoList contains all todos
  todoList: any=[];
  isTodoListEmpty = false;
  status:String;

  constructor(private cdr: ChangeDetectorRef) { }

  ngOnInit() {
this.isTodoListEmpty=true;
// if(this.todoList.isCompleted){
//   this.status="Done";
  
// }
// else{
//   this.status="Pending";
// }
  }
  // write logic to the onAddTodo method is to add a new todo to list
  // get maximum id in list and assign maximum id plus one while adding a todo
  onAddTodo(todoText: any) {
    // console.log("adding todo");
    // console.log(this.todoList);   
   
    this.todoList.push({
      text: todoText,
      isCompleted: false,
      todoId:this.todoList.length,
      buttonText: "Done" 
    });
    this.isTodoListEmpty = false;
  }

  // write logic to the onClearTodos method to delete the all todos in the todoList
  onClearTodos() {
    // console.log("clearing the content");    
    this.todoList = []; 
    this.isTodoListEmpty = true;
  }

  // write logic to method onCompletingTask, to mark todo as as completed or not
  onCompletingTodo(todo: any) {
    if(this.todoList[todo].isCompleted){
      this.todoList[todo].isCompleted=false;
      this.todoList[todo].buttonText="Done";
     
    }
    else{
      this.todoList[todo].isCompleted=true;
      this.todoList[todo].buttonText="Pending";
      
    }
  }

  // write logic to method onDeletingTask, to delete the todo
  onDeletingTodo(todoId) {
    // console.log(todoId);    
    this.todoList.splice(todoId,1);
    this.cdr.detectChanges();
    
  }
}
