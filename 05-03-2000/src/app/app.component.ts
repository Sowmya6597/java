import { Component } from '@angular/core';
import {User} from './models/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private router:Router){}
  title = 'StockExchange';
  //user=new User(100,'sony','abc@gmail.com',9912899281);

  onClick(){
    console.log('ll');
    this.router.navigate(['/']);
  }
}
