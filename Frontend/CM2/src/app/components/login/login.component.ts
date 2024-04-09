import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  adminloginForm: FormGroup;
  errorMessage: any;
  constructor(private _builder:FormBuilder ,  
    private authService:AuthService , private _router:Router) 
  {
    this.adminloginForm = this._builder.group(
      {
        user:['',Validators.compose([Validators.required ])],
        pass:['',Validators.compose([Validators.required , Validators.minLength(6),Validators.maxLength(10)])]
      }
    );
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
            this._router.navigate(['/admindashboard']);
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

  onClick(){

    this._router.navigate(['/signup']);
  }

}
