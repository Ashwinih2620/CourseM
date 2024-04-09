import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';
import { AuthUserService } from 'src/app/services/authuser.service';
import { AuthUserAdminService } from 'src/app/services/authuseradmin.service';

@Component({
  selector: 'app-user-table',
  templateUrl: './user-table.component.html',
  styleUrls: ['./user-table.component.scss']
})
export class UserTableComponent implements OnInit {

  constructor(private authService: AuthUserAdminService,private router: Router) { }
  
  ngOnInit(): void {
  }

  
  rows = [
    { id: 1, name: 'John', age: 30 },
    { id: 2, name: 'Alice', age: 25 },
    { id: 3, name: 'Bob', age: 35 }
  ];

  

}
