package ud4funciones;

public class Ejercicio43 {
	static void dibujarRectangulo(int ancho, int alto)

if (ancho > 0 && alto > 0) {
			for (int i = 0; i < alto; i++) {
				for (int j = 0; j < ancho; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("El ancho o el alto son menores que 0");
		}
	}

	public static void main(String[] args) {
		dibujarRectangulo(10, 8);
		dibujarRectangulo(-4, 1); // ejemplo números negativos
	}
}
