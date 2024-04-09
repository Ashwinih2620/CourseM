import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Courses } from 'src/app/core/directives/courses';
import { Signup } from 'src/app/core/directives/signup';
import { CourseService } from 'src/app/services/course.service';
import { SignupService } from 'src/app/services/signup.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-user-dashboard-user',
  templateUrl: './user-dashboard-user.component.html',
  styleUrls: ['./user-dashboard-user.component.scss']
})
export class UserDashboardUserComponent implements OnInit {
  

  deos!: Courses[];

  

  constructor(private _deoService:CourseService , private router: Router) { 

    
  }

  ngOnInit(): void {
    this.getAllDeo();
  }

  public getAllDeo()
  {
    this._deoService.getDeos().subscribe((data:any)=>{

      this.deos=data;
      console.log(data);
  },
  (error)=>
  {
    console.log(error);
    
  })
  }
  goback(){

    this.router.navigateByUrl("/");
  }
}
