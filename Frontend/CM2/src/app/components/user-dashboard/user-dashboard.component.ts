import { Component, OnInit } from '@angular/core';
import { Signup } from 'src/app/core/directives/signup';
import { SignupService } from 'src/app/services/signup.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.scss']
})
export class UserDashboardComponent implements OnInit {
  deos!: Signup[];


  constructor(private _deoService:SignupService) {
  }

  ngOnInit(): void {
    this.getAllDeo();

  }

  public getAllDeo() {
    this._deoService.getDeos().subscribe((data: any) => {

      this.deos = data;
      console.log(data);
    },
      (error) => {
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

  addRow(){

  }

  saveRow()
  {
    
  }
}
