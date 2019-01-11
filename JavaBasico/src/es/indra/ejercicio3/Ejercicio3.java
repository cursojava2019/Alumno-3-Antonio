/**
 * 
 */
package es.indra.ejercicio3;

import java.util.Scanner;

/**
 * @author A.H.G.
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner dia = new Scanner(System.in);
		System.out.println("Introduce un día de la semana: ");
		String aux = dia.next();

		if (aux.equalsIgnoreCase("lunes")) {
			i = 1;
		} else if (aux.equalsIgnoreCase("martes")) {
			i = 2;
		} else if (aux.equalsIgnoreCase("miercoles")) {
			i = 3;
		} else if (aux.equalsIgnoreCase("jueves")) {
			i = 4;
		} else if (aux.equalsIgnoreCase("viernes")) {
			i = 5;
		} else if (aux.equalsIgnoreCase("sabado")) {
			i = 6;
		} else if (aux.equalsIgnoreCase("domingo")) {
			i = 7;
		} else {
			i = 8;
		}

		switch (i) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Es un día laboral");
			break;
		case 6:
		case 7:
			System.out.println("NO es un día laboral");
			break;
		case 8:
			System.out.println("Eso no es un día");
			break;
		default:
			System.out.println("Si estás leyendo esto, algo ha ido realmente mal");
		}

	}

}
