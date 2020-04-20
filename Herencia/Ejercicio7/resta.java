//Salva Juan Soria
package Herencia.Ejercicio7;

public class resta extends operacion{
	double resta = num1 - num2;
	
	public resta(double num1, double num2) {
		super(num1, num2);
		operacion = '-';
		res = resta;
	}
}
