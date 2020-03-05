package Extra1;

import java.util.Scanner;

public class Persona {
	Scanner sc = new Scanner(System.in); 
	private String nombre, DNI, sexo;
	private float peso, altura;
	private int edad;
	
	public Persona() {
		DNI = generaDNI();
	}	
	
	public Persona(String nombre, String sexo, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		DNI = generaDNI();
	}

	public Persona(String nombre, String sexo, float peso, float altura, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		DNI = generaDNI();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI() {
		DNI = generaDNI();
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public float calcularIMC() {
		float bmi;
		int num;
		bmi = peso/(altura*altura);
		if (bmi < 20) {
			num = -1;
		}else if (bmi > 25) {
			num = 1;
		}else num = 0;
		return num;
	}
	
	public boolean esMayorDeEdad() {
		boolean mayor;
		if (edad >= 18) {
			mayor = true;
		}else mayor = false;
		return mayor;
	}
	
	public String toString() {
		String todo = "Nombre = "+nombre+"\nEdad = "+edad+"\nDNI = "+DNI+"\n Sexo = "+sexo+"\nPeso = "+peso+"\nAltura = "+altura;
		return todo;
	}
	
	private String generaDNI() {
		String DNI, letra = "";
		System.out.println("Introduce las cifras de tu dni");
		int num = sc.nextInt(), res = num % 23;
		switch (res) {
			case 0:
				letra = "T";
				break;
			case 1:
				letra = "R";
				break;
			case 2:
				letra = "W";
				break;
			case 3:
				letra = "A";
				break;
			case 4:
				letra = "G";
				break;
			case 5:
				letra = "M";
				break;
			case 6:
				letra = "Y";
				break;
			case 7:
				letra = "F";
				break;
			case 8:
				letra = "P";
				break;
			case 9:
				letra = "D";
				break;
			case 10:
				letra = "X";
				break;
			case 11:
				letra = "B";
				break;
			case 12:
				letra = "N";
				break;
			case 13:
				letra = "J";
				break;
			case 14:
				letra = "Z";
				break;
			case 15:
				letra = "S";
				break;
			case 16:
				letra = "Q";
				break;
			case 17:
				letra = "V";
				break;
			case 18:
				letra = "H";
				break;
			case 19:
				letra = "L";
				break;
			case 20:
				letra = "C";
				break;
			case 21:
				letra = "K";
				break;	
			case 22:
				letra = "E";
				break;
			default:
				break;
		}
		DNI = num+"-"+letra;
		return DNI;
	}
}
