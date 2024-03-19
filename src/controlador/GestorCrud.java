package controlador;

import java.sql.SQLException;
import java.util.Scanner;

import modelo.GestorBBDD;
import vista.Formulario;
import vista.Menu;

public class GestorCrud {
	
	public static void run(Scanner scan) throws SQLException {
		
		int option;

		do {
			Menu.mostrarMenuCrud();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDD gestorBBDD = new GestorBBDD();

			switch (option) {
			case Menu.GESTIONAR_CABALLEROS:
				GestorCaballero.run(scan);
				break;

			case Menu.GESTIONAR_ARMAS:
				GestorArmas.run(scan);
				break;

			case Menu.GESTIONAR_ESCUDOS:
				GestorEscudos.run(scan);
				break;

			case Menu.GESTIONAR_ESCUDEROS:
				GestorEscudero.run(scan);
				break;

			case Menu.GESTIONAR_CABALLOS:
				GestorCaballos.run(scan);
				break;

			default:
				break;
			}

		} while (option != 0);
	}

}
