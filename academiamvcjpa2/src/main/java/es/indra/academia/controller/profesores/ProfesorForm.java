package es.indra.academia.controller.profesores;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import es.indra.academia.model.entities.Profesor;

public class ProfesorForm {
	@Positive
	private Long id;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 100)
	private String nombre;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 100)
	private String apellido1;
	private String apellido2;
	@Size(min = 9, max = 9)
	private String nif;

	private String telefono;
	@Email
	@NotEmpty
	private String correo;

	@PastOrPresent

	@Size(min = 0, max = 500)
	private String titulacion;

	public ProfesorForm() {
		super();
		this.nif = "";
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.telefono = "";
		this.correo = "";
		this.titulacion = "";

	}

	public ProfesorForm(Profesor a) {
		super();
		this.id = a.getId();
		this.nif = (a.getNif());
		this.nombre = (a.getNombre());
		this.apellido1 = (a.getApellido1());
		this.apellido2 = (a.getApellido2());
		this.telefono = (a.getTelefono());
		this.correo = (a.getCorreo());
		this.titulacion = (a.getTitulacion());

	}

	public Profesor obtenerProfesor() {
		Profesor p = new Profesor();
		p.setId(getId());
		p.setNif(getNif());
		p.setNombre(getNombre());
		p.setApellido1(getApellido1());
		p.setApellido2(getApellido2());
		p.setTelefono(getTelefono());
		p.setCorreo(getCorreo());
		p.setTitulacion(getTitulacion());
		return p;
	}

//	public void validar(List<String> errores) {
//		if (nif == null || nif.equals("")) {
//			errores.add("El nif es obligatorio");
//
//		}
//		if (nif.length() != 9) {
//			errores.add("El formato de NIF no es correcto");
//
//		}
//		if (nombre=() == null || getNombre().equals("")) {
//			errores.add("El Nombre es obligatorio");
//
//		}
//		if (getApellido1() == null || getApellido1().equals("")) {
//			errores.add("El Primero Apellido es obligatorio");
//
//		}
//
//	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public static ProfesorForm obtenerAlumnoForm(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public void validar(ArrayList<String> errores) {
		// TODO Auto-generated method stub

	}
}