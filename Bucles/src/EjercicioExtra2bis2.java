import java.util.Scanner;

/**
 * Ejercicio que calcule la media de 10 n�meros pedidos por teclado.
 * @author David
 *
 */
public class EjercicioExtra2bis2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma=0;
		int numeros=0;
		
		
		int opcion=0;
		do {
			System.out.printf("Introduce el n�mero %d: ",numeros);
			int num = entrada.nextInt();
			
			suma=suma+num;
			numeros++;
			System.out.println("Si quieres m�s n�mero pulsa 1: ");
			opcion = entrada.nextInt();
		}while(opcion==1);
		
		float media = (float) suma /numeros;
		System.out.printf("La media es: %.2f",media);

	}

}
