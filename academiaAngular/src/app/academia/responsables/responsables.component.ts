import { Component, OnInit } from '@angular/core';
import { Responsable } from 'src/app/shared/entities/responsable';
import { ResponsableService } from 'src/app/shared/services/responsable.service';
import { Router } from '@angular/router';
import { routerTransition } from 'src/app/router.animations';

@Component({
  selector: 'app-responsables',
  templateUrl: './responsables.component.html',
  styleUrls: ['./responsables.component.scss'],
  animations: [routerTransition()]
})
export class ResponsablesComponent implements OnInit {

  responsables: Array<Responsable>;

  constructor(private responsableService: ResponsableService, private router: Router) {
     responsableService.findAll().subscribe(data => {
       this.responsables = data;
     });

   }

  ngOnInit() {

  }

  irCrearResponsable() {
    this.router.navigate(['responsables/crear']);
  }
  modificar(id: number) {
    this.router.navigate(['responsables/modificar', id]);
  }

  eliminar (id: number) {
     if (confirm('Está seguro que desea borrar el responsable con id ' + id)) {
      this.responsableService.delete(id).subscribe(data => {
          this.responsableService.findAll().subscribe(data => {
               this.responsables = data;
        });

      });

     }
  }

}
