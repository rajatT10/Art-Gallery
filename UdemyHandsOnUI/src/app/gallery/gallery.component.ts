import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gallery',
  templateUrl: './gallery.component.html',
  styleUrls: ['./gallery.component.css']
})
export class GalleryComponent implements OnInit {
  numbers = [1,2,3,4,5,6,7,8,9,10,11,1,1,1,1,1,1,1];
  constructor() { }

  ngOnInit(): void {
  }

}
