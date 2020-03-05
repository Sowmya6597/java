import { Component, OnInit, Inject } from '@angular/core';
import {UserService} from 'src/app/service/user.service';
@Component({
  selector: 'app-activation',
  templateUrl: './activation.component.html',
  styleUrls: ['./activation.component.css']
})
export class ActivationComponent implements OnInit {

  msg;
  constructor(@Inject(UserService) private service) { }
  ngOnInit() {
    this.checkActivation()
  }
  checkActivation(){
    var urlad = document.URL
    var strarr = urlad.split("?")
    var str = strarr[1]
    str = str.substring(0, str.length-1);
    this.service.serviceActivation({email:str}).subscribe(dt => {
      if(dt.status=="ok"){
        this.msg="activation successfull"
      }
      else{
        this.msg="already activated"
      }
    });
  }

}
