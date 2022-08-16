import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-fe-dashboard',
  templateUrl: './fe-dashboard.component.html',
  styleUrls: ['./fe-dashboard.component.css']
})
export class FeDashboardComponent implements OnInit {

  constructor(private formBuilder: FormBuilder) { }

  formValue!: FormGroup

  ngOnInit(): void {
    this.formValue = this.formBuilder.group({
      name: [''],
      email: [''],
      mobile: [''],
      address: [''],
      services: ['']
    })
  }

}
