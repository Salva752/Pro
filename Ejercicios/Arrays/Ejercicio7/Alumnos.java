package Objetos;

public class Alumnos {
	private String nombre;
	private int numExp;
	private Notas notasAlumnos;
	
	public Alumnos() {
		
	}
	
	public Alumnos(String nombre, int numExp, Notas notasAlumnos) {
		this.nombre=nombre;
		this.numExp=numExp;
		this.notasAlumnos=notasAlumnos;
	}
	
	public String toString() {
		String todo = "";
		double media = notasAlumnos.media();
		todo = "\n\nAlumno: " + nombre + " " + numExp + "\n\n";
		todo = todo + "------ Notas ------";
		todo = todo + media;
		todo = todo + notasAlumnos.mostrar();
		return todo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumExp() {
		return numExp;
	}

	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}

	public Notas getNotasAlumnos() {
		return notasAlumnos;
	}

	public void setNotasAlumnos(Notas notasAlumnos) {
		this.notasAlumnos = notasAlumnos;
	}
}
