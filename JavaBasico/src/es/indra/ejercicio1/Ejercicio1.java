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
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int leido =	entrada.nextInt();
		if (leido %2 == 0) {
			System.out.println("El número "+leido+" es divisible por 2");
		}
		else {
			System.out.println("El número "+leido+" NO es divisible por 2");
		}
	}

}
