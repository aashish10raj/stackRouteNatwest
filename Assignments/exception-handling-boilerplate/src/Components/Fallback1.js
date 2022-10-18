export default function Fallback1({error}) {
    return (
        // Display message 'Fallback Page for Page-1` when error raises in Child1 component
        <div>
        <h1>Fallback Page for Page-1</h1>
        <pre>{error.message}</pre>
    </div>
    )
}