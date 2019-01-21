package es.indra.controller;

import java.io.Serializable;
import java.util.Scanner;
import java.util.TreeMap;

import es.indra.model.entities.Clientes;
import es.indra.model.entities.Cuentas;

public class Banco implements Serializable {

	private Scanner entrada;
	private Clientes cliente;
	private Cuentas cuenta;
	private TreeMap<String, Clientes> clientes;
	private TreeMap<Double, Cuentas> cuentas;

	public Banco(Clientes cliente, Cuentas cuenta, TreeMap<String, Clientes> clientes,
			TreeMap<Double, Cuentas> cuentas) {
		super();
		this.cliente = cliente;
		this.cuenta = cuenta;
		this.clientes = clientes;
		this.cuentas = cuentas;
	}

	public Banco() {
		super();
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Cuentas getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuentas cuenta) {
		this.cuenta = cuenta;
	}

	public TreeMap<String, Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(TreeMap<String, Clientes> clientes) {
		this.clientes = clientes;
	}

	public TreeMap<Double, Cuentas> getCuentas() {
		return cuentas;
	}

	public void setCuentas(TreeMap<Double, Cuentas> cuentas) {
		this.cuentas = cuentas;
	}

	public Boolean aniadirCliente(Clientes c) {
		this.clientes.put(c.getDni(), c);
		return true;
	}

	public Boolean aniadirCuenta(Cuentas c) {
		this.cuentas.put(c.getDinero(), c);
		return true;
	}

	public Double ingreso(Double i) {
		Double x;
		x = cuenta.getDinero();
		x = x + i;
		System.out.println(
				"El de ingreso de " + i + " se ha realizado correctamente, ahora tiene en su cuenta " + x + " euros");
		return i;
	}

}