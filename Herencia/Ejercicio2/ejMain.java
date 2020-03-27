//Salva Juan Soria
package Herencia.Ejercicio2;

public class ejMain {

	public static void main(String[] args) {
		Profesor p = new Profesor("Fernando", "D104");
		p.setEdad(45);
		p.setHorarioTutorias("Lunes de 10:00 a 13:00");
		ProfesorEnfermo pe = new ProfesorEnfermo();
		p.getConsultas();
		pe.getConsultas();
	}

}
