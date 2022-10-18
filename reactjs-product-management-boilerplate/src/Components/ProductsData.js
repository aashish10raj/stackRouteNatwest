import React, { useEffect, useState }from 'react'
import Product from './Product';

export default function ProductsData(props) {
    const [products, setProducts]=useState([]);

    useEffect(()=>{
        fetch('http://localhost:3001/products')
        .then(res=>res.json())
        .then(data => {
            setProducts(data);
        });
     },[]);
     const DeleteContactCard=(id)=>{
        fetch(`http://localhost:3001/products/${id}`,{
            method: 'DELETE'
        })
          .then(res=>res.json())
          .then(data=>{
          });
        setProducts(products.filter(item => item.id !=id));
     }
    return (
        <div>
            <table className="table" >
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">ProductName</th>
                        <th scope="col">Brand</th>
                        <th scope="col">Quantity</th>
                        <th scope="col">Price</th>
                        <th scope="col">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {/* Write Your Code Here */}
                </tbody>
            </table>
            {
              products.map(item =><Product deleteContact={DeleteContactCard} key={item.id} id={item.id} prodname={item.prodname} brand={item.brand} quility={item.quility} price={item.price}/>)
            }
        </div>
    )
}
