import React, { useContext, useState } from 'react'
import AppContext from './AppContext'

export default function Comp1() {
    const {state, dispatch} = useContext(AppContext);
    const [country, setCountry]=useState('');
  return (
    <div>
      <h2>Component 1</h2>
      <input type="text" onChange={(e)=>setCountry(e.target.value)} />
      <button onClick={()=>dispatch({type:'ADD', value: country})}>Add</button>
    </div>
  )
}
