import React, { Component } from 'react'

export default class AddItem extends Component {
    state= {title:'', id:0}

    AddItemButtonHandler(data){
        this.props.AddItemHandler(data);
    }
  render() {
    return (
      <div>
        <div className="form-group">
            <input type="text" onChange={(e)=>this.setState({title:e.target.value})} className="form-control" placeholder="Title"/>
        </div>
        <div className="form-group">
            <button type="button" onClick={this.AddItemButtonHandler.bind(this, this.state)} className='btn btn-secondary mt-1 mb-2'> Add </button>
        </div>
      </div>
    )
  }
}
