import java.util.Scanner;

/**
 * Mostra un triangulo de asteriscos inverso con tantas líneas como 
 * diga el usuario
 * @author David
 *
 */
public class TrianguloInv {

	public static void main(String[] args) {
		Scanner otro = new Scanner(System.in);
		
		System.out.println("DE cuantas filas quieres el triángulo?: ");
		int fila = otro.nextInt();
		
		for (int i=1;i<=fila;i++) {
			
			for (int j=i; j<=fila; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
