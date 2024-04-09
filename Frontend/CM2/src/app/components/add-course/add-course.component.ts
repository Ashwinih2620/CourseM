import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Courses } from 'src/app/core/directives/courses';
import { Signup } from 'src/app/core/directives/signup';
import { CourseService } from 'src/app/services/course.service';
import { SignupService } from 'src/app/services/signup.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.scss']
})
export class AddCourseComponent implements OnInit {
  // courseForm!: FormGroup;
  // signup: Signup | undefined;

  // constructor(private signUp: SignupService, private formBuilder: FormBuilder, private router: Router) {
  //   this.signupForm = this.formBuilder.group({
  //     username: ['', Validators.required],
  //     password: ['', [Validators.required, Validators.minLength(6)]],
  //     Mobile: ['', [Validators.required, Validators.minLength(6)]],
  //   });
  // }

  // ngOnInit(): void {


  // }
  // onSubmit() {

  // }
  // login() {
  //   this.router.navigateByUrl("/userlogin");
  // }

  // register() {
  //   if (this.signupForm.valid) {
  //     console.log(this.signupForm.value);
  //     this.signup = this.signupForm.value;


  //     Swal.fire({
  //       title: 'Do you want to save record of deo',
  //       showDenyButton: true,
  //       showCancelButton: true,
  //       confirmButtonText: 'Save',
  //       denyButtonText: `Don't save`,
  //     }).then((result) => {
  //       /* Read more about isConfirmed, isDenied below */
  //       if (result.isConfirmed) {
  //         this.signUp.addDeos(this.signupForm.value).subscribe((data) => {
  //           Swal.fire('Deo record saved Successfully !', '', 'success')
  //           console.log(data);
  //         },
  //           (error) => {
  //             console.log(error);
  //           }
  //         )
  //       }
  //       else if (result.isDenied) {
  //         Swal.fire('Changes are not saved', '', 'info')

  //       }
  //     })
  //   }
  //   else {
  //     console.log("Invalid");
  //   }
  // }

  // signupForm!: FormGroup;
  // signup: Signup | undefined;
  // constructor(private signUp: SignupService, private formBuilder: FormBuilder, private router: Router) {
  //   this.signupForm = this.formBuilder.group({
  //     username: ['', Validators.required],
  //     password: ['', [Validators.required, Validators.minLength(6)]],
  //     Mobile: ['', [Validators.required, Validators.minLength(6)]],
  //   });
  // }
  // ngOnInit(): void {
  // }
  // onSubmit() {
  // }
  // login() {
  //   this.router.navigateByUrl("/userlogin");
  // }
  // register() {
  //   if (this.signupForm.valid) {
  //     console.log(this.signupForm.value);
  //     this.signup = this.signupForm.value;
  //     Swal.fire({
  //       title: 'Do you want to save record of deo',
  //       showDenyButton: true,
  //       showCancelButton: true,
  //       confirmButtonText: 'Save',
  //       denyButtonText: `Don't save`,
  //     }).then((result) => {
  //       /* Read more about isConfirmed, isDenied below */
  //       if (result.isConfirmed) {
  //         this.signUp.addDeos(this.signupForm.value).subscribe((data) => {
  //           Swal.fire('Deo record saved Successfully !', '', 'success')
  //           console.log(data);
  //         },
  //           (error) => {
  //             console.log(error);
  //           }
  //         )
  //       }
  //       else if (result.isDenied) {
  //         Swal.fire('Changes are not saved', '', 'info')
  //       }
  //     })
  //   }
  //   else {
  //     console.log("Invalid");
  //   }
  // }
  courseForm!: FormGroup;
  deo1!: Courses;
  constructor(private _builder: FormBuilder, private _deoService: CourseService, private _router: Router) {
    this.courseForm = this._builder.group({
      courseId: [0],
      courseName: ['', Validators.compose([Validators.required, ])],
      price: ['', Validators.compose([Validators.required, ])],
      description: ['', Validators.compose([Validators.required,])],
    }
    );
  }
  ngOnInit(): void {
  }

  register() {
    if (this.courseForm.valid) {
      console.log(this.courseForm.value);
      this.deo1 = this.courseForm.value;


      Swal.fire({
        title: 'Do you want to save record of Course',
        showDenyButton: true,
        showCancelButton: true,
        confirmButtonText: 'Save',
        denyButtonText: `Don't save`,
      }).then((result) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
          this._deoService.addDeos(this.courseForm.value).subscribe((data) => {
            Swal.fire('Course record saved Successfully !', '', 'success')
            console.log(data);
            setTimeout(() => {
              this._router.navigate(['/courseDashboard']);
          }, 2000);
          },
            (error) => {
              console.log(error);
            }
          )
        }
        else if (result.isDenied) {
          Swal.fire('Changes are not saved', '', 'info')

        }
      })
    }
    else {
      console.log("Invalid");
    }
  }
}
