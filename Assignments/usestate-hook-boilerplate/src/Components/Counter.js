import { useState } from "react";
import React from "react";

function Counter() {
    // Define count state value with default value 0
    const [counter, setCounter]= useState(0);
    // Define name state value with default value 'Guest'
    const [name, setName]= useState("Guest");
    // Define handleIncrement to increment count state value by 1
    function handleIncrement() {
        setCounter(counter+1);
    }

    // Define handleDecrement to decrement count state value by 1
    function handleDecrement() {
        setCounter(counter-1);
    }

    // Define handleNameChange to change name state value to 'Charlie
    function handleNameChange() {
        setName('Charlie');
    }

    return (
        <div>
            {/* Display Hi {name} */}
            <h2 id="greet">Hi {name}</h2>

            {/* Call handleDecrement when clicked */}
            <button id="dec" onClick={handleDecrement}>-</button>

            <span id="cnt">Count: {counter}</span>
            
            {/* Call handleIncrement when clicked */}
            <button id="inc" onClick={handleIncrement}>+</button>
            <br />
            <br />
            {/* Call handleNameChange when clicked */}
            <button id="cgName" onClick={handleNameChange}>Change Name</button>
        </div>
    )
}

export default Counter;