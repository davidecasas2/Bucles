import java.util.Scanner;

/**
 * 4. Algoritmo que escriba los números impares comprendidos entre dos enteros 
 * introducidos por el usuario. 
 * @author David
 *
 */
public class Ejercicio4 {

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
		
		for (int i = menor; i <=mayor ; i++) 
		{
			if (i%2!=0) 
			{
				System.out.println(i);
			}
		}
		
	/*	for (int i = Math.min(num1, num2); i <=Math.max(num1, num2) ; i++) 
		{
			if (i%2!=0) 
			{
				System.out.println(i);
			}
		}*/
		

	}

}
