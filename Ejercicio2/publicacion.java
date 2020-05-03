//Salva Juan Soria
package Abstractas.Ejercicio2;

public abstract class publicacion implements interfaz{
	int codigo, ano;
	boolean prestado = false;
	
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public boolean isPrestado() {
			return prestado;
		}
		public void setPrestado(boolean prestado) {
			this.prestado = prestado;
		}
		
		@Override public String toString() {
			String todo = "Codigo: "+codigo+"\nA�o de publicacion: "+ano+"\nPrestado? "+prestado;
			return todo;
		}
		
		public void prestar() {
			prestado = true;
		}
		
		public void devolver() {
			prestado = false;
		}
		
		public boolean prestado() {
			return prestado;
		}
		
}
