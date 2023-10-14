import { Injectable } from '@angular/core';
import { User } from '../models/user.model';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})


export class AuthService {
 user: User | undefined;



  isLoggedIn = false;
  constructor(private http: HttpClient) { }

  isAuth(){
    return this.isLoggedIn
  }

  createUserWhenLoggedIn(email: string,username: string,password: string){
    this.user = new User(email,username,password);

  }

  signIn(username: string, password:string){
    let bodyData = {
      "username" : username,
      "password" : password
  
      }
      return this.http.post("http://localhost:8082/auth/login",bodyData,{responseType : "text"})
  }


  signUp(username: string, password:string , email:string){



   let bodyData = {
    "username" : username,
    "password" : password,
    "email" : email

    }

    return this.http.post("http://localhost:8082/auth/save",bodyData,{responseType : "text"})
  }


}
