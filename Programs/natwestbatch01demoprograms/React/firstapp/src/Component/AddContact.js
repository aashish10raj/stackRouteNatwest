import React, { useEffect, useState } from "react";
import { v4 as uuidv4 } from 'uuid';

export default function AddContact(props) {

const [fname, setFname]=useState('');
const [lname, setLname]=useState('');
const [email, setEmail]=useState('');
const [city, setCity]=useState('');
const [phone, setPhone]=useState('');

const onSubmitHandler= ()=>{
fetch('http://localhost:3001/persons',{
    method: 'POST',
    body: JSON.stringify({
        name: `${fname} ${lname}`,
        email: email,
        city : city,
        phone: phone
    }),
    headers:{
        'Content-Type': 'application/json'
    }
}).then(res=>res.json())
  .then(data=>{
    alert("Contact Created Successfully");
//     props.history.push('/contact');
  })

// setPerson([...person, newContact]);
// console.log(newContact);
}
  return (
    <div>
         <div className="container mt-3">
            <div className="row">
             <div className="col-md-4 offset-md-4">
                <div className="form-group">
                    <input type="text" placeholder="FirstName" onChange={(e)=>setFname(e.target.value)} className="form-control"/>
                </div>
                <div className="form-group">
                    <input type="text" placeholder="LastName" onChange={(e)=>setLname(e.target.value)} className="form-control"/>
                </div>
                <div className="form-group">
                    <input type="text" placeholder="Email" onChange={(e)=>setEmail(e.target.value)} className="form-control"/>
                </div>
                <div className="form-group">
                    <input type="text" placeholder="City" onChange={(e)=>setCity(e.target.value)} className="form-control"/>
                </div>
                <div className="form-group">
                    <input type="text" placeholder="Phone" onChange={(e)=>setPhone(e.target.value)} className="form-control"/>
                </div>
                <div className="form-group">
                    <button data-testid="btnSubmit" onClick={onSubmitHandler} className="btn btn-secondary">Submit</button>
                </div>
             </div>
             </div>
      </div>
    </div>
  )
}
 