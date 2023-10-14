import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './main/home-page/home-page.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavBarComponent } from './pageC/nav-bar/nav-bar.component';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatTableModule} from '@angular/material/table';
import {NgFor, NgIf} from '@angular/common';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import { GraficPageComponent } from './grafic/grafic-page/grafic-page.component';
import {MatMenuModule} from '@angular/material/menu';
import { LoginPageComponent } from './login/login-page/login-page.component';
import {CurrencyPipe} from '@angular/common';
import { FormsModule } from '@angular/forms';
import { SignUpPageComponent } from './signUp/sign-up-page/sign-up-page.component';
import { ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {MatSelectModule} from '@angular/material/select';
import { NgApexchartsModule } from "ng-apexcharts";


@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    NavBarComponent,
    GraficPageComponent,
    LoginPageComponent,
    SignUpPageComponent,




  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    MatInputModule,
    MatTableModule,
    NgIf,
    NgFor,
    MatFormFieldModule,
    MatMenuModule,
    FormsModule,
    CurrencyPipe,
    ReactiveFormsModule,
    HttpClientModule,
    MatSelectModule,
    NgApexchartsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
