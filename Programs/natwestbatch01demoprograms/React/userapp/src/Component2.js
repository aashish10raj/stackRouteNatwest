import React from 'react'
import UserData from './UserData'

function Component2(props) {
  return (
    <div>
       <div className='container'>
       <div className='row'>
        <div className='col-md-4 offset-md-4'>
        <table className='table table-striped'>
            <thead>
                <tr>
                <th>User Name</th>
                <th>Email</th>
                <th>phone</th>
                </tr>
            </thead>
            <tbody>
                {
                    props.users.map(item=><tr>
                        <td>{item.username}</td>
                        <td>{item.email}</td>
                        <td>{item.phone}</td>
                    </tr>)
                }
            </tbody>
        </table>
        
        </div>
      </div>
    </div>
    </div>
  )
}

export default UserData(Component2)