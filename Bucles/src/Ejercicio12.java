import java.util.Scanner;

/**
 * 12. Algoritmo que determine si un número entero dado es perfecto o no. Se
 * dice que un número es perfecto cuando es igual a la suma de sus divisores,
 * excluido él mismo. Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3.
 * 
 * @author David
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el número a comprobar:");
		int num = entrada.nextInt();

		int sumaDivisores = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sumaDivisores = sumaDivisores + i;
			}
			
			
		}
		
		if(sumaDivisores==num) {
			System.out.println("El numero es perfecto");
		} else {
			System.out.println("El número no es perfecto");
		}
	}

}
