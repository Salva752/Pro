//Salva Juan Soria
package Objetos;

import java.util.Scanner;

public class Temperaturas {
	private int diamax = 0;
	private double[] temp = new double[31];
	Scanner sc = new Scanner(System.in);
	
	public Temperaturas(Estacion e1) {
		switch (e1.getMes()) {
		case "Enero":
			diamax = 31;
			break;
		case "Febrero":
			if(e1.getAnyo() % 4 == 0) {
				diamax = 29;
			} else { diamax = 28; }
			break;
		case "Marzo":
			diamax = 31;
			break;
		case "Abril":
			diamax = 30;
			break;
		case "Mayo":
			diamax = 31;
			break;
		case "Junio":
			diamax = 31;
			break;
		case "Julio":
			diamax = 31;
			break;
		case "Agosto":
			diamax = 31;
			break;
		case "Septiembre":
			diamax = 30;
			break;
		case "Octubre":
			diamax = 31;
			break;
		case "Noviembre":
			diamax = 30;
			break;
		case "Diciembre":
			diamax = 31;
			break;
		}
	}
	
	public void leer() {
		for (int cont = 0;cont < diamax;cont++) {
			System.out.print("\nTemperatura del dia "+(cont+1)+": ");
			temp[cont] = cont;
			//temp[cont] = sc.nextDouble();
		}
	}
	
	public double media() {
		double media = 0;
		for (int cont = 0;cont < diamax;cont++) {
			media = temp[cont] + media;
		}
		media = media / diamax;
		return media;
	}
	
	public String mostrar() {
		String todo = "";
		for (int cont = 0;cont < diamax;cont++) {
			todo = todo + ("\nTemperatura del dia "+(cont+1)+": "+temp[cont]);
		}
		return todo;
	}
	
	public double maxima() {
		double max = 0;
		for (int cont = 0;cont < diamax;cont++) {
			 if (temp[cont] > max) {
				 max = temp[cont];
			 }
		}
		return max;
	}
	
	public double minima() {
		double min=999999999;
		for (int cont = 0;cont < diamax;cont++) {
			 if (temp[cont] < min) {
				 min = temp[cont];
			 }
		}
		return min;
	}
}
