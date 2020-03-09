//Salva Juan Soria
package Objetos;

public class Estacion {
	private String nombreMes;
	private int anyo;
	private Temperaturas temperaturas;
	
	public Estacion() {
		
	}
	
	public Estacion(String nombreMes, int anyo, Temperaturas temperaturas) {
		this.nombreMes=nombreMes;
		this.anyo=anyo;
		this.temperaturas=temperaturas;
	}

	public String toString() {
		String todo = "";
		double media = temperaturas.media();
		todo = "\n\nFecha: " + nombreMes + " " + anyo + "\n\n";
		todo = todo + "------ Temperaturas ------";
		todo = todo + media + "\n";
		todo = todo + temperaturas.mostrar();
		todo = todo + "\n\nTemperatura maxima: "+temperaturas.maxima()+"\nTemperatura minima: "+temperaturas.maxima();
		return todo;
	}
	
	public String getMes() {
		return nombreMes;
	}

	public void setMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public Temperaturas getTemp() {
		return temperaturas;
	}

	public void setTemp(Temperaturas temperaturas) {
		this.temperaturas = temperaturas;
	}
}