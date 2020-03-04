//Salva Juan Soria
package Arrays;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[20];
		for(int cont = 0;cont < 20;cont++) {
			System.out.print("Introduce un numero: ");
			num[cont]=sc.nextInt();
		}
		System.out.print("Los siguientes numeros que has introducido son pares");
		for (int cont = 0;cont < 20;cont++) {
			if ((num[cont] % 2) == 0) {
				System.out.println(num[cont]);
			}
		}
		sc.close();
	}

}


/*	He fet dos, amb esta seguent la que soles introduix el valor cuan el valor es par
 *
 * 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] par = new int[20];
		int num, cont = 0;
		while (cont < 20) {
			System.out.print("Introduce un numero: ");
			num=sc.nextInt();
			if ((num % 2) == 0) {
				par[cont] = num;
				cont++;
			}
		}
		for (cont = 0;cont < 20;cont++) {
			System.out.println(par[cont]);
		}
		sc.close();
	}
 */