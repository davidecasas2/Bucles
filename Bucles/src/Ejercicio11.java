
/**
 * 9. Algoritmo que escriba las tablas de multiplicar usando esquemas for. 

 * @author David
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("Tablas de multiplicar");
		int tabla=1;
		int i=1;
		do{
			i=1;
			do {
				System.out.printf("%d x %d = %d\n", tabla, i, tabla*i);
				i++;
			} while (i<=10);
			tabla++;
			System.out.println();
		} while (tabla<=10) ;
	}

}
