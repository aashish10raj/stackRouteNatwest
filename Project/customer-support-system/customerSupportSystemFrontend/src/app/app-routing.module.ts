import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApplicationFormComponent } from './components/application-form/application-form.component';
import { EmiCalculatorComponent } from './components/emi-calculator/emi-calculator.component';
import { LoanComponent } from './components/loan/loan.component';
import { ProductsComponent } from './components/products/products.component';
import { ProfilePageComponent } from './components/profile-page/profile-page.component';
import { SigninComponent } from './components/signin/signin.component';
import { SignupComponent } from './components/signup/signup.component';
import { CreditcardComponent } from './components/creditcard/creditcard.component';
import { CardApplicationComponent } from './components/card-application/card-application.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AuthGuard } from './services/auth.guard';

const routes: Routes = [
  {path:'', pathMatch:'full', redirectTo:'signin'},
  {path:'profile', component: ProfilePageComponent,canActivate: [AuthGuard]},
  {path:'dashboard', component: DashboardComponent,canActivate: [AuthGuard]},
  {path:'loan', component: LoanComponent,canActivate: [AuthGuard]},
  {path:'loan/:type', component: LoanComponent,canActivate: [AuthGuard]},
  {path:'signin',component:SigninComponent,pathMatch:'full'},
  {path:'signup',component:SignupComponent,pathMatch:'full'},
  {path:'products',component:ProductsComponent,canActivate: [AuthGuard]},
  {path:'applyLoan',component:ApplicationFormComponent},
  {path:'applyLoan/:type/:rate/:amt/:tenure',component:ApplicationFormComponent},
  {path:'emical',component:EmiCalculatorComponent},
  {path:'creditcard',component:CreditcardComponent,canActivate: [AuthGuard]},
  {path:'creditcard/:type',component:CreditcardComponent,canActivate: [AuthGuard]},
  {path:'applyCreditCard', component:CardApplicationComponent,canActivate: [AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
