//Salva Juan Soria
package Herencia.Ejercicio4;

public class television extends electrodomestico {

	float resolucion;
	boolean smartTV;
	
	//Constructor por defecto
	public television() {
		super();
		resolucion = 20;
		smartTV = false;
	}
	
	//Constructor con parametros precioBase y peso
	public television(float precioBase, float peso) {
		super(precioBase, peso);
		resolucion = 20;
		smartTV = false;
	}
	
	//Constructor con todos los parametros
	public television(String color, char consumoEnergetico, float precioBase, float peso, float resolucion, boolean smartTV) {
		super(color, consumoEnergetico, precioBase, peso);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}
	
	//Getters y Setters
	public float getResolucion() {
		return resolucion;
	}

	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}

	//Metodo precioFinal (Calcula el precio de el producto)
	@Override public double precioFinal() {
		double precio = super.precioFinal();
		if (resolucion >= 40) {
			precio = precio*1.30;
		}
		if (smartTV == true) {
			precio = precio + 50;
		}
		return precio;
	}
}
