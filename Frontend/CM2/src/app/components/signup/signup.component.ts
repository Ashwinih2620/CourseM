import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Signup } from 'src/app/core/directives/signup';
import { SignupService } from 'src/app/services/signup.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {
  // sign
  signupForm: FormGroup;
  deo1!: Signup;
  constructor(private _builder: FormBuilder, private _deoService: SignupService, private _router: Router) {
    this.signupForm = this._builder.group({
      user_id: [0],
      username: ['', Validators.compose([Validators.required, Validators.minLength(4), Validators.maxLength(20)])],
      password: ['', Validators.compose([Validators.required, Validators.minLength(4), Validators.maxLength(20)])],
      mobile: ['', Validators.compose([Validators.required, Validators.maxLength(20)])],


    }
    );
  }
  ngOnInit(): void {
  }

  register() {
    if (this.signupForm.valid) {
      console.log(this.signupForm.value);
      this.deo1 = this.signupForm.value;

      Swal.fire({
        title: 'Do you want to save record of deo',
        showDenyButton: true,
        showCancelButton: true,
        confirmButtonText: 'Save',
        denyButtonText: `Don't save`,
      }).then((result) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
          this._deoService.addDeos(this.signupForm.value).subscribe((data) => {
            Swal.fire('Deo record saved Successfully !', '', 'success')
            console.log(data);
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