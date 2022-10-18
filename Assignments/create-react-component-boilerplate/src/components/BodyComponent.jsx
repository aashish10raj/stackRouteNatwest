import React from "react";
import BodyLeftComponent from "./BodyLeftComponent";
import BodyRightComponent from "./BodyRightComponent";

const BodyComponent=()=>{
    return (
        <div>
        <h2>I am Body Component!!</h2>
        <BodyLeftComponent />
        <BodyRightComponent />        
        </div>
    )
}

export default BodyComponent;