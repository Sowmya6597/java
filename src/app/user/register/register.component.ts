import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { UserService } from 'src/app/service/user.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class SignupComponent implements OnInit {
  registerForm:FormGroup;
  constructor(private formBuilder:FormBuilder, private userService:UserService) { }
  
  addUser(){
     this.userService.saveUser(this.registerForm.value).subscribe(data => {
        alert('User Inserted Successfully' +data);
        this.registerForm.reset()
      });
    }
    
    deleteUser(){
      this.userService.deleteUser(this.registerForm.value).subscribe(data=>{
        alert('User Deleted Successfully' +data);
      });
    }  
  ngOnInit() {
    this.registerForm=this.formBuilder.group({
      id:[],
      name: ['',Validators.required],
      email: ['',[Validators.required,Validators.email]],
      password: ['',Validators.required],
      confirmpassword: ['',Validators.required],
     });
  }
}