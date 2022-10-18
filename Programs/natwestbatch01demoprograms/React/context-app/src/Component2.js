import React from 'react'
import AppContext from './AppContext'


export default function Component2() {
    const context=React.useContext(AppContext);
  return (
    <div>
      <h2> Component 2</h2>
      {/* <AppContext.Consumer>
        {
            (data) => {
                return <div>
                 <h3>{data.name}</h3>
                 <p>{data.age}</p>
                 </div>
            }
        }
      </AppContext.Consumer> */}
       <h3>{context.name}</h3>
        <p>{context.age}</p>
    </div>
  )
}
