import React, { Component } from 'react'

export default class TodoItem extends Component {
  render() {
    return (
      <div className='alert alert-primary'>
        {this.props.title}   
      </div>
    )
  }
}
