/**
 * 
 */
package es.indra.ejercicio1;

import java.util.Scanner;

/**
 * @author A.H.G.
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		int leido = entrada.nextInt();
		if (leido % 2 == 0) {
			System.out.println("El n�mero " + leido + " es divisible por 2");
		} else {
			System.out.println("El n�mero " + leido + " NO es divisible por 2");
		}
	}

}
