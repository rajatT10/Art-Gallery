import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { RouterGaurdService } from '../app.router-gaurd.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  hide : boolean = true;
  signInForm: FormGroup;

  constructor(private gaurd: RouterGaurdService,private router: Router) { }

  ngOnInit() {
    //Creating Sign Up Form
    this.signInForm = new FormGroup({
      'email' : new FormControl(null,Validators.email),
      'password': new FormControl(null)
    });
  }

  signIn() {
    console.log(this.signInForm);
    this.router.navigate(['/my-profile']);
  }

}
