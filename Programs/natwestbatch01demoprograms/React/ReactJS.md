#  What is React ?

- React is an open source javaScript library for building user interfaces.
- It uses JSX that makes it easy for web developers to modify their DOM by using simple, HTML style code.
- Used to create single page application.
- React is referred as "V" in MVC.

# Why use React ?

- Developed and maintained by Facebook.
- Very popular among frotend developers.
- Huge community
- Easy to use and maintain
- Lightweight as compared to other UI Frameworks.
- Virtual DOM

# How React Works ?

# Thinking in Components

# What is SPA & How it works ?

# Prerequisites to Learn React

- HTML, CSS
- JavaScript Fundamentals
- ES6 Syntaxt
- Basic programming funadaments

# Setting up the enviroments

- Node JS
- VS Code
- Latest Chrome Browser
   - Install React Developer Tools

# Different ways of using React

1. Using CDN

   <script crossorigin src="https://unpkg.com/react@18/umd/react.development.js"></script>
   <script crossorigin src="https://unpkg.com/react-dom@18/umd/react-dom.development.js"></script>

2. Using Command Line
   
   npx create-react-app my-app
   cd my-app
   npm start

# Let's Code


# 2 Different Approach
    
    1. Functional Component
    2. Class based Component

   for installing Bootstrap  ----> npm install --save bootstrap

   --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

   React Testing Library:
   ---------------------
   - React Testing Library is a library for Testing React Application.
   - RTL focuses on testing components from the end-user's experience rather than testing the implementation and logic of the 
     underlying React components.


   - npx create-react-app - By default will get testing library installed
   - npm install @testing-library/react --save-dev


render():
----------
- The RTL provides a render() method for virtually rendering React components in the testing environment.

Screen object
--------------
- The screen object from the RTL provides method for querying the rendered elements of the DOM in order to make assesrtions about their 
  text content, attributes and more.

  for example:
               screen.getByText("About Us");

Jest DOM
--------
- The @testing-library/jest-dom package contains DOM-specfic matcher methods for testing front-end application with Jest.

- for example:
               .toBeInTheDocument()
               .toHaveValue
               .toHaveStyle


For Example :

Creating AboutUs Component 

Components folder ----------> AboutUs Folder ---------> 
                                                         AboutUs.js
                                                         AboutUs.css
                                                         AboutUs.test.js

---------------------------------------------------------------------------------------------------------------------------------------

- Optimizing Performance of React App
- Error Boundary
- Higher Order Components
- Pure Component
- Web Pack

PureComponent
--------------
- Similar to regular component.
- Need to import React.PureComponent
- Has shouldComponentUpdate method
