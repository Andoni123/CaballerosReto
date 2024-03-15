package controlador;

import java.util.Scanner;

import vista.Menu;

public class GestorPrincipal {

	public static void run() {

		Scanner scan = new Scanner(System.in);

		int option;

		do {

			Menu.mostrarMenuPrincipal();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());

			switch (option) {

				
			case Menu.GESTOR:
				GestorCrud.run(scan);
				break;
				
			
			case Menu.BATALLA:
				break;
			
			case Menu.MAS_INFORMACION:
				break;

			default:
				break;
			}

		} while (option != 0);
	}
}
