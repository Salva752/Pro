//Salva Juan Soria
package Arrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int P=0, N=0, C=0;
		for(int cont = 0;cont < 10;cont++) {
			System.out.print("\nIntroduce un numero: ");
			num[cont]=sc.nextInt();
		}
		System.out.println("Los siguientes numeros que has introducido son positivos");
		for (int cont = 0;cont < 10;cont++) {
			if (num[cont] > 0) {
				P++;
			}
		}
		System.out.println(P);
		System.out.println("Los siguientes numeros que has introducido son negativos");
		for (int cont = 0;cont < 10;cont++) {
			if (num[cont] < 0) {
				N++;
			}
		}
		System.out.println(N);
		System.out.println("Los siguientes numeros que has introducido son cero");
		for (int cont = 0;cont < 10;cont++) {
			if (num[cont] == 0) {
				C++;
			}
		}
		System.out.println(C);
		sc.close();
	}

}