//Salva Juan Soria
package Herencia.Ejercicio7;

public class multiplicacion extends operacion{
	double mult = num1 * num2;
	
	public multiplicacion(double num1, double num2) {
		super(num1, num2);
		operacion = '*';
		res = mult;
	}
}
