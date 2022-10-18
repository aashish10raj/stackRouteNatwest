import React from 'react'

export default function UserData(Component) {
    const NewComponent=()=>{
    const [users, setUsers]=React.useState([]);
    React.useEffect(()=>{
        fetch('https://jsonplaceholder.typicode.com/users')
        .then(res=> res.json())
        .then(data=>setUsers(data));
    }, [])
        return <Component users={users} />
    }
  return NewComponent;
}
