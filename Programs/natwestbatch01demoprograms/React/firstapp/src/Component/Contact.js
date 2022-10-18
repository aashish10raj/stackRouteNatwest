import React from 'react';

const Contact=(props)=>{
    const DeleteClickHandler = (id)=>{
        // console.log(id);
        props.deleteContact(id);
    }
    return(
        <div class="col-md-3">
        <div  data-testid="card" className="card" style={{width: '18rem'}}>
        <div className="card-body">
        <span onClick={DeleteClickHandler.bind(this,props.id)}><i class="fas fa-times float-end fa-lg text-danger"/></span>
        <h5 className="card-title">{props.name}</h5>
        <p className="card-text">{props.email}</p>
        <p className="card-text">{props.city}</p>
        <p className="card-text">{props.phone}</p>
       </div>
        </div>
        </div>
       
    )
}
export default Contact;