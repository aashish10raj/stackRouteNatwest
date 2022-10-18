import React from "react";
import LogoComponent from "./LogoComponent";
import ViewTitleComponent from "./ViewTitleComponent";

const HeaderComponent=()=>{
    return (
        <div>
        <h2>I am Header Component!!</h2>
        <LogoComponent />
        <ViewTitleComponent />
        </div>
    )
}

export default HeaderComponent;