package Extra1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String nombre, sexo;
		float peso, altura, IMC1, IMC2, IMC3;
		boolean mayor1, mayor2, mayor3;
		int edad;
		
		System.out.print("Introduce tu nombre");
		nombre = sc.next();
		System.out.print("Introduce tu sexo");
		sexo = sc.next();
		System.out.print("Introduce tu edad");
		edad = sc.nextInt();
		System.out.print("Introduce tu peso (en kg)");
		peso = sc.nextFloat();
		System.out.print("Introduce tu altura (en metros)");
		altura = sc.nextFloat();
		
		Persona p1 = new Persona(nombre, sexo, peso, altura, edad);
		Persona p2 = new Persona(nombre, sexo, edad);
		Persona p3 = new Persona();
		System.out.print("Introduce tu nombre");
		p3.setNombre(sc.next());
		System.out.print("Introduce tu sexo");
		p3.setSexo(sc.next());
		System.out.print("Introduce tu edad");
		p3.setEdad(sc.nextInt());
		System.out.print("Introduce tu peso (en kg)");
		p3.setPeso(sc.nextFloat());
		System.out.print("Introduce tu altura (en metros)");
		p3.setAltura(sc.nextFloat());
		IMC1 = p1.calcularIMC();
		IMC2 = p2.calcularIMC();
		IMC3 = p3.calcularIMC();
		if (IMC1 == -1) {
			System.out.println(p1.getNombre()+" esta por debajo del peso ideal");
		}else if (IMC1 == 0) {
			System.out.println(p1.getNombre()+" esta en el peso ideal");
		}else if (IMC1 == 1) {
			System.out.println(p1.getNombre()+" esta por encima del peso ideal");
		}
		if (IMC2 == -1) {
			System.out.println(p1.getNombre()+" esta por debajo del peso ideal");
		}else if (IMC2 == 0) {
			System.out.println(p1.getNombre()+" esta en el peso ideal");
		}else if (IMC2 == 1) {
			System.out.println(p1.getNombre()+" esta por encima del peso ideal");
		}
		if (IMC3 == -1) {
			System.out.println(p1.getNombre()+" esta por debajo del peso ideal");
		}else if (IMC3 == 0) {
			System.out.println(p1.getNombre()+" esta en el peso ideal");
		}else if (IMC3 == 1) {
			System.out.println(p1.getNombre()+" esta por encima del peso ideal");
		}
		mayor1 = p1.esMayorDeEdad();
		if (mayor1 == true) {
			System.out.println(p1.getNombre()+" es mayor de edad");
		}else System.out.println(p1.getNombre()+" es menor de edad");
		mayor2 = p2.esMayorDeEdad();
		if (mayor2 == true) {
			System.out.println(p1.getNombre()+" es mayor de edad");
		}else System.out.println(p1.getNombre()+" es menor de edad");
		mayor3 = p3.esMayorDeEdad();
		if (mayor3 == true) {
			System.out.println(p1.getNombre()+" es mayor de edad");
		}else System.out.println(p1.getNombre()+" es menor de edad");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		sc.close();
	}

}
