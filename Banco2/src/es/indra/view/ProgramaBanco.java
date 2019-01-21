package es.indra.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import es.indra.controller.Banco;
import es.indra.model.entities.Clientes;
import es.indra.model.entities.Cuentas;

public class ProgramaBanco implements Serializable {

	public static final String NOMBRE_FICHERO_BANCO = "banco.txt";
	private static Scanner ENTRADA;
	private static Banco banco = null;

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
			System.out.println("El Concesionario se inicializa desde cero al no encontrar fichero");
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
		System.out.println("Si es cliente nuevo pulse 1, si ya tiene cuenta en este banco pulse 2");
		z = ENTRADA.nextInt();
		ENTRADA.nextLine();
		switch (z) {
		case 1:
			crearCliente();
			break;
		case 2:
			comprobarDni();
			break;
		default:
			System.out.println("Parece que hemos tenido un error");
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
			System.out.println("De acuerdo, hasta luego");
		}

	}

	public static void comprobarDni() {
		String x = null;
		System.out.println("Introduzca su dni");
		x = ENTRADA.next();
		if (x.equals("123456789S")) {
			System.out.println("Bienvenido");
		} else {
			System.out.println("DNI incorrecto");
		}

	}

	public static void crearCuenta() {
		System.out.println("VAMOS A PROCEDER A CREAR UNA CUENTA");
		System.out.println("Escriba la cantidad de dinero que quiere ingresar al crear la cuenta");
		Double n = ENTRADA.nextDouble();
		System.out.println(
				"El tipo de cuenta que desea, Cuenta Corriente (CC), Cuenta Vivienda(CV) y Fondo de Inversion (FI)");
		String m = ENTRADA.next();
		Cuentas cuenta = new Cuentas(n, m);
		banco.aniadirCuenta(cuenta);
		System.out.println("Ahora ya dispone usted de cuenta en nuestro banco");

	}
}
