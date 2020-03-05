import { Injectable,Inject } from '@angular/core';
import { Company } from '../models/company';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  httpUrl='http://localhost:8100/companyall/';
  company:Company;
  constructor(private httpClient:HttpClient ,@Inject(HttpClient) private ht) { }
  saveCompany(company:Company):Observable<Company>{
    return this.httpClient.post<Company>(this.httpUrl, company);
  }
  deleteCompany(id:number):Observable<Company>{
    return this.ht.delete(this.httpUrl+id);
  }
  getAllCompanies():Observable<Company[]>{
    return this.httpClient.get<Company[]>(this.httpUrl);
  }
  updateCompany(company :Company): Observable<Company>{
    return this.ht.put(this.httpUrl,company);
  }
  getCompanyById(id: number): Observable<Company> {
return this.ht.get(this.httpUrl+id);
}
}
