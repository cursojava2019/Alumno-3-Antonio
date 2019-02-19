import { Injectable } from '@angular/core';
import { MapType } from '@angular/compiler';
import { Responsable } from '../entities/responsable';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ResponsableService {
  url = 'http://192.168.1.33:8080/academia2/services/responsable/';
  constructor(private http: HttpClient) {

  }

  findAll(): Observable<Responsable[]> {
    return this.http.get<Responsable[]>(this.url);
  }

  findById(id: number): Observable<Responsable> {
    console.log('id FindById ' + id);
    return this.http.get<Responsable>(this.url + id);
  }
  create(r: Responsable): Observable<Responsable> {
   return this.http.post<Responsable>(this.url, r);
  }
  delete(id: number): Observable<any> {
    return this.http.delete(this.url + id);
  }
  modificar(r: Responsable): Observable<any> {
    console.log(r);
    return this.http.put(this.url + r.id, r);
  }
}
