/**
 * 
 */
package es.indra.ejercicio2;

import java.util.Scanner;

/**
 * @author A.H.G.
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int primerNumero =	entrada.nextInt();
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce otro número: ");
		int segundoNumero =	entrada2.nextInt();
		
		if (primerNumero < segundoNumero) {
			for (int i = primerNumero; i < segundoNumero -1; i++) {
				System.out.println(i+1);
			}
		}
		else { 
			for (int i = segundoNumero; i < primerNumero -1; i++) {
				System.out.println(i+1);
			}
			
		}

	}

}
