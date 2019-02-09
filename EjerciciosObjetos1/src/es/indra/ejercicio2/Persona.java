package es.indra.ejercicio2;

public class Persona {
	private String nombre, dni;
	private int edad;
	static char HOMBRE = 'H';
	static char MUJER = 'M';
	private char sexo = 'H';
	private float peso;
	private double altura;

	public Persona() {

		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = HOMBRE;
		this.dni = generaDNI();
		this.peso = Float.valueOf(0);
		this.altura = Double.valueOf(0);
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDNI();
	}

	public Persona(String nombre, int edad, char sexo, float peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDni() {
		return dni;
	}

	private static char generaLetraDNI(int var1) {
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		return letras[var1];
	}

	public String generaDNI() {
		final int divisor = 23;
		String dni;

		int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
		int var1 = numDNI - (numDNI / divisor * divisor);

		char letraDNI = generaLetraDNI(var1);

		dni = Integer.toString(numDNI) + letraDNI;
		return dni;

	}

	public void calcularIMC(float _peso, float _altura) {
		System.out.println("ESTO ES:" + _peso + "Y LA ALTURA " + _altura);
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
		if (_edad < 18) {
			System.out.println("No es mayor de edad");
		} else {
			System.out.println("Es mayor de edad");
		}
	}

	public void comprobarSexo() {

	}

}
