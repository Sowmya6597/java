import { Injectable ,Inject} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  httpUrl=`http://localhost:8080/registerall/`;
  user:User;
  constructor(private httpClient:HttpClient ,@Inject(HttpClient) private ht) { }
  saveUser(user:User):Observable<User>{
    return this.httpClient.post<User>(this.httpUrl, user);
  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(this.httpUrl+id);
  }
  getAllUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  updateUser(user :User): Observable<User>{
    return this.ht.put(this.httpUrl,user);
  }
  getUserById(id: number): Observable<User> {
return this.ht.get(this.httpUrl+id);
  }
  serviceActivation(obj){
    return this.ht.put(this.httpUrl+"/activate",obj)
  }
}
