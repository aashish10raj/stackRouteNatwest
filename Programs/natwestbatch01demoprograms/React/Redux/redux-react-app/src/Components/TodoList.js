import React, { useEffect } from 'react'
import TodoItem from './TodoItem'
import { getItems } from '../Redux/action';
import { connect } from 'react-redux';

function TodoList(props) {
    useEffect(()=>{
        props.getItems();
    },[])
  return (
    <div className='mt-3'>
          {
            props.todoList !==undefined?props.todoList.map(todoItem=><TodoItem key={todoItem.id} id={todoItem.id} text={todoItem.item}/>):<div></div>
          }
    </div>
  )
}
const mapStateToProps=(state)=>({
    todoList: state?.todoList
});

export default connect(mapStateToProps, {getItems})(TodoList);