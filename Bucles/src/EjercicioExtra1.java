import java.util.Scanner;

/**
 * Ejercicio que calcule la media de 10 números pedidos por teclado.
 * @author David
 *
 */
public class EjercicioExtra1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma=0;
		for (int i=1;i<=10;i++) {
			System.out.printf("Introduce el número %d: ",i);
			int num = entrada.nextInt();
			
			suma=suma+num;
		}
		
		float media = suma /10.0f;
		System.out.printf("La media es: %.2f",media);

	}

}
