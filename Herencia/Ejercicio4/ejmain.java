//Salva Juan Soria
package Herencia.Ejercicio4;

public class ejmain {

	public static void main(String[] args) {
		double precioElec = 0, precioLava = 0, precioTele = 0;
		//String color, char consumoEnergetico, float precioBase, float peso
		electrodomestico e1 = new electrodomestico();
		electrodomestico e2 = new electrodomestico(500, 50);
		electrodomestico e3 = new electrodomestico("negro", 'B', 200, 80);
		electrodomestico e4 = new electrodomestico("gris", 'A', 100, 45);
		//String color, char consumoEnergetico, float precioBase, float peso, float carga
		lavadora l1 = new lavadora();
		lavadora l2 = new lavadora(200, 70);
		lavadora l3 = new lavadora("gris", 'A', 100, 45, 20);
		//String color, char consumoEnergetico, float precioBase, float peso, float resolucion, boolean smartTV
		television t1 = new television();
		television t2 = new television(45, 20);
		television t3 = new television("gris", 'A', 200, 55, 55, true);
		electrodomestico[] Electrodomesticos = new electrodomestico[10];
		Electrodomesticos[0] = e1;
		Electrodomesticos[1] = e2;
		Electrodomesticos[2] = e3;
		Electrodomesticos[3] = e4;
		Electrodomesticos[4] = l1;
		Electrodomesticos[5] = l2;
		Electrodomesticos[6] = l3;
		Electrodomesticos[7] = t1;
		Electrodomesticos[8] = t2;
		Electrodomesticos[9] = t3;
		
		//Si el objeto es de un tipo de clase se sumara a la suma total de esa clase
		for (int i = 0;i < 10;i++) {
			System.out.println("Producto "+ (i+1));
			if (Electrodomesticos[i] instanceof electrodomestico) {
				precioElec = precioElec + Electrodomesticos[i].precioFinal();
			}
			if (Electrodomesticos[i] instanceof lavadora) {
				precioLava = precioLava + Electrodomesticos[i].precioFinal();
			}
			if (Electrodomesticos[i] instanceof television) {
				precioTele = precioTele + Electrodomesticos[i].precioFinal();
			}
			System.out.println(Electrodomesticos[i].precioFinal());
		}
		System.out.println("El precio total de electrodomesticos es: "+precioElec+"€ (Total)");
		System.out.println("El precio total de lavadoras es: "+precioLava+"€");
		System.out.println("El precio total de televisiones es: "+precioTele+"€");
	}

}
