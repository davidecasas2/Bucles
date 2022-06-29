import java.util.Scanner;

/**
 * Mostra un triangulo de asteriscos inverso con tantas l�neas como 
 * diga el usuario
 * @author David
 *
 */
public class Pir�mide {

	public static void main(String[] args) {
		Scanner otro = new Scanner(System.in);
		
		System.out.println("DE cuantas filas quieres la pir�mide?: ");
		int fila = otro.nextInt();
		
		for (int i=1;i<=fila;i++) {
			for (int j=1;j<=fila-i;j++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
