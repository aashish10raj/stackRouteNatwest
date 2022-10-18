import React from 'react';
import{render,screen} from '@testing-library/react'
import { fireEvent } from '@testing-library/react';
import BodyComponent from '../Components/BodyComponent';

//Scenario: Check if Name Entered field contains `Name Entered: Guest` when `button` is clicked
test('BodyComponent changes state value to default when clicked', () => {
    render(<BodyComponent />);
    const buttonComponent=screen.getByRole('button');
    fireEvent.click(buttonComponent);
    expect(screen.getByText(/Name Entered: Guest/)).toBeInTheDocument();
});