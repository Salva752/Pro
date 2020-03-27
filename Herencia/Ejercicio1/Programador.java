package Herencia.Ejercicio1;

public class Programador extends Empleado {
		int lineas;
		String lenguaje;
		
		public Programador() {
			
		}
		
		public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineas, String lenguaje) {
			this.nombre = nombre;
			this.dni = dni;
			this.edad = edad;
			this.casado = casado;
			this.salario = salario;
			this.lineas = lineas;
			this.lenguaje = lenguaje;
		}
		
		public String nivelProgramacion() {
			String nivel = "";
			if (lineas < 200) {
				nivel = "Level 1";
			}else if (lineas >= 200 && lineas <= 500) {
				nivel = "Level 2";
			}else if (lineas > 500) {
				nivel = "Level 3";
			}
			return nivel;
		}

		public int getLineas() {
			return lineas;
		}

		public void setLineas(int lineas) {
			this.lineas = lineas;
		}

		public String getLenguaje() {
			return lenguaje;
		}

		public void setLenguaje(String lenguaje) {
			this.lenguaje = lenguaje;
		}
}
