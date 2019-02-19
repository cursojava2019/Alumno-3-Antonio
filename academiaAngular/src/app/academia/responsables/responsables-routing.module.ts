import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ResponsablesComponent } from './responsables.component';

const routes: Routes = [
  {
    path: '',
    component: ResponsablesComponent,
 },
 // { path: 'crear', component: CrearResponsableComponent },
 // { path: 'modificar/:idResponsable', component: ModificarResponsableComponent }

];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ResponsablesRoutingModule { }
