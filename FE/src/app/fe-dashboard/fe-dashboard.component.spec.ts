import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeDashboardComponent } from './fe-dashboard.component';

describe('FeDashboardComponent', () => {
  let component: FeDashboardComponent;
  let fixture: ComponentFixture<FeDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FeDashboardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FeDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
