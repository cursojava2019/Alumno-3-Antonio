import { Component, OnInit } from '@angular/core';
import { Profesor } from 'src/app/shared/entities/profesor';
import { ActivatedRoute, Router } from '@angular/router';
import { ProfesorService } from 'src/app/shared/services/profesor.service';

@Component({
  selector: 'app-modificar-profesor',
  templateUrl: './modificar-profesor.component.html',
  styleUrls: ['./modificar-profesor.component.scss']
})
export class ModificarProfesorComponent implements OnInit {

  profesorActual: Profesor;
  constructor(private rutaActiva: ActivatedRoute, private profesorService: ProfesorService, private router: Router) {


  }

  ngOnInit() {
    const id = this.rutaActiva.snapshot.params.idProfesor;
    this.profesorService.findById(id).subscribe(data => {
      this.profesorActual = data;
      console.log(this.profesorActual);
    });


  }

  modificar(p: Profesor) {
    this.profesorService.modificar(p).subscribe(data => {
      this.router.navigate(['profesores']);
    });

  }

}
