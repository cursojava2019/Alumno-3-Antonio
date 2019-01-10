/**
 * 
 */
package es.indra.ejercicio4;

import java.util.Scanner;

/**
 * @author A.H.G.
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		do {

			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce un número: ");
			numero = entrada.nextInt();

		} while (numero <= 0);

	}

}
