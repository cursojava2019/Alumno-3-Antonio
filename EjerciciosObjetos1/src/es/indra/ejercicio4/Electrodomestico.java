package es.indra.ejercicio4;

public class Electrodomestico {

	static final Color COLOR_BASE = Color.BLANCO;
	static final float PRECIO_DEFECTO = Float.valueOf(100);
	static final float PESO_DEFECTO = Float.valueOf(5);
	static final Character CLASIFICACION_DEFECTO = 'F';

	protected float precioBase;
	protected String color;
	protected Character clasificacion;
	protected float peso;

	public Electrodomestico() {
		super();

		this.precioBase = PRECIO_DEFECTO;
		this.color = COLOR_BASE;

	}

	public Electrodomestico(float precioBase, float peso) {
		this();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(float precioBase, String color, Character clasificacion, float peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		comprobarConsumoEnergetico(clasificacion);
		this.peso = peso;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return this.color.toString();
	}

	public void setColor(String color) {
		comprobarColor(color);
	}

	public Character getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Character clasificacion) {
		this.clasificacion = clasificacion;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	private void comprobarConsumoEnergetico(char clasi) {
		if (clasi == 'A' || clasi == 'B' || clasi == 'C' || clasi == 'D') {
			this.clasificacion = clasi;

		} else {
			this.clasificacion = CLASIFICACION_DEFECTO;
		}
	}

	private void comprobarColor(String color) {
		if (color.equals(Color.ROJO.toString()) || color.equals(Color.AZUL.toString())
				|| color.equals(Color.BLANCO.toString()) || color.equals(Color.GRIS.toString())
				|| color.equals(Color.NEGRO.toString())) {
			this.color = Color.valueOf(color);
		} else {
			this.color = COLOR_BASE;
		}
	}

	public Float precioFinal() {
		float precioFinal = Float.valueOf(0);
		switch (this.clasificacion) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 20;
			break;

		default:
			precioFinal += 20;
		}

		if (peso <= 19) {
			precioFinal += 10;
		} else if (peso > 19 && peso <= 49) {
			precioFinal += 50;
		} else if (peso > 49 && peso <= 79) {
			precioFinal += 80;
		} else {
			precioFinal += 100;
		}

		return precioFinal;
	}
}
