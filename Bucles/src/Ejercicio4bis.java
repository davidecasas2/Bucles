import java.util.Scanner;

/**
 * 4. Algoritmo que escriba los números impares comprendidos entre dos enteros 
 * introducidos por el usuario. 
 * @author David
 *
 */
public class Ejercicio4bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número: ");
		int num2 = teclado.nextInt();
		
		int menor = num1;
		int mayor = num2;
		
		if (num1>num2) 
		{
			menor=num2;
			mayor=num1;
		}
		if (menor%2==0) {
			menor++;
		}
		
		for (int i = menor; i <=mayor ; i=i+2) 
		{
			System.out.println(i);
		}
		

		

	}

}
