import React, { useEffect, useState } from "react";
import Contact from "./Contact";
import {v4 as uuidv4} from 'uuid';

const ContactList = () => {
    const [state, setState]=useState(" ");
    // const [person, setPerson]=useState([
    //     {
    //         id:uuidv4(),
    //         name:'Aashish Raj',
    //         email: 'a@raj.com',
    //         city: 'Gurugram',
    //         phone: '9876543210'
    //     },
    //     {
    //         id:uuidv4(),
    //         name:'Shreya Raj',
    //         email: 'shreya@raj.com',
    //         city: 'London',
    //         phone: '9876223210'
    //     },
    //     {
    //         id:uuidv4(),
    //         name:'Abhishek Raj',
    //         email: 'abhi@raj.com',
    //         city: 'Bangaluru',
    //         phone: '9876543276'
    //     },
    //     {
    //         id:uuidv4(),
    //         name:'Priya Kumari',
    //         email: 'priya@raj.com',
    //         city: 'Bengaluru',
    //         phone: '9986543210'
    //     }
    // ])
    const [person, setPerson] = useState([]);
     useEffect(()=>{
        fetch('http://localhost:3001/persons')
        .then(res=>res.json())
        .then(data=>{
                setPerson(data);
        })
     });

     const DeleteContactCard=(id)=>{
       fetch(`http://localhost:3001/persons/${id}`,{
            method:'DELETE'
            
       }).then(res=>res.json())
       .then(data=>{
        
       });
    // console.log(id);
    }


   
// const DeleteContactCard=(id)=>{
//     setPerson(person.filter(item=>item.id !=id));
// // console.log(id);
// }
    return (
        <div className="container mt-3">
            <div className="row">
                {/* <div className="col-md-12">
               <Contact name="Aashish" email="a@raj.com" city="Gurugram" phone="1234567890"/>
                </div> */}

                {
               person.map(item=> <Contact deletecontact={DeleteContactCard}key={item.id} id={item.id} name={item.name} email={item.email} city={item.city}phone={item.phone}/>)
               }
                {/* <div className="col-md-4">
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
                </div> */}
            </div>

        </div>

    )
}
export default ContactList;