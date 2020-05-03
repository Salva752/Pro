//Salva Juan Soria
package Abstractas.Ejercicio2;

public class revistas extends publicacion{
	int numero;
		
		public revistas() {
			
		}
		
		public revistas(int codigo, int ano, int numero, boolean prestado) {
			this.codigo = codigo;
			this.ano = ano;
			this.numero = numero;
			this.prestado = prestado;
		}
	
		public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}

		@Override public String toString() {
			String todo = super.toString();
			todo = todo + "\nNumero: "+numero;
			return todo;
		}
}
