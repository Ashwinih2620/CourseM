import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthUserService {
  private isLoggedIn: boolean = false;
  private baseUrl="http://localhost:8080";

  constructor(private _http:HttpClient) { }
  public checkAdminLogin(user1:string , pass1:string)
  {
    let httpParams = new HttpParams();
    httpParams =  httpParams.append("username",user1);
    httpParams = httpParams.append("password",pass1);

    return this._http.get(`${this.baseUrl}/user/check`,{params:httpParams})
  }

  
  // login(username: string, password: string): boolean {
  //   // Simulate authentication logic (you can replace this with your own logic)
  //   if (username === 'User' && password === 'User@123') {
  //     this.isLoggedIn = true;
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }

  // logout(): void {
  //   this.isLoggedIn = false;
  // }

  // isAuthenticated(): boolean {
  //   return this.isLoggedIn;
  // }
}
