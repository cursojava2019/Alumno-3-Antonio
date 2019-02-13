import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular';
  posicion1: number;
  posicion2: number;
  posicion3: number;
  constructor() {
    this.posicion1 = this.retornarAleatorio();
    this.posicion2 = this.retornarAleatorio();
    this.posicion3 = this.retornarAleatorio();
  }

  retornarAleatorio() {
    return Math.trunc(Math.random() * 6) + 1;
  }

  tirar() {
    this.posicion1 = this.retornarAleatorio();
    this.posicion2 = this.retornarAleatorio();
    this.posicion3 = this.retornarAleatorio();
  }
}
