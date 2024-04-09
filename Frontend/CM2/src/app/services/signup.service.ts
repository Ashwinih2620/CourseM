import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Signup } from '../core/directives/signup';

@Injectable({
  providedIn: 'root'
})
export class SignupService {
  private baseUrl="http://localhost:8080";

  constructor(private _http:HttpClient) 
  {}

  public getDeos()
  {
    return this._http.get(`${this.baseUrl}/user/`);
  }

  public addDeos(deo:Signup)
  {
    return this._http.post(`${this.baseUrl}/user/`,deo)
  }

  public deleteDeos(user_id:number)
  {
    return this._http.delete(`${this.baseUrl}/user/`+user_id);
  }

 
}
