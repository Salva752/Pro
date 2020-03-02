//Salva Juan Soria
package Arrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnos;
		float media = 0;
		do {
		System.out.print("Introduce un numero de alumnos: ");
		alumnos=sc.nextInt();
		} while (alumnos <= 0);
		float[] nota = new float[alumnos];
		for(int cont = 0;cont < alumnos;cont++) {
			System.out.print("Introduce una nota: ");
			nota[cont]=sc.nextInt();
			media = nota[cont] + media;
		}
		media = media / alumnos;
		System.out.print("La media es: "+media+"\nAqui las notas superiores a la media: \n");
		for (int cont = 0;cont < alumnos;cont++) {
			if (nota[cont] > media) {
				System.out.println(nota[cont]);
			}
		}
		sc.close();
	}

}
