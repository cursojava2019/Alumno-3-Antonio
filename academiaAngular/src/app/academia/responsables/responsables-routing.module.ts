import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ResponsablesComponent } from './responsables.component';
import { CrearResponsableComponent } from './crear-responsable/crear-responsable.component';
import { ModificarResponsableComponent } from './modificar-responsable/modificar-responsable.component';

const routes: Routes = [
  {
    path: '',
    component: ResponsablesComponent,
 },
  { path: 'crear', component: CrearResponsableComponent },
  { path: 'modificar/:idResponsable', component: ModificarResponsableComponent }

];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ResponsablesRoutingModule { }
