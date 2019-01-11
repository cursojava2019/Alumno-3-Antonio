package es.indra.ejercicio4;

public class Lavadora extends Electrodomestico {

	static final float CARGA_DEFECTO = new Float(5);
	protected float carga;

	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(float precioBase, float peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;

	}

	public Lavadora(float precioBase, String color, Character clasificacion, float peso, Float carga) {
		super(precioBase, color, clasificacion, peso);
		this.carga = carga;

	}

	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}

	@Override
	public Float precioFinal() {
		float precioFinal = super.precioFinal();
		if (this.carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}

}
