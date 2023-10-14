import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { AuthService } from './auth.service';


export const authGuard: CanActivateFn = (route, state) => {
  const authServ = inject(AuthService);
  const router = inject(Router);
  if(authServ.isAuth()){

    return true;
  }
    alert("Non sei loggato!")
    router.navigate(["/login"])
  return false;

};
