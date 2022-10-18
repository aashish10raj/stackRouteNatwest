import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculatorComponent } from './calculator.component';

describe('Calculator Test Suit',()=>{
// let calculator=new CalculatorComponent();

let fixture:ComponentFixture<CalculatorComponent>;
let calculator:CalculatorComponent;

beforeAll(()=>{
  fixture=TestBed.createComponent(CalculatorComponent);
  calculator=fixture.componentInstance;
})

  it('Test1', ()=>{
    expect(true).toBe(true);
  })

  it('Test Addition of 2 Integers',()=>{
    let result=calculator.Add(10,20);
    expect(result).toBe(30);
  })

  it('Test Subtraction of 2 Integers',()=>{
    let result=calculator.Subtract(20,10);
    expect(result).toBe(10);
  })

  it('Test Multiplication of 2 Integers',()=>{
    let result=calculator.Multiply(10,20);
    expect(result).toEqual(200);
  })

  it('Test Division of 2 Integers',()=>{
    let result=calculator.Division(50,5);
    expect(result).toEqual(10);
  })

  it('Test Length of the Name',()=>{
    let length=calculator.GetLength('Rajeev');
    expect(length).toBeGreaterThan(5);
  })
})





// describe('CalculatorComponent', () => {
//   let component: CalculatorComponent;
//   let fixture: ComponentFixture<CalculatorComponent>;

//   beforeEach(async () => {
//     await TestBed.configureTestingModule({
//       declarations: [ CalculatorComponent ]
//     })
//     .compileComponents();

//     fixture = TestBed.createComponent(CalculatorComponent);
//     component = fixture.componentInstance;
//     fixture.detectChanges();
//   });

//   it('should create', () => {
//     expect(component).toBeTruthy();
//   });
// });
