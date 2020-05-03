//Salva Juan Soria
package Abstractas.Ejercicio2;

public class ejmain {

	public static void main(String[] args) {
		int prestados = 0;
		libros l1 = new libros(887948, 1998, "Cervantes", true);
		revistas r1 = new revistas(88748, 1988, 87, false);
		libros l2 = new libros(887948, 1998, "Cervantes", false);
		revistas r2 = new revistas(88748, 1988, 87, true);
		libros l3 = new libros(887948, 1998, "Cervantes", false);
		revistas r3 = new revistas(88748, 1988, 87, false);
		libros l4 = new libros(887948, 1998, "Cervantes", true);
		revistas r4 = new revistas(88748, 1988, 87, false);
		publicacion[] p1 = new publicacion[8];

		p1[0]=l1;
		p1[1]=r1;
		p1[2]=l2;
		p1[3]=r2;
		p1[4]=l3;
		p1[5]=r3;
		p1[6]=l4;
		p1[7]=r4;
		
		for(int i = 0;i < p1.length;i++) {
			System.out.println(p1[i].toString());
			if (p1[i].prestado() == true) {
				prestados++;
			}
		}
		
		System.out.println("Hay "+prestados+" libros prestados");
	}
}
