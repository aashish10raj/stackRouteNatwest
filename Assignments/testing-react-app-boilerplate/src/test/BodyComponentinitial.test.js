import React from 'react';
import Adapter from 'enzyme-adapter-react-16';
import { shallow,configure } from 'enzyme';
import BodyComponent from '../Components/BodyComponent';

configure({adapter: new Adapter()});
// Scenario: Check if state value is set to `John` by default
test('Initial value of state to be John', () => {
    const FormWrapper = shallow(<BodyComponent />)
    expect(FormWrapper.state().value).toEqual('John')
});