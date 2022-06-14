
import java.util.Scanner;

public class MenuDeEjecucion {

	public static String[] DAYS = new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", " Sabado",
			"Domingo" };
	private static Scanner scanner;

	public static void showMenu() {
		System.out.println("Bienvenido a la base de lanzamiento");
		System.out.println("Selecciona la opción deseada");

		int response = 0;
		do {
			System.out.println("1. Día de lanzamiento");
			System.out.println("2. Seleccione el tipo de nave");
			System.out.println("0. Salir");

			scanner = new Scanner(System.in);
			response = Integer.valueOf(scanner.nextLine());

			switch (response) {
				case 1:
					System.out.println("Seleccione el día");
					System.out.println("::Día de la semana");
					for (int i = 0; i < 7; i++) {
						System.out.println(i + "." + DAYS[i]);
					}
					System.out.println("\n\n");
					break;
				case 2:
					response = 0;
					showNaveMenu();
					break;
				case 0:
					System.out.println("Thank you for you visit");
					break;
				default:
					System.out.println("Please select a correct answer");
			}
		} while (response != 0);
	}

	static void showNaveMenu() {
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("tipos de Naves");
			System.out.println("1. Lanzadera");
			System.out.println("2. Tripulada");
			System.out.println("3. No Tripulada");
			System.out.println("3. De Exploración");
			System.out.println("0. Return");

			scanner = new Scanner(System.in);
			response = Integer.valueOf(scanner.nextLine());

		} while (response != 0);
	}
}
