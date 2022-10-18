import { Component } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { LoginService } from './services/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'customerSupportSystem';


  // constructor(private login:LoginService) { }
  // loggedin: any;

  // xyz(flag: any){
  //   console.log(flag);
  //   this.loggedin=flag;
    
  // }
  
  // ngOnInit(): void {
  //     // if(this.login.isLoggedIn()){
  //     //       this.loggedin=true;
  //     //       console.log("nav");
            
  //     //       console.log(this.loggedin);
            
  //     // }
  // }

  currentRoute: string;
  r: string | undefined;
//  r:String;

  constructor(private router: Router) {
    this.currentRoute = "Demo";
    this.router.events.subscribe((event:any) => {

        if (event instanceof NavigationEnd) {
            this.currentRoute = event.url;
            console.log("app component");            
              // console.log(this.currentRoute);
              if(this.currentRoute == '/signup' || this.currentRoute== '/signin'){
                this.r=this.currentRoute;
                console.log(this.r);
                
              }
        }


    });

   

}
}




