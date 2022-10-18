import React from 'react'
import UserData from './UserData'

function Component3(props) {
  return (
    <div>
       <div className='container'>
       <div className='row'>
        {
        props.users.map(item=><div className='col-md-4'>
        <div class="card">
        <div class="card-body">
        <h5 class="card-title">{item.username}</h5>
        <p class="card-text">{item.email}</p>
        <p class="card-text">{item.phone}</p>
  </div>
</div>
</div>)
}
      </div>
      </div>
    </div>
  )
}

export default UserData(Component3)