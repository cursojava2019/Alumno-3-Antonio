import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModificarResponsableComponent } from './modificar-responsable.component';

describe('ModificarResponsableComponent', () => {
  let component: ModificarResponsableComponent;
  let fixture: ComponentFixture<ModificarResponsableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModificarResponsableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModificarResponsableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
