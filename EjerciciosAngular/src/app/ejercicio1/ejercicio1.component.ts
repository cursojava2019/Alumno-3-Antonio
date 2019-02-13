import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ejercicio1',
  templateUrl: './ejercicio1.component.html',
  styleUrls: ['./ejercicio1.component.css']
})
export class Ejercicio1Component implements OnInit {
  nombre: string;
  apellidos: string;
  nombreEntrada = '';
  apellidosEntrada = '';

  constructor() { }

  ngOnInit() {
  }

  ponerNombreEntrada() {
    this.nombre = this.nombreEntrada;
  }

  ponerApellidosEntrada() {
    this.apellidos = this.apellidosEntrada;
  }

}
