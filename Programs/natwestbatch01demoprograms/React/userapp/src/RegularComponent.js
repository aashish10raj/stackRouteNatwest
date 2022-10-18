import React, { Component } from 'react'

export default class RegularComponent extends Component {
  render() {
    console.log('This is Regular Component');
    return (
      <div>RegularComponent {this.props.name} </div>
    )
  }
}
