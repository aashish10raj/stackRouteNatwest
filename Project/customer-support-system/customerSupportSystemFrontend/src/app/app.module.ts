import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfilePageComponent } from './components/profile-page/profile-page.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoanComponent } from './components/loan/loan.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { SigninComponent } from './components/signin/signin.component';
import { SignupComponent } from './components/signup/signup.component';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { HttpClientModule } from '@angular/common/http';
import { MatIconModule } from '@angular/material/icon';
import { ProductsComponent } from './components/products/products.component';
import { ApplicationFormComponent } from './components/application-form/application-form.component';
import { EmiCalculatorComponent } from './components/emi-calculator/emi-calculator.component';
import { CreditcardComponent } from './components/creditcard/creditcard.component';
import { CardApplicationComponent } from './components/card-application/card-application.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { EncrDecrService } from './services/encr-decr.service';
import { AuthGuard } from './services/auth.guard';
import { FooterComponent } from './components/footer/footer.component';
import {MatSelectModule} from '@angular/material/select';
import {MatCheckboxModule} from '@angular/material/checkbox';
//import {EncrDecrService} from '../app/EncrDecr/encr-decr.service';
//import { authInterceptorProviders } from './services/auth.interceptor';


@NgModule({
  declarations: [
    AppComponent,
    ProfilePageComponent,
    NavbarComponent,
    LoanComponent,
    SigninComponent,
    SignupComponent,
    ProductsComponent,
    ApplicationFormComponent,
    EmiCalculatorComponent,
    CreditcardComponent,
    CardApplicationComponent,
    DashboardComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule,
    MatInputModule,
    FormsModule,
    ReactiveFormsModule,
    MatIconModule,
    MatSnackBarModule,
    HttpClientModule,
    MatSelectModule,
    MatCheckboxModule
  ],
  providers: [EncrDecrService,AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
