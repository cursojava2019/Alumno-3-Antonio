package es.indra.ejercicio4;

public class Television extends Electrodomestico {

	public static final Integer RESOLUCION_DEFECTO = new Integer(20);
	public static final Boolean TDT_DEFECTO = false;
	protected Integer resolucion;
	protected Boolean sintonizador;

	public Television() {

	}

	public Television(float precioBase, float peso) {
		super();
		this.
		
		
	}

	public Television(float precioBase, String color, Character clasificacion, float peso, Integer resolucion, Boolean tdt) {
		super(precioBase, color, clasificacion, peso);
		this.resolucion = resolucion;
		this.sintonizador = tdt;
		


	public Television(Integer resolucion, Boolean sintonizador) {
		super();
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}	}

}
