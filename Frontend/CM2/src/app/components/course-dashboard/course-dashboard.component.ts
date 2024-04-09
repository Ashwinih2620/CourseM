import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Courses } from 'src/app/core/directives/courses';
import { CourseService } from 'src/app/services/course.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-course-dashboard',
  templateUrl: './course-dashboard.component.html',
  styleUrls: ['./course-dashboard.component.scss']
})
export class CourseDashboardComponent implements OnInit {
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
  deleteDeos(id:number)
  {
    Swal.fire({
      title: 'Are you sure to delete this deo record?',
      text: "You won't be able to revert this!",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes, delete it!'
    }).then((result) => {
      if (result.isConfirmed) {

        this._deoService.deleteDeos(id).subscribe((data)=>
    {
        
        this.getAllDeo();
    })

        Swal.fire(
          'Deleted!',
          'Deo record has been deleted.',
          'success'
        )
      }
    })
  }
  addCourse()
  {
    this.router.navigateByUrl("/addCourse");
    
  }
  goback(){

    this.router.navigateByUrl("/admindashboard");
  }
}
