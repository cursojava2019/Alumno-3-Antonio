package es.indra.model;

import java.io.Serializable;

public class Cuentas implements Serializable {

	private Double dinero;
	private String tipo;

	// Constructor 1
	public Cuentas(Double dinero, String tipo) {
		super();
		this.dinero = dinero;
		this.tipo = tipo;
	}

	// Constructor 2
	public Cuentas() {
		super();
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
