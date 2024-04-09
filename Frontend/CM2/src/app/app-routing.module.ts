import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { SignupComponent } from './components/signup/signup.component';
import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { UserLoginComponent } from './components/userlogin/userlogin.component';
import { UserDashboardComponent } from './components/user-dashboard/user-dashboard.component';
import { CourseDashboardComponent } from './components/course-dashboard/course-dashboard.component';
import { AddCourseComponent } from './components/add-course/add-course.component';
import { UserDashboardUserComponent } from './components/user-dashboard-user/user-dashboard-user.component';
const routes: Routes = [
  {
    path:'',
    component:HomeComponent,
    pathMatch:'full'
  },
  {
    path:"login",
    component:LoginComponent,
    pathMatch:'full'
  },
  {
    path:"dashboard",
    component:DashboardComponent,
    pathMatch:'full'
  },
  {
    path:"signup",
    component:SignupComponent,
    pathMatch:'full'
  },
  {
    path:"admindashboard",
    component:AdminDashboardComponent,
    pathMatch:'full'
  },
  {
    path:"userlogin",
    component:UserLoginComponent,
    pathMatch:'full'
  },
  {
    path:"userDashboard",
    component:UserDashboardComponent,
    pathMatch:'full'
  },

  {
    path:"courseDashboard",
    component:CourseDashboardComponent,
    pathMatch:'full'
  },

  {
    path:"addCourse",
    component:AddCourseComponent,
    pathMatch:'full'
  },
  {
    path:"userDashboardUser",
    component:UserDashboardUserComponent,
    pathMatch:'full'
  },


  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
