//Salva Juan Soria
package Herencia.Ejercicio7;

public class ejmain {

	public static void main(String[] args) {
		suma o1 = new suma(2, 8);
		resta o2 = new resta(5, 3);
		multiplicacion o3 = new multiplicacion(8, 7);
		division o4 = new division(100, 50);
		
		o1.mostrarResultado();
		o2.mostrarResultado();
		o3.mostrarResultado();
		o4.mostrarResultado();
	}
}
