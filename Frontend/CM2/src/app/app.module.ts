import { NgModule, importProvidersFrom } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { HomeComponent } from './home/home.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { MaterialModule } from './shared/material.module';
import { SignupComponent } from './components/signup/signup.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { UserLoginComponent } from './components/userlogin/userlogin.component';
import { UserDashboardComponent } from './components/user-dashboard/user-dashboard.component';
import { UserAdminLoginComponent } from './components/useradminlogin/useradminlogin.component';
import { FormsModule } from '@angular/forms';
import { UserTableComponent } from './components/user-table/user-table.component';
import { HttpClientModule } from '@angular/common/http';
import { CourseDashboardComponent } from './components/course-dashboard/course-dashboard.component';
import { AddCourseComponent } from './components/add-course/add-course.component';
import { UserDashboardUserComponent } from './components/user-dashboard-user/user-dashboard-user.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    DashboardComponent,
    SignupComponent,
    AdminDashboardComponent,
    UserDashboardComponent,
    UserAdminLoginComponent,
    UserLoginComponent,
    LoginComponent,
    UserTableComponent,
    CourseDashboardComponent,
    AddCourseComponent,
    UserDashboardUserComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MaterialModule,
    FormsModule,
    HttpClientModule
    

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
