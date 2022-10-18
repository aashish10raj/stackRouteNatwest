import { render, screen } from '@testing-library/react';
import App from '../App';
// Scenario: Check if App component displays `Learn React!!` text in `h1` tag
test("Checking h1 content in APP", () => {
    render(<App />);
    const linkElement = screen.getByText(/Learn React!!/i);
    expect(linkElement).toBeInTheDocument();
})