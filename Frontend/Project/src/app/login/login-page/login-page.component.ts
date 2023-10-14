import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth/auth.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent {
  homeForm = new FormGroup({
    userName: new FormControl(null),
   password:new FormControl(null,[Validators.required,Validators.minLength(8)])
    
  })
userN:string ="";
pass:string ="";
  hide:boolean = true;


  auth : boolean = true;
  errMsg : string = 'Spiacente, l \' username e/o la password sono errati!';

  constructor(private router: Router, private authServ: AuthService) {}

  ngOnInit(): void {
  }



  gestAuth = () => {

/*     if (this.userName === "Jo" && this.password === "123") {

      this.route.navigate(['home']);
      this.auth = true;

    }
    else {
      this.auth = false;
    } */
  }

  save(){
    this.authServ.signIn(this.userN,this.pass).subscribe(data  => {
      console.log(data);
      this.router.navigate(["/home"]);
  })
  }

  onSubmit(){
    this.userN = this.homeForm.controls["userName"].value!;
    this.pass = this.homeForm.controls["password"].value!;
    this.save();
  }
}
