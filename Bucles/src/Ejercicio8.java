import java.util.Scanner;

/**
 * 8. Algoritmo que escriba todos los divisores de un número entero introducido
 *  por el usuario.
 * @author David
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num = entrada.nextInt();
		System.out.println("los divisores son:");
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}

	}

}
