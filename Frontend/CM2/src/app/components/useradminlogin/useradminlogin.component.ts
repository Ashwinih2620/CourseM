import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { AuthUserService } from 'src/app/services/authuser.service';
import { AuthUserAdminService } from 'src/app/services/authuseradmin.service';

@Component({
  selector: 'app-useradminlogin',
  templateUrl: './useradminlogin.component.html',
  styleUrls: ['./useradminlogin.component.scss']
})
export class UserAdminLoginComponent implements OnInit {

  constructor(private authService: AuthUserAdminService,private router: Router) { }
  username: string = '';
  password: string = '';
  errorMessage: string = '';

  ngOnInit(): void {
  }

  onClick()
  {
    this.router.navigateByUrl("/signup");

  }

  login() {
    if (this.authService.login(this.username, this.password)) {
      // Redirect to dashboard or any desired route upon successful login
      this.router.navigate(['/userDashboard']);
    } else {
      // Show error message if login fails
      this.errorMessage = 'Invalid username or password';
    }
  }

  

}
