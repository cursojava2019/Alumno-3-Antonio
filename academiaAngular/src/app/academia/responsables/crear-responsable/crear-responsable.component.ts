import { Component, OnInit } from '@angular/core';
import { ResponsableService } from 'src/app/shared/services/responsable.service';
import { Router } from '@angular/router';
import { Responsable } from 'src/app/shared/entities/responsable';

@Component({
  selector: 'app-crear-responsable',
  templateUrl: './crear-responsable.component.html',
  styleUrls: ['./crear-responsable.component.scss']
})
export class CrearResponsableComponent implements OnInit {

  constructor(private responsableService: ResponsableService, private router: Router) { }

  ngOnInit() {
  }

  crear(r: Responsable) {
     this.responsableService.create(r).subscribe(data => {
      this.router.navigate(['responsables']);
     });
  }

}
