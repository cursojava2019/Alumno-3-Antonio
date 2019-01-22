package es.indra.model;

import java.io.Serializable;

public class Cuentas implements Serializable {

	private String codigo;
	private Double dinero;
	private String tipo;

	// Constructor 1
	public Cuentas(String codigo, Double dinero, String tipo) {
		super();
		this.codigo = codigo;
		this.dinero = dinero;
		this.tipo = tipo;
	}

	// Constructor 2
	public Cuentas() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void cambioCliente() {

	}

}
