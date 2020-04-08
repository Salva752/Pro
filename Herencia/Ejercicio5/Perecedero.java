//Salva Juan Soria
package Herencia.Ejercicio5;

public class Perecedero extends Producto{
	int diasACaducar;
	
	//Constructor por defecto
	public Perecedero() { 
	}
	
	//Constructor parametrizado
	public Perecedero(String nombre, double precio, int dias) {
		super(nombre, precio);
		diasACaducar = dias;
	}
	
	//getters y setters
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

		  //Metodo calcular (Switch para el divisor por dias)
@Override public double calcular(int cantidad) {
		  double total = super.calcular(cantidad);
		  switch (diasACaducar) {
		  	case 1:
		  		total = total/4;
		  		break;
		  	case 2:
		  		total = total/3;
		  		break;
		  	case 3:
		  		total = total/2;
		  		break;
		  	default:
		  		break;
		  }
		  return total;
	}
}