package es.indra.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Clientes implements Serializable {

	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private ArrayList<Cuentas> numCuenta = new ArrayList<Cuentas>();

	// Constructor 1
	public Clientes(String dni, String nombre, String apellidos, String direccion, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	// Constructor 2
	public Clientes() {
		super();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Cuentas> getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(ArrayList<Cuentas> numCuenta) {
		this.numCuenta = numCuenta;
	}

}
