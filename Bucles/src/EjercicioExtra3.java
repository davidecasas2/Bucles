import java.util.Random;
import java.util.Scanner;

/**
 * Programa que pide un número del 1 al 10 hasta que el usuario acierte 
 * el número definido en el programa. Solamente tiene 3 oportunidades
 * @author David
 *
 */
public class EjercicioExtra3 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		final int acierto=aleatorio.nextInt(10)+1;
		int oportunidades = 3;
		
		//System.out.println(acierto);
		
		Scanner teclado =  new Scanner(System.in);
		
		int num;
		do {
			System.out.println("te quedan "+oportunidades+ " intentos.");
			System.out.println("Acierta el número (del 1 al 10): ");
			num = teclado.nextInt();
			
			if (num==acierto) {
				System.out.println("Enhorabuena!, Has acertado");
			} else {
				System.out.println("Has fallado. Vuelve a intentarlo.");
				oportunidades--;
			}
		}while((num!=acierto) && (oportunidades>0));
		
		if (oportunidades==0) {
			System.out.println("TE has quedado sin intentos. El número era "+acierto);
		}

	}

}
