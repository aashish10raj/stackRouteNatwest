import React from "react";
import {render, screen} from '@testing-library/react';
import { render as renderer, unmountComponentAtNode } from "react-dom";
import AboutUs from "./Component/AboutUs";
import Header from "./Component/Header";
import App from "./App";
import Footer from "./Component/Footer";
import AddContact from "./Component/AddContact";
import Contact from "./Component/Contact";

let element;

beforeEach(()=>{
  element=document.createElement('div');
  document.body.appendChild(element);
})

afterEach(()=>{
  unmountComponentAtNode(element);
  element.remove();
  element=null;
})

describe('Contact Manager Test Cases', ()=>{

  // test('Should render AboutUs Component', ()=>{
  //   render(<AboutUs />);
  // })

  test('Should render AboutUs Component with About Us Text', ()=>{
    render(<AboutUs />);
    expect(screen.getByText('About Us')).toBeInTheDocument();
  })

  test('Should render Header Component with Contact Manager Text', ()=>{
    // render(<App/>);
    // expect(screen.getByText('Contact Manager')).toBeInTheDocument();
       const {getByText} =render(<App />);
       expect(getByText('Contact Manager')).toBeInTheDocument();
  })

  test('Should have 6 links in Header Component', ()=>{
    // const element =document.createElement('div');
    renderer(<App />, element);
    const count=element.getElementsByTagName('a').length;
    expect(count).toBe(7);
  })

  test('Should have 1 link in Footer Component', ()=>{
    // const element =document.createElement('div');
    renderer(<Footer />, element);
    const count=element.getElementsByTagName('a').length;
    expect(count).toBe(1);
  })

  test('Should have submit text in submit button of AddContact', ()=>{
    render(<AddContact />);
    expect(screen.getByTestId('btnSubmit')).toHaveTextContent('Submit');
  })

  test('Contact Component should have bootstrap card class', ()=>{
    render(<Contact />);
    expect(screen.getByTestId('card')).toHaveClass('card');
  })

  test('Hyperlinks should have nav-link active class', ()=>{
    // const element =document.createElement('div');
    renderer(<App />, element);
    const links=element.getElementsByTagName('a');
    for(let i=1; i<links.length; i++){
      expect(links[i]).toHaveClass('nav-link');
    }
  })



})