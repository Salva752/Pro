//Salva Juan Soria
package Arrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] emp = new String[10];
		int[] sue = new int[10];
		int grande = 0, posicion = 0;
		for(int cont = 0;cont < 10;cont++) {
			System.out.print("Introduce el nombre del empleado: ");
			emp[cont]=sc.next();
		}
		for(int cont = 0;cont < 10;cont++) {
			System.out.print("Introduce el sueldo de "+emp[cont]+": ");
			sue[cont]=sc.nextInt();
			if (sue[cont] > grande) {
				grande = sue[cont];
				posicion = cont;
			}
		}
		System.out.print("El empleado que mas cobra es "+emp[posicion]+" con "+sue[posicion]);
		sc.close();
	}

}
