package es.indra.model.entities;

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

	public Double retirada(Double r) {
		if (r > this.dinero) {
			System.out.println("La operación no se puede realizar ya que no dispone de tanto saldo");
		} else {
			this.dinero = dinero - r;
			System.out.println("Aquí tiene su dinero");
		}
		return r;
	}

	public void consulta() {

	}

	public void cambioCliente() {

	}

	public void revisionMensual() {

	}
}