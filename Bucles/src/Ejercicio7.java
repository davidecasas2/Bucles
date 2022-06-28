import java.util.Scanner;

/**
 * 7. Algoritmo que cuente cu�ntos m�ltiplos de 7 hay entre dos enteros dados 
 * por el usuario.
 * @author David
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduce otro n�mero: ");
		int num2 = entrada.nextInt();
		
		int contador=0;
		
		while(num1%7==0) {
			num1++;
		}
		
		for (int i=num1; i<num2;i=i+7) {
			contador++;
		}
		System.out.printf("Hay %d divisores de 7 entre %d y %d", contador, num1,num2);
	}

}
