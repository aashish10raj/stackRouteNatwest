import React, { useEffect, useState }from 'react'

export default function AddProduct(props) {

    // Write Your Code Here and handle the necessary exceptions
    const [prodname, setName]=useState('');
    const [brand, setBrand]=useState('');
    const [quality, setQuality]=useState('');
    const [price, setPrice]=useState('');
    
    function handleProductNameChange(e) {
        // Write Your Code Here
    }

    function handleBrandChange(e) {
        // Write Your Code Here
    }

    function handleQuantityChange(e) {
        // Write Your Code Here
    }

    function handlePriceChange(e) {
        // Write Your Code Here
    }

    // function handleFormSubmit(e) {
    //     // Write Your Code Here
    // }
    const handleFormSubmit= ()=>{
        fetch('http://localhost:3001/products',{
            method: 'POST',
            body: JSON.stringify({
                name: prodname,
                brand: brand,
                quality : quality,
                price: price
            }),
            headers:{
                'Content-Type': 'application/json'
            }
        }).then(res=>res.json())
          .then(data=>{
            
        //     props.history.push('/contact');
          })
    }
    return (
        <div>
            <div className="container mt-3">
                <div className="row">
                <div className="col-md-4 offset-md-4">
                    <div className="form-group">
                        <input type="text" placeholder="ProductName" onChange={(e)=>setName(e.target.value)} className="form-control"/>
                    </div>
                    <div className="form-group">
                        <input type="text" placeholder="Brand" onChange={(e)=>setBrand(e.target.value)} className="form-control"/>
                    </div>
                    <div className="form-group">
                        <input type="text" placeholder="Quality" onChange={(e)=>setQuality(e.target.value)} className="form-control"/>
                    </div>
                    <div className="form-group">
                        <input type="text" placeholder="Price" onChange={(e)=>setPrice(e.target.value)} className="form-control"/>
                    </div>
                    <br />

                    <div className="form-group">
                        <button onClick={handleFormSubmit} className="btn btn-secondary">Submit</button>
                    </div>
                </div>
                </div>
      </div>
            {/* Write Your Code Here */}
        </div>
    )
}

//export default AddProduct;