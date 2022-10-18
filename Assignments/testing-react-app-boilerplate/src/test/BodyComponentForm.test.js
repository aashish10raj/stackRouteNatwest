import React from 'react';
import Adapter from 'enzyme-adapter-react-16';
import { shallow,configure } from 'enzyme';
import BodyComponent from '../Components/BodyComponent';
configure({adapter: new Adapter()});
//Scenario: Check if form accepts input and changes state value
test('BodyComponent renders Form, accepts input and change state value', () => {
    const FormWrapper = shallow(<BodyComponent />)
    const forms = FormWrapper.find('input')

    forms.props().onChange({target: {
        value: 'Aashish'
      }});

      const nameText = FormWrapper.find("#name_entered");
      expect(nameText.text()).toContain('Name Entered: Aashish')
});