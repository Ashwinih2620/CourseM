import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthUserAdminService {
  private isLoggedIn: boolean = false;

  constructor() { }

  login(username: string, password: string): boolean {
    // Simulate authentication logic (you can replace this with your own logic)
    if (username === 'Useradmin' && password === 'Useradmin@123') {
      this.isLoggedIn = true;
      return true;
    } else {
      return false;
    }
  }

  logout(): void {
    this.isLoggedIn = false;
  }

  isAuthenticated(): boolean {
    return this.isLoggedIn;
  }
}
