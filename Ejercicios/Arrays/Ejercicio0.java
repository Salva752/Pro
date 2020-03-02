//Salva Juan Soria
package Arrays;

import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {
		float[] temp = new float[10];
		float mediaP = 0, mediaN = 0, numP=1, numN=1;
		Scanner sc = new Scanner(System.in);
		for(int cont = 0;cont < 10;cont++) {
			System.out.print("Introduce una temperatura: ");
			temp[cont]=sc.nextInt();
			if (temp[cont] > 0) {
				numP++;
				mediaP = mediaP + temp[cont];
				}else {
					mediaN = mediaN + temp[cont];
					numP++;
				}
		}
		if (numP > 1) {
			numP = numP-1;
		}
		if (numN > 1) {
			numN = numN-1;
		}
		mediaP = mediaP/numP;
		mediaN = mediaN/numN;
		System.out.print("Media de temperaturas positivas: "+mediaP+"\nMedia de temperaturas negativas: "+mediaN);
		sc.close();
	}

}
