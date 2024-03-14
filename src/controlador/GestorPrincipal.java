package controlador;

import java.util.Scanner;

import vista.Menu;

public class GestorPrincipal {

	public static void run() {

		Scanner scan = new Scanner(System.in);

		int option = Integer.parseInt(scan.nextLine());

		do {

			Menu.mostrarMenuPrincipal();

			switch (option) {

			case Menu.GESTOR:
				

				break;

			default:
				break;
			}

		} while (option != 0);
	}
}
