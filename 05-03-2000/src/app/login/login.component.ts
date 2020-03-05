import { Component, OnInit } from '@angular/core';
import {FormGroup,FormBuilder, FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  signinForm:FormGroup;
  constructor(private formBuilder:FormBuilder) { }
      
      ngOnInit() {
        this.signinForm=this.formBuilder.group({
          email : ['',Validators.required],
          password : ['',Validators.required]
        })
      }
      onSubmit():void{
        console.log(this.signinForm.value);
    }
    }
    