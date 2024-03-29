import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  url: String = 'http://localhost:8080/';
  constructor(private http: HttpClient) { }

  getAccounts(profileId: number): Observable<any> {
    return this.http.get(`${this.url}users/${profileId}/accounts`);
  }

  getAllAccounts(): Observable<any> {
    return this.http.get(`${this.url}accounts/`);
  }

  createOrUpdateAccount(account) {
    return this.http.post(`${this.url}accounts`, account);
  }

  getAccount(id: any) {
    return this.http.get(`${this.url}accounts/${id}`);
  }
}
