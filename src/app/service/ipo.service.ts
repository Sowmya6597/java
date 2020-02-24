import { Injectable,Inject} from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Ipo} from 'src/app/models/updateipo';
@Injectable({
  providedIn: 'root'
})
export class IpoService {

  httpUrl='http://localhost:8080/ipoall/';
  ipo:Ipo;
  constructor(private httpClient:HttpClient,@Inject(HttpClient) private ht) { }
  saveIpo(ipo:Ipo):Observable<Ipo>{
    return this.httpClient.post<Ipo>(this.httpUrl, ipo);
  }
  deleteIpo(id:number):Observable<Ipo>{
    return this.ht.delete(`http://localhost:8080/deleteipo/${id}`);
  }
  getAllIpos():Observable<Ipo[]>{
    return this.httpClient.get<Ipo[]>(this.httpUrl);
  }
  updateIpo(ipo :Ipo): Observable<Ipo>{
    return this.ht.put(`http://localhost:8080/updateipo`,ipo);
  }
  getIpoById(id: number): Observable<Ipo> {
return this.ht.get(`http://localhost:8080/ipoid/${id}`);
  }
}
