package es.indra.ejercicio2;

import java.util.Scanner;

public class Ejercicio2Main {

//	private static Scanner nombre;
//	private static Scanner edad;
//	private static Scanner peso;
//	private static Scanner altura;
//
//	public static void introducirPersona() {
//		nombre = new Scanner(System.in);
//		edad = new Scanner(System.in);
//		peso = new Scanner(System.in);
//		altura = new Scanner(System.in);
//
//		System.out.println("Dime tu nombre: ");
//		nombre.toString();
//		System.out.println("Dime tu edad: ");
//		edad.nextInt();
//		System.out.println("Dime tu peso");
//		peso.nextFloat();
//		System.out.println("Dime tu altura: ");
//		altura.nextFloat();
//	}

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Dime tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Dime tu edad: ");
		int edad = scanner.nextInt();
		System.out.print("Dime tu peso en kilos: ");
		float peso = scanner.nextFloat();
		System.out.print("Dime tu altura en metros: ");
		float altura = scanner.nextFloat();
		scanner.nextLine();
		Persona p1 = new Persona(nombre, edad, peso, altura);
		p1.calcularIMC(peso, altura);

	}

}
