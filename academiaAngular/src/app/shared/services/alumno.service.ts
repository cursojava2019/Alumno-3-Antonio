import { Injectable } from '@angular/core';
import { Alumno } from '../entities/alumno';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { url } from 'inspector';

@Injectable({
  providedIn: 'root'
})
export class AlumnoService {

  url = 'http://192.168.1.19:8080/academiamvc/services/alumnos/';
  constructor(private http: HttpClient) {

  }

  findAll(): Observable<Alumno[]> {
    return this.http.get<Alumno[]>(this.url);
  }

  findById(id: number): Observable<Alumno> {
    return this.http.get<Alumno>(this.url + id);
  }

  create (a: Alumno): Observable<Alumno> {
    return this.http.post<Alumno>(this.url, a);
  }

  delete (id: number): Observable<any> {
    return this.http.delete(this.url + id);
  }

  modificar (a: Alumno): Observable<any> {
    return this.http.put(this.url + a.id, a);
  }
}
