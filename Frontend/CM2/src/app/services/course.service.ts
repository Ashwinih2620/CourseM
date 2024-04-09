import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Signup } from '../core/directives/signup';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  private baseUrl="http://localhost:8080";

  constructor(private _http:HttpClient) 
  {}

  public getDeos()
  {
    return this._http.get(`${this.baseUrl}/course/`);
  }

  public addDeos(data:Signup)
  {
    return this._http.post(`${this.baseUrl}/course/`,data)
  }

  public deleteDeos(course_id:number)
  {
    return this._http.delete(`${this.baseUrl}/course/`+course_id);
  }

 
}
