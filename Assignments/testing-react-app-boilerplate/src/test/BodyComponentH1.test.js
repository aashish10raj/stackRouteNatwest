import React from 'react';
import{render,screen} from '@testing-library/react'
import BodyComponent from '../Components/BodyComponent';

//Scenario: Check if `h2` tag in BodyComponent contains text `Hello Charlie!!` when prop is sent as name="Charlie"
test("Checking h2 content in Body", () => {
    render(<BodyComponent name={"Charlie"}/>);
    expect(screen.getByText(/Hello Charlie!!/)).toBeInTheDocument();
})