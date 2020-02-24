import { Injectable,Inject } from '@angular/core';
import { Company } from '../models/company';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  httpUrl = 'http://localhost:8080/company';
  company:Company;
  constructor(private httpClient:HttpClient,@Inject(HttpClient) private ht) { }
  saveCompany(company:Company):Observable<Company>{
    console.log("save comp service"+company.companyname);
    return this.ht.post(this.httpUrl, company);
  }
  deleteCompany(id:number):Observable<Company>{
    return this.ht.delete(`http://localhost:8080/company/${id}`);
  }
  getAllCompanies():Observable<Company[]>{
    return this.httpClient.get<Company[]>(this.httpUrl);
  }
  updateCompany(company :Company): Observable<Company>{
    return this.ht.put(`http://localhost:8080/company`,company);
  }
  getCompanyById(id: number): Observable<Company> {
return this.ht.get(`http://localhost:8080/company/${id}`);
}
}