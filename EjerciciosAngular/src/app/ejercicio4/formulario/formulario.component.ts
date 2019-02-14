import { Component, OnInit, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {
  usuario: string;
  contra: string;
  usuarioEntrada: '';
  contraEntrada: '';

  @Output()
  hidden = new EventEmitter<boolean>();
  visible = false;

  constructor() { }

  ngOnInit() {
  }

  comprobar() {
    if (this.usuarioEntrada === this.contraEntrada) {
      this.visible = true;
    } else { this.mostrarAviso();
      }
  }

  mostrarBoton() {

  }

  mostrarAviso() {

  }
}
