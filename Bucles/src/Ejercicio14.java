import java.util.Scanner;

/**
 * 14. Algoritmo que pida dos números naturales e imprimir su cociente entero 
 * por el método de las restas sucesivas. 
 * @author David
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("introduce el divendendo:");
		int dividendo = entrada.nextInt();
		
		System.out.println("introduce el divisor:");
		int divisor = entrada.nextInt();
		
		int resto=dividendo;
		int cociente=0;
		
		while(resto>=divisor) {
			resto=resto-divisor;
			cociente++;
		}
		
		/*for (cociente=0;resto>=divisor; cociente++) {
			resto=resto-divisor;
		}*/
		
		/*int coc=0;
		int i=0;
		for (i=dividendo;i>=divisor;i=i-divisor) {
			coc++;
		}*/
		
		System.out.printf("LA división entre %d y %d da %d "
				+ "de cociente y %d de resto",dividendo,divisor,cociente,resto);

	}

}
