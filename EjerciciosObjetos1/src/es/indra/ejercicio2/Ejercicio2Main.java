package es.indra.ejercicio2;

import java.util.Scanner;

public class Ejercicio2Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Dime tu nombre: ");
		String nombre = entrada.nextLine();
		System.out.print("Dime tu edad: ");
		int edad = entrada.nextInt();
		System.out.println("Escribe el sexo: ");
		char sexo = entrada.next().charAt(0);
		System.out.print("Dime tu peso en kilos: ");
		float peso = entrada.nextFloat();
		System.out.print("Dime tu altura en metros (por ejemplo 1,82): ");
		float altura = entrada.nextFloat();
		entrada.nextLine();
		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

		Persona p2 = new Persona(nombre, edad, sexo);

		Persona p3 = new Persona();
		p3.setNombre("Paquito");
		p3.setEdad(25);
		p3.setSexo('H');
		p3.setPeso(80);
		p3.setAltura((double) 185);

		System.out.println("La persona que se llama " + p1.getNombre());
		p1.calcularIMC(peso, altura);
		System.out.println("La persona que se llama " + p2.getNombre());
		p2.calcularIMC(peso, altura);
		System.out.println("La persona que se llama " + p3.getNombre());
		p3.calcularIMC(peso, altura);

	}

}
