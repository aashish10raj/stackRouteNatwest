import { Component, OnInit } from '@angular/core';
import { CalculatorService } from 'src/app/services/calculator.service';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
                      // Inject Dependecy
  constructor(private service:CalculatorService, private dataService:DataService) { }

  public result:number=0;
  public users:any;

  ngOnInit(): void {
    console.log(this.service.Sum(10,20));
    // this.result=this.service.Factorial(5);

    this.dataService.GetUsers().subscribe(data=>this.users=data);
  }
  Calculate(value:string){
    this.result=this.service.Factorial(parseInt(value));
  }

  // public service=new CalculatorService();

}
