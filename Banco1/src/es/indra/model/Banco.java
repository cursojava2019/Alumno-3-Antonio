package es.indra.model;

import java.io.Serializable;
import java.util.Scanner;
import java.util.TreeMap;

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
		clientes = new TreeMap<String, Clientes>();
		this.cuentas = new TreeMap<Double, Cuentas>();
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

	public Clientes obtenerCliente(String b) {
		return this.clientes.get(b);

	}

}
