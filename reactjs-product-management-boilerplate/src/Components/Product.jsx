import React from 'react';

const Product=(props)=>{
    const DeleteClickHandler = (id)=>{
        // console.log(id);
        props.deleteContact(id);
    }

    return(
        <div class="col-md-3">
        <div className="card" style={{width: '18rem'}}>
        <div className="card-body">
        <span onClick={DeleteClickHandler.bind(this,props.id)}><i class="fas fa-times float-end fa-lg text-danger"/></span>
        <h5 className="card-title">{props.prodname}</h5>
        <p className="card-text">{props.brand}</p>
        <p className="card-text">{props.quility}</p>
        <p className="card-text">{props.price}</p>
       </div>
        </div>
        </div>
       
    )
}
export default Product;