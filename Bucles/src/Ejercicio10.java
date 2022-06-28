
/**
 * 9. Algoritmo que escriba las tablas de multiplicar usando esquemas for. 

 * @author David
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println("Tablas de multiplicar");
		int tabla=1;
		int i=1;
		while (tabla<=10) {
			i=1;
			while (i<=10) {
				System.out.printf("%d x %d = %d\n", tabla, i, tabla*i);
				i++;
			}
			tabla++;
		}
	}

}
