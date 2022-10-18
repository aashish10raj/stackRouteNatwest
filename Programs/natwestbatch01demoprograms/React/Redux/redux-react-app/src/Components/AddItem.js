import React, { useState } from 'react'
import { connect } from 'react-redux';
import { addItem } from '../Redux/action';
import { v4 as uuidv4 } from 'uuid';
function AddItem(props) {
    const[text, setText]=useState('');
    function AddItemHandler(){
        const newItem ={
            id:uuidv4(),
            item:text
        }
        props.addItem(newItem);
    }
  return (
    <div className='input-group mt-3'>
        <input type='text' className='form-control' onChange={(e)=>setText(e.target.value)} placeholder='Enter Text'/>
        <button onClick={AddItemHandler} className='btn btn-outline-secondary' type='button'>Add</button>
    </div>
  )
}
const mapStateToProps=(state)=>({
    todoList: state?.todoList
});

export default connect(mapStateToProps, {addItem})(AddItem);