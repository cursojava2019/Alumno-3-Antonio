import { Injectable } from '@angular/core';
import { Alumno } from '../entities/alumno';

@Injectable({
  providedIn: 'root'
})
export class AlumnoService {

  listado: Array<Alumno>;
  constructor() {
    this.listado = new Array<Alumno>();
    this.listado.push(
    new Alumno(1, 'Paquito', 'Paquete', 'Tocino', 'ddd@gmail.com', new Date(), null, '123456789', 'La leche el zagal', false, '953554411' )
    );
  }

  findAll() {
    return this.listado;
  }

  findById(index: number) {
    return this.listado[index];
  }

  create (a: Alumno) {
    this.listado.push(a);
  }

  delete (index: number) {

  }
}
