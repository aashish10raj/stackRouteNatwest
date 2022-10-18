import React, { PureComponent } from 'react'

export default class MyPureComponent extends PureComponent {
  render() {
    console.log('This is Pure Component');
    return (
      <div>MyPureComponent {this.props.name}</div>
    )
  }
}
