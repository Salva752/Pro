package Herencia.Ejercicio1;

public class ejMain {

	public static void main(String[] args) {
		Empleado e = new Empleado("Salva", "12345678P", 18, false, 1000);
		Programador p = new Programador("Hector", "87654321S", 22, true, 2000, 500, "Java y SQL");
		
		e.mostrarDatos();
		System.out.println();
		p.mostrarDatos();
		System.out.println("Lineas: "+p.getLineas()+"\nLenguaje: "+p.getLenguaje());
	}

}
