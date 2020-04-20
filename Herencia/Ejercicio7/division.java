//Salva Juan Soria
package Herencia.Ejercicio7;

public class division extends operacion{
	double div = num1 / num2;
	
	public division(double num1, double num2) {
		super(num1, num2);
		operacion = '/';
		res = div;
	}
}
