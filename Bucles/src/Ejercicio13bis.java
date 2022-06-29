import java.util.Scanner;

/**
 * 13. Algoritmo que pida un n�mero natural y determine si es primo o no. 
 * @author David
 *
 */
public class Ejercicio13bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero a comprobar: ");
		int num = teclado.nextInt();
		
		
		boolean primo= true;
		for (int i=2;i<num && primo;i++) {
			if (num%i==0) {
				primo=false;
			}
		}
		
		if (primo) {
			System.out.println("El n�mero es primo");
		} else {
			System.out.println("El n�mero es compuesto");
		}
		
		

	}

}
