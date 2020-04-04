//Salva Juan Soria
package Herencia.Ejercicio4;

public class lavadora extends electrodomestico {

	float carga;
	
	//Constructor por defecto
	public lavadora() {
		super();
		carga = 5;
	}
	
	//Constructor con parametros precioBase y peso
	public lavadora(float precioBase, float peso) {
		super(precioBase, peso);
		this.carga = 5;
	}
	
	//Constructor con todos los parametros
	public lavadora(String color, char consumoEnergetico, float precioBase, float peso, float carga) {
		super(color, consumoEnergetico, precioBase, peso);
		this.carga = carga;
	}
	
	//Getters y Setters
	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}
	
	//Metodo precioFinal (Calcula el precio de el producto)
	@Override public double precioFinal() {
		double precio = super.precioFinal();
		if (carga >= 30) {
			precio = precio + 50;
		}
		return precio;
	}
}
