import React from 'react';
import Adapter from 'enzyme-adapter-react-16';
import { shallow,configure } from 'enzyme';
import BodyComponent from '../Components/BodyComponent';

configure({adapter: new Adapter()});
// Scenario: Check if Name entered field contains text as `Name Entered: John` by default
test('Initial value of Name entered field to be John', () => {
    const FormWrapper = shallow(<BodyComponent />)
    const nameText = FormWrapper.find("#name_entered");
    expect(nameText.text()).toContain('Name Entered: John')
});