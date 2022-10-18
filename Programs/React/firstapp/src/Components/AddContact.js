import {v4 as uuidv4} from 'uuid';
import React, { useEffect, useState } from "react";

export default function AddContact( {props}) {
    const [fname, setFname] = useState('');
    const [lname, setLname] = useState('');
    const [email, setEmail] = useState('');
    const [city, setCity] = useState('');
    const [phone, setPhone] = useState('');

    // const getFirstName = (e) => {
    //     setFname(e.target.value);
    // }
    // const getLastName = (e) => {
    //     setLname(e.target.value);
    // }
    // const getEmail = (e) => {
    //     setEmail(e.target.value);
    // }
    // const getCity = (e) => {
    //     setCity(e.target.value);
    // }
    // const getPhone = (e) => {
    //     setPhone(e.target.value);
    // }
const onSubmitHandler=()=>{
    fetch('http://localhost:3001/persons',{
        method:'POST',
        body: JSON.stringify({
            name:`${fname} ${lname}`,      
            email: email,
            city: city,
            phone: phone
        }),
        headers:{
            'Content-Type':'application/json'
        }
    }).then(res=>res.json())
    .then(data=>{
        props.history.push('/contacts');
        //alert("successfully added");

    })
    
    // const newContact ={
    //     id:uuidv4(),
    //     name:`${fname} ${lname}`,      
    //     email: email,
    //     city: city,
    //     phone: phone
    // }
    // console.log(newContact);
    // setPerson([...person, newContact])
}

  return (
    <div>
        <div className="container mt-3">
            <div className="row">
                {/* <div className="col-md-12">
               <Contact name="Aashish" email="a@raj.com" city="Gurugram" phone="1234567890"/>
                </div> */}

                {/* {
               person.map(item=> <Contact deletecontact={DeleteContactCard}key={item.id} id={item.id} name={item.name} email={item.email} city={item.city}phone={item.phone}/>)
               } */}
                <div className="col-md-4">
                    <div className="form-group">
                        <input type="text" placeholder="First Name" onChange={(e)=>setFname(e.target.value)} className="form-control" />
                    </div>
                    <div className="form-group">
                        <input type="text" placeholder="Last Name" onChange={(e)=>setLname(e.target.value)} className="form-control" />
                    </div>
                    <div className="form-group">
                        <input type="text" placeholder="Email id" onChange={(e)=>setEmail(e.target.value)} className="form-control" />
                    </div>
                    <div className="form-group">
                        <input type="text" placeholder="City" onChange={(e)=>setCity(e.target.value)} className="form-control" />
                    </div>
                    <div className="form-group">
                        <input type="text" placeholder="Phone" onChange={(e)=>setPhone(e.target.value)} className="form-control" />
                    </div>
                    <div className="form-group">
                        <button className="btn btn-primary" onClick={onSubmitHandler}>Submit</button>
                    </div>
                </div>
            </div>

        </div>
      
    </div>
  )
}
