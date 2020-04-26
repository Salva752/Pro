//Salva Juan Soria
package Abstractas.Ejercicio0;

import java.util.Scanner;

public class Estudiante extends MiembroUPV{
	
	private int numExp;
	private String curso;
	private double[] notas = new double[7];
	
	public Estudiante(String nombre, String Curso, int numExp) {
		this.nombre = nombre;
		this.curso = Curso;
		this.numExp = numExp;
	}
	
	public int getNumExp() {
		return numExp;
	}
	
	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getNotaMedia() {
		double media = 0;
		for (int cont = 0;cont < notas.length;cont++) {
			media = media + notas[cont];
		}
		media = media/7;
		return media;
	}
	
	@Override public void menuIntranet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al menú Intranet estudiante, seleccione la operación que desee hacer:  \n1-Ver la información del estudiante \n2-¿A qué actividades deportivas desea apuntarse? \n3-SALIR");
		switch (sc.nextInt()) {
			case 1:
				System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nNumero Expediente: "+numExp+"\nCurso: "+curso);
				break;
			case 2:
				System.out.println("Introduce a que actividades deseas apuntarte");
				sc.nextLine();
				sc.nextLine();
				break;
			case 3:
				System.out.println("HASTA LUEGO!\nGracias por utilizar la Intranet de estudiante");
				break;
			}
		}

}
