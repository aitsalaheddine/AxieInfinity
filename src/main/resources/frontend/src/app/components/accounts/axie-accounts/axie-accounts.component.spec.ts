import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AxieAccountsComponent } from './axie-accounts.component';

describe('AxieAccountsComponent', () => {
  let component: AxieAccountsComponent;
  let fixture: ComponentFixture<AxieAccountsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AxieAccountsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AxieAccountsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
