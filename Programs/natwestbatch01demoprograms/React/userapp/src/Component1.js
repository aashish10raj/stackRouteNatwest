import React from 'react'
import UserData from './UserData'

function Component1(props) {
  return (
    <div>
       <div className='container'>
       <div className='row'>
        <div className='col-md-4 offset-md-4'>
            <ul className='list-group'>
                {
                    props.users.map(item=> <li className='list-group-item mt-3'>
                        <h3>{item.username}</h3>
                        <p>{item.email}</p>
                        <p>{item.phone}</p>
                    </li>)
                }
            </ul>
        
        </div>
      </div>
    </div>
    </div>
  )
}
export default UserData(Component1);
