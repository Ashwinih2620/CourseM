import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { AuthUserService } from 'src/app/services/authuser.service';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.scss']
})
export class UserLoginComponent implements OnInit {
  adminloginForm: FormGroup;
  errorMessage: string = '';
  constructor(private _builder:FormBuilder , private authService: AuthUserService, private _router:Router) { 
    this.adminloginForm = this._builder.group(
      {
        user:['',Validators.compose([Validators.required ])],
        pass:['',Validators.compose([Validators.required , Validators.minLength(6),Validators.maxLength(10)])]
      }
    )
  }
  
  ngOnInit(): void {
  }

  login(){
    
    if(this.adminloginForm.valid)
    {
      var user1 = this.adminloginForm.get('user')?.value;
      var pass1 = this.adminloginForm.get('pass')?.value;
      
      
      this.authService.checkAdminLogin(user1,pass1).subscribe(response=>
        
        {
          
          if(response!=null)
          {
            this._router.navigate(['/userDashboardUser']);
          }
          else{
            alert("Login Failed");
          }

        },
        (error)=>
        {
          console.log(error);
        })
    }
  }

  onClick()
  {
    this._router.navigateByUrl("/signup");

  }

  // login() {
  //   if (this.authService.login(this.username, this.password)) {
  //     // Redirect to dashboard or any desired route upon successful login
  //     this.router.navigate(['/userDashboard']);
  //   } else {
  //     // Show error message if login fails
  //     this.errorMessage = 'Invalid username or password';
  //   }
  // }

  

}
