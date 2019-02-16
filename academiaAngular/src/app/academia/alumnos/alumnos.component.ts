import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';
import { AlumnoService } from 'src/app/shared/services/alumno.service';
import { Alumno } from 'src/app/shared/entities/alumno';
import { Router } from '@angular/router';

@Component({
  selector: 'app-alumnos',
  templateUrl: './alumnos.component.html',
  styleUrls: ['./alumnos.component.scss'],
  animations: [routerTransition()]
})
export class AlumnosComponent implements OnInit {

  alumnos: Array<Alumno>;


  constructor(alumnoService: AlumnoService, private router: Router) {
    this.alumnos = alumnoService.findAll();
  }

  ngOnInit() {
  }

  irCrearAlumno() {
    this.router.navigate(['alumnos/crear']);
  }
  modificar(id: number) {
    this.router.navigate(['alumnos/modificar']);
  }

  eliminar(id: number) {
    this.router.navigate(['alumnos/eliminar']);
  }
}
