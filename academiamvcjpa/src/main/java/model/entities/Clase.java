package model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the clase database table.
 * 
 */
@Entity
@Table(name = "clase")
@NamedQuery(name = "Clase.findAll", query = "SELECT c FROM Clase c")
public class Clase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	// bi-directional many-to-many association to Alumno
	@ManyToMany(mappedBy = "clases", fetch = FetchType.EAGER)
	private List<Alumno> alumnos;

	// bi-directional many-to-one association to Asignatura
	@ManyToOne
	@JoinColumn(name = "id_asignatura")
	private Asignatura asignatura;

	// bi-directional many-to-one association to Profesor
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "id_profesor")
	private Profesor profesor;

	// bi-directional many-to-one association to Tarifa
	@ManyToOne
	@JoinColumn(name = "id_tarifa")
	private Tarifa tarifa;

	public Clase() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Alumno> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Asignatura getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Tarifa getTarifa() {
		return this.tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

}