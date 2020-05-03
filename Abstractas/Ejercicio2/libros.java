//Salva Juan Soria
package Abstractas.Ejercicio2;

public class libros extends publicacion{
	String autor;

		public libros() {
			
		}
		
		public libros(int codigo, int ano, String autor, boolean prestado) {
			this.codigo = codigo;
			this.ano = ano;
			this.autor = autor;
			this.prestado = prestado;
		}
		
		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		@Override public String toString() {
			String todo = super.toString();
			todo = todo + "\nAutor: "+autor;
			return todo;
		}
}
