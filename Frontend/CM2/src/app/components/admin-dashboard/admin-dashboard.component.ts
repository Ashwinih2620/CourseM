import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.scss']
})
export class AdminDashboardComponent implements OnInit {

  isUser: boolean = true;
  isCourse = false;
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onClick() {

    this.isCourse = true;
    this.isUser = false;
  }
  onClickUsers() {

    this.isUser = true
    this.isCourse = false;
  }

  goback(){

    this.router.navigateByUrl("/");
  }
  
  
}
