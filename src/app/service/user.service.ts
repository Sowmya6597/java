import { Injectable ,Inject} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  httpUrl='http://localhost:8080/register/';
  user:User;
  constructor(private httpClient:HttpClient,@Inject(HttpClient) private ht) { }
  saveUser(user:User):Observable<User>{
    return this.ht.post(this.httpUrl, user);
  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(`http://localhost:8080/register/${id}`);
  }
  getAllUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  updateUser(user :User): Observable<User>{
    return this.ht.put(`http://localhost:8080/register`,user);
  }
  getUserById(id: number): Observable<User> {
return this.ht.get(`http://localhost:8080/register/${id}`);
  }
}
