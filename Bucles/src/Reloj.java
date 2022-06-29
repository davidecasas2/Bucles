import java.util.concurrent.TimeUnit;

/**
 * Programa que muestra un erloj durante 24 horas en formato 00:00:00
 * @author David
 *
 */
public class Reloj {

	public static void main(String[] args) throws InterruptedException {

		String borrar="\b\b\b\b\b\b\b\b";
		for (int horas=0; horas<24;horas++) {
			for (int minutos=0;minutos<60;minutos++) {
				for (int segundos=0; segundos<60;segundos++) {
					System.out.printf("%02d:%02d:%02d", horas,minutos,segundos);
					TimeUnit.MILLISECONDS.sleep(1);
					System.out.print(borrar);
				}
			}
		}

	}

}
