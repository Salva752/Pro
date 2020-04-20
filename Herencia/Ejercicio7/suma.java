//Salva Juan Soria
package Herencia.Ejercicio7;

public class suma extends operacion {
	double suma = num1 + num2;
	
	public suma(double num1, double num2) {
		super(num1, num2);
		operacion = '+';
		res = suma;
	}
}
