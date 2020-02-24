import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './user/register/register.component';
import { LoginComponent } from './login/login.component';
import { LandingComponent } from './admin/landing/landing.component';
import { ImportComponent } from './admin/import/import.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { UsersComponent } from './users/users.component';
import { UserComponent } from './update/user/user.component';
import {from} from 'rxjs';
import { UserhomepageComponent } from './user1/userhomepage/userhomepage.component';
import { ComparecompanyComponent } from './user1/comparecompany/comparecompany.component';
import { AddcompanyComponent } from './admin/addcompany/addcompany.component';
import { StockexchangedetailsComponent } from './admin/stockexchangedetails/stockexchangedetails.component';
import { UpdatecompanyComponent } from './admin/updatecompany/updatecompany.component';
import { ComparesectorComponent } from './user1/comparesector/comparesector.component';
import { CompanyComponent } from './admin/company/company.component';
import { HomeComponent } from './home/home.component';
import { ManageIpoComponent } from './admin/manage-ipo/manage-ipo.component';
import { IpoComponent } from './admin/ipo/ipo.component';
import { UpdateIpoComponent } from './admin/update-ipo/update-ipo.component';
@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    LoginComponent,
    LandingComponent,
    ImportComponent,
    UsersComponent,
    UserComponent,
    UserhomepageComponent,
    ComparecompanyComponent,
    AddcompanyComponent,
    StockexchangedetailsComponent,
    UpdatecompanyComponent,
    ComparesectorComponent,
    CompanyComponent,
    HomeComponent,
    ManageIpoComponent,
    IpoComponent,
    UpdateIpoComponent,
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
