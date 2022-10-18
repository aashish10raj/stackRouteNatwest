import React from "react";
import LogoComponent from "./LogoComponent";
import ViewTitleComponent from "./ViewTitleComponent";
import './Component.css';

class HeaderComponent extends React.Component {
    // Define Constructor
    constructor(props) {
        super(props);
        this.state = { value: "" };
        this.handleChange = this.handleChange.bind(this);
    }

    //Define handleChange method
    handleChange(event) {//update the value of event that has came as call back argument from child 
        this.setState({ value: event });
    }

    render() {
        return (
            <div className="HeaderComponent">
                <h2> I am Header Component with title from child: {this.state.value}</h2>
                <LogoComponent input={this.state.value}></LogoComponent>
                {/* Define event to handle changes in ViewTitleComponent */}
                <ViewTitleComponent
                    input={this.state.value}
                    handleChangeRef={this.handleChange}>
                </ViewTitleComponent>
            </div>
        );
    }
}
export default HeaderComponent;

// import React, { useState } from 'react'
// import ViewTitleComponent from "./ViewTitleComponent";
// import LogoComponent from "./LogoComponent";
// import './Component.css';

// export default function HeaderComponent() {
//     const [name, setName] =useState();

//     const handleChange=(props)=>{
//         setName(props);
//     }
    
//   return (
//     <div>
//       <div className="HeaderComponent">
//                  <h2> I am Header Component with title from child: {name}</h2>
//                  <LogoComponent input={name}></LogoComponent>
//                  {/* Define event to handle changes in ViewTitleComponent */}
//                  <ViewTitleComponent handleChange={handleChange} input={name}></ViewTitleComponent>
//             </div>
//     </div>
//   )
// }
