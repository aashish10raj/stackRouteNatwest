import React from 'react'

export default function TodoItem(props) {
  return (
    <div class="card" style={{width: "25rem"}}>
    <div class="card-body">
      <h5 class="card-title">{props.text}</h5>
    </div>
  </div>
  )
}
