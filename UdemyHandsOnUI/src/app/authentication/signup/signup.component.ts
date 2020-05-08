import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { RestDataService } from 'src/app/data-services/rest-data-service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  hide: boolean = true;

  signUpForm: FormGroup;

  constructor(private _snackBar: MatSnackBar,private http: RestDataService, private router: Router) { }

  ngOnInit() {

    //Creating Sign Up Form
    this.signUpForm = new FormGroup({
      'name': new FormControl(null, Validators.required),
      'email': new FormControl(null, Validators.email),
      'password': new FormControl(null)
    });

  }

  signUp() {
    let responseMessage: any;
    let _snackData:any= {};
    this.http.saveOneEntity("saveUser", this.signUpForm.value).subscribe((response:any) => {
      responseMessage = response.message;
      _snackData.message = responseMessage;
      _snackData.url = "/signin";
    }, () => {
      _snackData.message = "Sorry, Registration was not successfull.";
      _snackData.url = "/";
      this._snackBar.open(_snackData.message,"OK").afterDismissed().subscribe(()=>{
        this.router.navigate([_snackData.url]);
      });
    }, () => {
      this._snackBar.open(_snackData.message,"OK").afterDismissed().subscribe(()=>{
        this.router.navigate([_snackData.url]);
      });
    });
  }

}
