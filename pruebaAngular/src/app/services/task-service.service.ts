import { Injectable } from '@angular/core';
import { Task } from '../model/task';

@Injectable({
  providedIn: 'root'
})
export class TaskServiceService {
 private listado = Array<Task>();
  constructor() {

   }

  add(tarea: Task) {
    this.listado.push(tarea);
  }
  addSimple(nombre: string , estado: boolean) {
    const tarea = new Task( estado, nombre);
    this.listado.push(tarea);
  }
  findAll() {
    return this.listado;
  }
  deleteTarea(indice: number) {
    this.listado.splice(indice, 1);
  }
}
