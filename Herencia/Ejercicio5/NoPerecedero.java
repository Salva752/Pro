//Salva Juan Soria
package Herencia.Ejercicio5;

public class NoPerecedero extends Producto {
	int tipo;
	
	//Constructor por defecto
	public NoPerecedero() { 
	}
	
	//Constructor parametrizado
	public NoPerecedero(String nombre, double precio, int tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	//getters y setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	//Metodo calcular
	@Override public double calcular(int cantidad) {
			  double total = super.calcular(cantidad);
			  return total;
		}
	}