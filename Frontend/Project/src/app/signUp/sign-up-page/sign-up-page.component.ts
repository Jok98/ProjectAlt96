import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Form, FormControl, FormGroup, Validators } from '@angular/forms';
import {  Router } from '@angular/router';
import { AuthService } from 'src/app/auth/auth.service';

@Component({
  selector: 'app-sign-up-page',
  templateUrl: './sign-up-page.component.html',
  styleUrls: ['./sign-up-page.component.css']
})
export class SignUpPageComponent implements OnInit{
/*   email = new FormControl('', [Validators.required, Validators.email]); */
  homeForm = new FormGroup({
    userN: new FormControl(null),
    ema:new FormControl("",[Validators.required,Validators.email]),
    pass : new FormControl(null,[Validators.required,Validators.minLength(8)])

  })

username  = "";
password  ="";
emails  ="";
constructor(private authServ: AuthService,private router: Router){

}
  ngOnInit(): void {

  }


/* save(){
let bodyData = {
  "username" : this.userName,
  "password" : this.password,
  "email" : this.ema

}
this.http.post("http://localhost:8082/auth/save",bodyData,{responseType : "text"}).subscribe((resultData:any) => {
console.log("Registrato con successo!");
this.router.navigate(["/login"]);

//console.log(resultData);
 })
}
 */


onSubmit(){

  this.username = this.homeForm.controls["userN"].value!;
this.password = this.homeForm.controls["pass"].value!;
this.emails =  this.homeForm.controls["ema"].value!;
console.log(this.emails)
console.log(this.password)
console.log(this.username)
this.save();

}


save(){
  this.authServ.signUp(this.username,this.password,this.emails).subscribe(data  => {
    console.log(data);
    this.router.navigate(["/login"]);
})


}


  hide = true;
}


