import java.util.Scanner;

/**
 * 6. Algoritmo que calcule el factorial de un n�mero entero introducido 
 * por el usuario. 
 *
 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("C�lculo del factorial");
		System.out.println("Introduce el n�mero");
		int num = teclado.nextInt();
		
		double fact = 1;
		for (int i=num; i>1; i--) {
			fact=fact*i;
		}
		
		/*for (int i=1; i<=num; i++) {
			fact=fact*i;
		}*/
		
		System.out.printf("el factorial de %d es %f\n",num, fact);

	}

}
