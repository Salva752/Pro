//Salva Juan Soria
package Herencia.Ejercicio5;

public class Producto {
	protected String nombre;
	protected double precio;
	
	//Constructor por defecto
	public Producto() { 
	}
	
	//Constructor parametrizado
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodo calcular
	public double calcular(int cantidad) {
		double total = precio * cantidad;
		return total;
	}
	
	//Metodo toString (Muestra la informacion del producto)
	public String toString() {
		String todo = "Nombre: "+nombre+"\nPrecio: "+precio;
		return todo;
		
	}
}
