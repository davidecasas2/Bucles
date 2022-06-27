import java.util.Scanner;

/**
 * Ejercicio que calcule la media de 10 números pedidos por teclado.
 * @author David
 *
 */
public class EjercicioExtra2bis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma=0;
		
		System.out.println("Cuantos numeros quieres?: ");
		int numeros = entrada.nextInt();
		
		for (int i=1;i<=numeros;i++) {
			System.out.printf("Introduce el número %d: ",i);
			int num = entrada.nextInt();
			
			suma=suma+num;
		}
		
		float media = (float) suma /numeros;
		System.out.printf("La media es: %.2f",media);

	}

}
