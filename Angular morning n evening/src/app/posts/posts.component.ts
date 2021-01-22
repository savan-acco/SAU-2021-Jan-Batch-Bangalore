import { Component, OnInit } from '@angular/core';
import {DataService} from './../data.service';
import {Observable} from 'rxjs';


@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  




   posts:Object;
  constructor(private data:DataService) { }

  ngOnInit(): void {
     console.log(this.data);
     this.data.GetPosts().subscribe(
       data=>this.posts=data
     );

    console.log(this.posts);

  }

}
