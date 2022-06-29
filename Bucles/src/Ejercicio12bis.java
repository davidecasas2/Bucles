import java.util.Scanner;

/**
 * 12. Algoritmo que determine si un número entero dado es perfecto o no. Se
 * dice que un número es perfecto cuando es igual a la suma de sus divisores,
 * excluido él mismo. Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3.
 * 
 * @author David
 *
 */
public class Ejercicio12bis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el número máximo:");
		int num = entrada.nextInt();

		
		for (int perfecto=1; perfecto<=num; perfecto++) {
			int sumaDivisores = 0;

			for (int i = 1; i < perfecto; i++) {
				if (perfecto % i == 0) {
					sumaDivisores = sumaDivisores + i;
				}
			}
			
			if(sumaDivisores==perfecto) {
				System.out.println(perfecto);
			} 
		}
		
	}

}
