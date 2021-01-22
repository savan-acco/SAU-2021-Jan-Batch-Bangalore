import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Routes, RouterModule} from '@angular/router';
import { PostsComponent } from '../posts/posts.component';
import {HttpClientModule} from '@angular/common/http';

const routes:Routes=[
  {
    path:'posts',
    component:PostsComponent
  }
];


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
