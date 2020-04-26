//Salva Juan Soria
package Abstractas.Ejercicio0;

public abstract class MiembroUPV extends Persona{
	String carnet;

		public String getCarnet() {
			return carnet;
		}

		public void setCarnet(String carnet) {
			this.carnet = carnet;
		}
		
		public abstract void menuIntranet();
}
