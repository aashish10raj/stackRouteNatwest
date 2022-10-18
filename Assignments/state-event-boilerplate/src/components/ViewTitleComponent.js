import React from 'react';
class ViewTitleComponent extends React.Component {
    // Define Constructor
    constructor(props) {
        super(props);
        this.handleValChange = this.handleValChange.bind(this);
    }

    // Define handleValChange method
    handleValChange({ target }) {
        this.props.handleChangeRef(target.value);
    }

    render() {
        return (
            <div className="ViewTitleComponent">
                <form>
                    <div>
                        <label>View Title:</label>
                        {/* Define input foeld to handle changes */}
                        <input type="text" onChange={this.handleValChange} />
                    </div>
                </form>
                <p>Title value: {this.props.input}</p>
            </div>
        );
    }
}
export default ViewTitleComponent;

// import React, { useState } from "react";


// export default function ViewTitleComponent(props) {

//     const [name, setName] = useState();

//     function handleValChange(event) {
//         props.handleChange(event.target.value);
//         setName(event.target.value);
       
//         // console.log(props);
//     }
//     return (
//         <div>
//             <div className="ViewTitleComponent">
//                 <form>
//                     <div>
//                         <label>View Title:</label>
//                         {/* Define input foeld to handle changes */}
//                         <input type="text" onChange={handleValChange} />
//                     </div>                
//                      </form>
//                 <p>Title value: {name}</p>
//             </div>
//         </div>
//     )
// }
