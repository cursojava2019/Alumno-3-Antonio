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

		String numero;
		do {

			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce un n�mero: ");
			numero = entrada.next();

		} while (Integer.valueOf(numero) < 0);

		System.out.println("El n�mero introducido tiene " + numero.length() + " cifras");
	}

}
