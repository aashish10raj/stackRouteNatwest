Angular Framework
------------------
- angular.io
- Angular is a frontend application framework.
- It is used component based approach to create Angular application.



Angular Version:
----------------
Angular 1.0 - AngularJS -------> Written in JavaScript
Angular 2.0 - Angular2 ------> Written in TypeScript

Maintained by Google and released many version.


Framework:
----------
- Platform for developing software application.
- It is a kind of template or platform you can modify based on your requirements.


few important thing
-------------------
1. Component based apporach
2. SPA
3. Complete Framework


How do we setup Environment in  Angular ?

1. Node JS
2. Install the Angular CLI

Data Binding
-------------
- Communication
- Component to View
- View to Component

HTML File - app.component.html - Template
            app.component.ts - Component

1. String Interpolation:
     
     {{ }}


2. Property Binding:
[]

3. Class Binding

4. Style Binding:
   - Style binding is used to set a style of a view element. We can set the inline styles of an HTML element using the style binding in angular. You can also add styles conditionally to an element, hence creating a dynamically styled element.

5. Event Binding:
   - I would like to bind event
     (click)="name of the function"


Directive :
-----------
- It is a special type of attribute which will change behaviour of an element.

- Structural directives alter layout by adding, removing, and replacing elements in DOM.

- Attribute directives alter the appearance or behavior of an existing element.

*ngfor Directive:
NgFor is a built-in template directive that makes it easy to iterate over something like an array or an object and create a template for each item.


[ngClass] Directive
------------------
- Predefined directive
- Attribute directive
- Change the appearance of element

[ngStyle] Directive
--------------------

Component Interaction:
----------------------
- Passing data from one component to another component.
- It should have parent and child relationship

1. Parent to Child

The @Input() decorator in a child component or directive signifies that the property can receive its value from its parent component.

2. Child to Parent

@Output() marks a property in a child component as a doorway through which data can travel from the child to the parent.

The child component uses the @Output() property to raise an event to notify the parent of the change. To raise an event, an @Output() must have the type of EventEmitter, which is a class in @angular/core that you use to emit custom events.

Pipes:
------
- Tranaform a data.

for exanmple:
public name: string='Peter';

{{name | uppercase}}

PETER

Services & Dependency Injection
-------------------------------

Services:
---------
- It is reusable piece of code that will be called in any component.

CalculatorService --------> Need to injected based on the request.

HttpClient:
----------
- It is a predfined service.
- Helps to make HTTP Request

Observable:
  - It is a set of items which runs asynchronously /receive/transfer things asynchronously.
  - Object
  - Set of Item

Angular Form:
-------------
1. Template Driven Form
2. Reactive Form





























