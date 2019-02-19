import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ResponsablesRoutingModule } from './responsables-routing.module';
import { ResponsablesComponent } from './responsables.component';

@NgModule({
  declarations: [ResponsablesComponent],
  imports: [
    CommonModule,
    ResponsablesRoutingModule
  ]
})
export class ResponsablesModule { }
