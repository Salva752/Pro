package Herencia.Ejercicio3;

public class Directivo extends Empleado {
	public Directivo() {
		
	}
	
	public Directivo(String nombre) {
		this.setNombre(nombre);
	}
	
	public String toString() {
		String todo=this.nombre+" es un objeto de la clase Empleado > Directivo";
		return todo;
	}
}
