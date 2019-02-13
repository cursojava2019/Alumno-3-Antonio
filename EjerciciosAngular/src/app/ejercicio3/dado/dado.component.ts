import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-dado',
  templateUrl: './dado.component.html',
  styleUrls: ['./dado.component.css']
})
export class DadoComponent implements OnInit {
  @Input()
  posicion: number;

  constructor() { }

  ngOnInit() {
    this.posicion = Math.trunc(Math.random() * 6) + 1;
  }

}
