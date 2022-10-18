import React, { Component } from 'react';
import AddItem from './AddItem';
import TodoItem from './TodoItem';
import './TodoList.css';

export default class TodoList extends Component {
    state={
        todos:[]
    }
    componentDidMount(){
        fetch('http://localhost:3001/todos')
        .then(res=>res.json())
        .then(data=>this.setState({todos:data}))
    }
    AddItemEvent(data){
        // console.log(data)
        fetch('http://localhost:3001/todos',{
            method: 'POST',
            body: JSON.stringify({
                title:data.title
            }),
            headers:{
                'Content-Type': 'application/json'
            }
        })
        this.setState({todos: [...this.state.todos,data]})
    }
  render() {
    return (
      <div className='jumbotron mt-3'>
        <h2>Todo List</h2>
        <AddItem AddItemHandler={this.AddItemEvent.bind(this)} />
        {
            this.state.todos.map(item=> <TodoItem key={item.id} title={item.title} />)
        }
        
      </div>
    )
  }
}
