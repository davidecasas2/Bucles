
/**
 * 9. Algoritmo que escriba las tablas de multiplicar usando esquemas for. 

 * @author David
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println("Tablas de multiplicar");
		for (int tabla=1;tabla<=10;tabla++) {
			for (int i=1;i<=10; i++) {
				System.out.printf("%d x %d = %d\n", tabla, i, tabla*i);
			}
		}
	}

}
