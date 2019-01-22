package es.indra.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import es.indra.model.Banco;
import es.indra.model.Clientes;
import es.indra.model.Cuentas;

public class ProgramaBanco implements Serializable {

	public static final String NOMBRE_FICHERO_BANCO = "banco.txt";
	private static Scanner ENTRADA;
	private static Banco banco = null;
	private static Cuentas cuenta = null;
	private static Clientes cliente = null;

	public static void init() throws ClassNotFoundException, IOException {
		ENTRADA = new Scanner(System.in);
		File file = new File(NOMBRE_FICHERO_BANCO);
		try {
			FileInputStream fileInput = new FileInputStream(file);
			ObjectInputStream objecInput = new ObjectInputStream(fileInput);
			banco = (Banco) objecInput.readObject();
			objecInput.close();
		} catch (FileNotFoundException e) {
			banco = new Banco();
			System.out.println("El Banco se inicializa desde cero al no encontrar fichero");
		}
	}

	public static void fin() throws IOException {
		File file = new File(NOMBRE_FICHERO_BANCO);
		file.delete();
		file.createNewFile();
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(file);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(banco);
			objectOut.flush();
			objectOut.close();
		} catch (IOException e) {
			System.out.println("Error guardando en disco. SE HA PERDIDO TODO");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			init();
		} catch (ClassNotFoundException | IOException e1) {
			System.out.println("Error al iniciar de disco. Inicializamos el concesioinaro");
			banco = new Banco();
		}
		int z = 0;
		System.out.println("BIENVENIDO AL BANCO JAÉN");
		System.out.println("Pulse una de estas opciones: ");
		System.out.println("1.- Crear nuevo cliente");
		System.out.println("2.- Crear nueva cuenta");
		System.out.println("3.- Realizar ingreso");
		System.out.println("4.- Sacar dinero");
		System.out.println("5.- Forzar revisión mensual");
		System.out.println("6.- Ver estado de la cuenta");
		System.out.println("0.- Salir");
		z = ENTRADA.nextInt();
		ENTRADA.nextLine();
		try {
			switch (z) {
			case 1:
				crearCliente();
				fin();
				break;
			case 2:
				crearCuenta();
				fin();
				break;
			case 3:
				ingreso();
				fin();
				break;
			case 4:
				retirada();
				fin();
				break;
			case 5:
				revision();
				fin();
				break;
			case 6:
				estadoCuenta();
				break;
			case 0:
				salir();
				break;
			default:
				System.out.println("Parece que hemos tenido un error");
			}
		} catch (Exception e) {
			System.out.println("Se ha producido una excepcion");
		}

	}

	public static void crearCliente() {
		System.out.println("USTED VA A REGISTRARSE COMO NUEVO CLIENTE");
		System.out.println("Introduzca dni y pulse intro");
		String dni = ENTRADA.nextLine();
		System.out.println("Introduzca nombre y pulse intro");
		String nombre = ENTRADA.nextLine();
		System.out.println("Introduzca apellidos y pulse intro");
		String apellidos = ENTRADA.nextLine();
		System.out.println("Introduzca direccion y pulse intro");
		String direccion = ENTRADA.nextLine();
		System.out.println("Introduzca telefono y pulse intro");
		String telefono = ENTRADA.nextLine();
		Clientes cliente = new Clientes(dni, nombre, apellidos, direccion, telefono);
		banco.aniadirCliente(cliente);
		String m = null;
		System.out.println("Ahora ya está usted registrado en nuestra base de datos");
		System.out.println("¿Quiere crear una cuenta? (Pulse 1 para SÍ, pulse cualquier otra tecla para NO)");
		m = ENTRADA.next();
		if (m.equals("1")) {
			crearCuenta();
		} else {
			salir();
		}

	}

	public static void crearCuenta() {
		System.out.println("VAMOS A PROCEDER A CREAR UNA CUENTA");
		System.out.println("Introduzca su DNI");
		String x = ENTRADA.next();
		Clientes cli = banco.obtenerCliente(x);
		if (cli != null) {
			System.out.println("Escriba un codigo identificativo unico para su cuenta");
			String c = ENTRADA.next();
			System.out.println("Escriba la cantidad de dinero que quiere ingresar al crear la cuenta");
			Double n = ENTRADA.nextDouble();
			System.out.println(
					"El tipo de cuenta que desea, Cuenta Corriente (CC), Cuenta Vivienda(CV) y Fondo de Inversion (FI)");
			String m = ENTRADA.next();
			Cuentas cuenta = new Cuentas(c, n, m);
			banco.aniadirCuenta(cuenta);
			System.out.println("Ahora ya dispone usted de cuenta en nuestro banco");
		} else {
			System.out.println("Usted no es cliente de este banco, regístrese para poder crear una cuenta");
		}

	}

	public static void ingreso() {
		System.out.println("VAMOS A REALIZAR UN INGRESO");
		System.out.println("Introduzca su DNI");
		String b = ENTRADA.next();
		Clientes cli = banco.obtenerCliente(b);
		if (cli != null) {
			Double x;
			System.out.println("¿Cuánto desea ingresar?");
			Double i = ENTRADA.nextDouble();
			x = cuenta.getDinero();
			x = x + i;
			System.out.println("El de ingreso de " + i + " se ha realizado correctamente, ahora tiene en su cuenta " + x
					+ " euros");
		} else {
			System.out.println("Usted no es cliente de este banco, regístrese para poder hacer un ingreso");
		}

	}

	public static void retirada() {
		System.out.println("VAMOS A REALIZAR UN INGRESO");
		System.out.println("Introduzca su DNI");
		String b = ENTRADA.next();
		Clientes cli = banco.obtenerCliente(b);
		if (cli != null) {
			System.out.println("¿Cuánto desea retirar?");
			double r = ENTRADA.nextDouble();
			double v = cuenta.getDinero();
			String z = cuenta.getTipo();
			if (z == "CC") {
				if (r > v) {
					System.out.println("La operación no se puede realizar ya que no dispone de tanto saldo");
				} else {
					v = v - r;
					System.out.println("Aquí tiene su dinero");
				}
			} else if (z == "FI") {
				if ((v - r) < -500) {
					System.out.println(
							"La operación no se puede realizar ya que no puede tener una deuda de más de 500€");
				} else {
					v = v - r;
					System.out.println("Aquí tiene su dinero");
				}
			} else if (z == "CV") {
				System.out.println("Con ese tipo de cuenta no se puede sacar dinero");
			} else {
				System.out.println("Debe haber un error en su tipo de cuenta");
			}
		} else {
			System.out.println("Usted no es cliente de este banco, regístrese para poder hacer un ingreso");
		}
	}

	public static void revision() {
		System.out.println("VAMOS A HACER LA REVISIÓN MENSUAL DE LA CUENTA");
		System.out.println("Introduzca su DNI");
		String b = ENTRADA.next();
		Clientes cli = banco.obtenerCliente(b);
		if (cli != null) {
			System.out.println("Procedemos a la revisión");
			double r = ENTRADA.nextDouble();
			double v = cuenta.getDinero();
			String z = cuenta.getTipo();
			if (z == "CC") {
				v = (v * 0.1) - 0.6;
				System.out.println("Se ha realizado la revisión y ahora dispone de " + v + " €");
			} else if (z == "FI") {
				v = (v * 0.2) - 0.6;
				System.out.println("Se ha realizado la revisión y ahora dispone de " + v + " €");
			} else if (z == "CV") {
				v = (v * 0.2);
				System.out.println("Se ha realizado la revisión y ahora dispone de " + v + " €");
			} else {
				System.out.println("Debe haber un error en su tipo de cuenta");
			}
		} else {
			System.out.println("Usted no es cliente de este banco, regístrese para poder hacer un ingreso");
		}
	}

	public static void estadoCuenta() {
		System.out.println("VAMOS A VER EL ESTADO DE SU CUENTA");
		System.out.println("Introduzca su DNI");
		String b = ENTRADA.next();
		Clientes cli = banco.obtenerCliente(b);
		if (cli != null) {
			System.out.println("Usted es " + cliente.getNombre() + " " + cliente.getApellidos());
			System.out.println(
					"Su cuenta tiene un saldo de " + cuenta.getDinero() + " €, y es de tipo " + cuenta.getTipo());
		} else {
			System.out.println("Usted no es cliente de este banco, regístrese para poder hacer un ingreso");
		}

	}

	public static void salir() {
		System.out.println("De acuerdo, hasta luego");
	}
}
