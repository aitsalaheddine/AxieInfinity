import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  constructor(private http: HttpClient) { }

  getAccounts(profileId: number): Observable<any> {
    const url = `http://localhost:8080/users/${profileId}/accounts`;
    return this.http.get(url);
  }
}
