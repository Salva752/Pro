//Salva Juan Soria
package Strings;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String linea="";
		System.out.print("Introduce una frase: ");
		linea = sc.nextLine();
		linea = linea.trim();
		String[] palabras = linea.split(" ");
		System.out.print("Hay "+palabras.length+" palabra(s) en esa frase");
		sc.close();
	}

}