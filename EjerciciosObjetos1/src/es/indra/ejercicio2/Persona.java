package es.indra.ejercicio2;

public class Persona {
	private String nombre, dni;
	private int edad;
	private char sexo = 'm';
	private float peso, altura;

	public Persona(String dni) {
		super();
		generaDNI();

	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public void generaDNI() {
		int numeroAleatorio = (int) (Math.random() * 100 + 1);

	}

	public void calcularIMC(float _peso, float _altura) {
		float x = 0;
		int y = 100;
		x = (_peso / (_altura * _altura));
		if (x < 20) {
			y = -1;
			System.out.println("Está por debajo de su peso ideal");
		} else if (x <= 25 && x >= 20) {
			y = 0;
			System.out.println("Está en su peso ideal");
		} else {
			y = 1;
			System.out.println("Usted padece sobrepeso");
		}

	}

	public void esMayorDeEdad(int _edad) {
		boolean x = true;
		if (_edad < 18) {
			x = false;
			System.out.println("No es mayor de edad");
		} else {
			x = true;
			System.out.println("Es mayor de edad");
		}
	}

	public void comprobarSexo() {

	}

}
