import { ErrorBoundary } from "react-error-boundary";
import Fallback1 from "./Fallback1";
import Fallback2 from "./Fallback2";
import Child1 from "./Child1";
import Child2 from "./Child2";



function Parent() {
    return(
        <div>
              <ErrorBoundary FallbackComponent={Fallback1}>
                <Child1 />
            </ErrorBoundary>
            <ErrorBoundary FallbackComponent={Fallback2}>
                <Child2 />
            </ErrorBoundary>
            {/* Call Child1 and Child2 component */}
            {/* Such that Fallback1 component has to be rendered if props for Child1 is not provided */}
            {/* Display name in child1 when props is provided */}
            {/* Such that Fallback2 component has to be rendered if props for Child2 is not provided */}
            {/* Display locality in child2 when props is provided */}
        </div>
    )
}

export default Parent;