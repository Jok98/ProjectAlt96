import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './main/home-page/home-page.component';
import { GraficPageComponent } from './grafic/grafic-page/grafic-page.component';
import { LoginPageComponent } from './login/login-page/login-page.component';
import { SignUpPageComponent } from './signUp/sign-up-page/sign-up-page.component';
import { authGuard } from './auth/auth.guard';

const routes: Routes = [
  {path:"" , component: LoginPageComponent},
/*   {path:"home" , component: HomePageComponent, canActivate: [authGuard]},
  {path:"grafic" , component: GraficPageComponent , canActivate: [authGuard]}, */
  {path:"home" , component: HomePageComponent, },
  {path:"grafic" , component: GraficPageComponent },
  {path:"login" , component: LoginPageComponent},
  {path:"signUp",component: SignUpPageComponent},
  {path:"**",component: LoginPageComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
