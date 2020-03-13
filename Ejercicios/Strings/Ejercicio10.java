//Salva Juan Soria
package Strings;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String linea="";
		char letra;
		int numero = 0;
		System.out.print("Introduce una frase: ");
		linea = sc.nextLine().toLowerCase();
		linea = linea.trim();
		System.out.print("Introduce una letra: ");
		letra = sc.next().charAt(0);
		char[] array = linea.toCharArray();
		for(int cont = 0;cont < (array.length-1);cont++) {
			if (array[cont] == letra) {
				numero++;
			}
		}
		System.out.print("Hay "+numero+" '"+letra+"' en esa frase");
		sc.close();
	}

}