//Salva Juan Soria
package Arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		float[] temp = new float[10];
		float mediaP = 0, mediaI = 0, numP=1, numI=1;
		Scanner sc = new Scanner(System.in);
		for(int cont = 0;cont < 10;cont++) {
			System.out.print("Introduce un numero: ");
			temp[cont]=sc.nextInt();
			if ((cont%2) == 0) {
				numP++;
				mediaP = mediaP + temp[cont];
				}else {
					mediaI = mediaI + temp[cont];
					numI++;
				}
		}
		if (numP > 1) {
			numP = numP-1;
		}
		if (numI > 1) {
			numI = numI-1;
		}
		mediaP = mediaP/numP;
		mediaI = mediaI/numI;
		System.out.print("Media de numeros pares: "+mediaP+"\nMedia de numero impares: "+mediaI);
		sc.close();
	}

}
