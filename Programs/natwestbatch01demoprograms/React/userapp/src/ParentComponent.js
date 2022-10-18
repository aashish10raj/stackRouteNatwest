import React, { Component } from 'react'
import MyPureComponent from './MyPureComponent';
import RegularComponent from './RegularComponent';

export default class ParentComponent extends Component {
    constructor(props){
        super(props);
        this.state={
            username:'john'
        }
    }
  render() {
    console.log('This is Parent Component');
    setInterval(()=>{
        this.setState({username:'James'});
    },2000);
    return (
      <div>
         <MyPureComponent name={this.state.username} />
         <RegularComponent name={this.state.username} />

      </div>
    )
  }
}
