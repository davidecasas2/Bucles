import java.util.Scanner;

/**
 * Pedir 10 numeros por teclado y calcular cual es el menor
 * @author David
 *
 */
public class EjercicioExtra4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Introduce el número 0: ");
		int num = entrada.nextInt();
		int menor=num;


		for (int i =1; i<10; i++) {
			System.out.printf("Introduce el número %d: ",i);
			num = entrada.nextInt();
			
			if(num<menor) {
				menor=num;
			}
		}
		
		System.out.println("El menor es "+menor);

	}

}
