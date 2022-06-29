import java.util.Scanner;

/**
 * 13. Algoritmo que pida un número natural y determine si es primo o no. 
 * @author David
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número a comprobar: ");
		int num = teclado.nextInt();
		
		
		int divisores=0;
		
		for(int i=2; i<num && divisores==0; i++) {
			if (num%i==0) {
				divisores++;
			}
		}
		
		if(divisores>0) {
			System.out.println("El número es compuesto");
		} else {
			System.out.println("El número es primo");
		}

	}

}
