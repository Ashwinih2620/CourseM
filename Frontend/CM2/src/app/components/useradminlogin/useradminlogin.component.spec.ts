import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserAdminLoginComponent } from './useradminlogin.component';
describe('LoginComponent', () => {
  let component: UserAdminLoginComponent;
  let fixture: ComponentFixture<UserAdminLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserAdminLoginComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserAdminLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
