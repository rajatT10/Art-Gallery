import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SignupComponent } from './authentication/signup/signup.component';
import { SigninComponent } from './authentication/signin/signin.component';
import { HomeComponent } from './home/home.component';
import { MyProfileComponent } from './my-profile/my-profile.component';
import { RouterGaurdService } from './authentication/app.router-gaurd.service';
import { FeedComponent } from './feed/feed.component';
import { ChangeForgotPasswordComponent } from './authentication/change-forgot-password/change-forgot-password.component';


const routes: Routes = [
  { path: 'feed', component: FeedComponent },
  { path: 'revive-password', component: ChangeForgotPasswordComponent},
  { path: 'signup', component: SignupComponent },
  { path: 'signin', component: SigninComponent },
  { path: '', component: HomeComponent },
  { path: '**', component: HomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
