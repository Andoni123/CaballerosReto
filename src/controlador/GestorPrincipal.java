package controlador;

import java.sql.SQLException;
import java.util.Scanner;

import vista.Menu;
import vista.Visor;

public class GestorPrincipal {

	public static void run() throws SQLException {

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
				Batalla.run(scan);
				break;
			
			case Menu.MAS_INFORMACION:
				Visor.mostrarInformacion();
				break;

			default:
				break;
			}

		} while (option != 0);
	}
}
