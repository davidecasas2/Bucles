import java.util.Iterator;
import java.util.Scanner;

/**
 * 5. Algoritmo que sume los n primeros n�meros enteros, siendo n un n�mero 
 * introducido por el usuario. 
 */
public class Ejercicio5 {

	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		int num = entrada.nextInt();
		
		int suma = 0;
		
		for(int i=1; i<=num; i++) {
			suma=suma+i;
		}
		System.out.println("LA suma de los n primeros es "+suma);
	}
}
