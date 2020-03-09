package Objetos;

public class mainAlumnos {

public static void main(String[] args) {
		
		Notas n1 = new Notas();
		Notas n2 = new Notas();
		n1.leer();
		
		Alumnos a1 = new Alumnos("Sergi", 42069, n1);
		Alumnos a2 = new Alumnos();
		
		System.out.println("");
		
		n2.leer();
		a2.setNotasAlumnos(n2);
		a2.setNombre("Salva");
		a2.setNumExp(69420);
		
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}
}