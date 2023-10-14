export class User{
  constructor(
    public email:string,
    public username:string,
    private password:string
    ){}

    getPassword(){
      return this.password;
    }
}
