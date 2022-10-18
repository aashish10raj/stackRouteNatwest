import React, { useEffect, useState } from "react";
import Contact from "./Contact";
import { v4 as uuidv4 } from 'uuid';
const ContactList = () =>{
    if(Math.random()>0.5){
        throw Error('Error Occured')
    }
// const [state, setState]=useState(" ");
//    const [person, setPerson]=useState([
//     {
//         id:uuidv4(),
//         name: 'Ashish Raj',
//         email: 'Ashish@gmail.com',
//         city:'Hyderabad',
//         phone: '233-5678-123'
//     },
//     {
//         id:uuidv4(),
//         name: 'Divyani Das',
//         email: 'Divyani@gmail.com',
//         city:'Kolkata',
//         phone: '245-5890-345'
//     },
//     {
//         id:uuidv4(),
//         name: 'Harshitha S',
//         email: 'Harshitha@gmail.com',
//         city:'Chennai',
//         phone: '478-7890-321'
//     },
//     {
//         id:uuidv4(),
//         name: 'Deepi Garg',
//         email: 'Deepi@gmail.com',
//         city:'Delhi',
//         phone: '432-1234-567'
//     },
//     {
//         id:uuidv4(),
//         name: 'Amrutha H',
//         email: 'Amrutha@gmail.com',
//         city:'Mysore',
//         phone: '654-6543-2256'
//     },
//     {
//         id:uuidv4(),
//         name: 'Gaurav',
//         email: 'Gaurav@gmail.com',
//         city:'Mumbai',
//         phone: '654-6543-2256'
//     }

//    ])

 const [person, setPerson]=useState([]);

 useEffect(()=>{
    fetch('http://localhost:3001/persons')
    .then(res=>res.json())
    .then(data => {
        setPerson(data);
    });
},[]);
 
const DeleteContactCard=(id)=>{
    fetch(`http://localhost:3001/persons/${id}`,{
        method: 'DELETE'
    })
      .then(res=>res.json())
      .then(data=>{
      });
    setPerson(person.filter(item => item.id !=id));
}

// useEffect(()=>{
//     fetch('https://jsonplaceholder.typicode.com/users')
//     .then(res=>res.json())
//     .then(data => {
//         setPerson(data);
//     });
// },[]);


// const DeleteContactCard=(id)=>{
//     // console.log(id);
//     setPerson(person.filter(item => item.id !=id));
// }

// const getFirstName=(e)=>{
//     setFname(e.target.value);
// }
// const getLastName=(e)=>{
//     setLname(e.target.value);
// }
// const getEmail=(e)=>{
//     setEmail(e.target.value);
// }
// const getCity=(e)=>{
//     setCity(e.target.value);
// }
// const getPhone=(e)=>{
//     setPhone(e.target.value);
// }
    return(
        <div className="container mt-3">
            <div className="row">
                {
              person.map(item =><Contact deleteContact={DeleteContactCard} key={item.id} id={item.id} name={item.name} email={item.email} city={item.city} phone={item.phone}/>)
                }
                {/* <div className="col-md-3">
                <Contact name="Peter Parker" email="Peter@gmail.com" city="Delhi" phone="345-4567-556"/>
                </div>
                <div className="col-md-3">
                <Contact name=                "George Bush" email="George@gmail.com" city="Newyork" phone="221-8976-445"/>
                </div> */}
            </div>

        </div>

    )
}
export default ContactList;