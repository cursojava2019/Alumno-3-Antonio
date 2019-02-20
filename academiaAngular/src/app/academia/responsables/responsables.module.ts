import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ResponsablesRoutingModule } from './responsables-routing.module';
import { ResponsablesComponent } from './responsables.component';
import { CrearResponsableComponent } from './crear-responsable/crear-responsable.component';
import { ModificarResponsableComponent } from './modificar-responsable/modificar-responsable.component';
import { FormularioResponsableComponent } from './formulario-responsable/formulario-responsable.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PageHeaderModule } from 'src/app/shared';

@NgModule({
  declarations: [ResponsablesComponent, CrearResponsableComponent, ModificarResponsableComponent, FormularioResponsableComponent],
  imports: [
    CommonModule,
    ResponsablesRoutingModule,
    PageHeaderModule,
    ReactiveFormsModule
  ]
})
export class ResponsablesModule { }
