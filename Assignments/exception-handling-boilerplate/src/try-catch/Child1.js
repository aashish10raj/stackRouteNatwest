import Fallback from "./FallBackChild1";

export default function Child1({name}) {
    
        // Implement Try-Catch block 
        // thus Fallback1 component is rendered when error exists in Child1 component
        // Else renders name of user
        try {
            return(
                <div>
                    <h1>Name of user: {name.toUpperCase()}</h1>
                </div>
            )        
        } catch (error) {
            return Fallback({error});
        }
    
}