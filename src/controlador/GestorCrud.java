package controlador;

import java.util.Scanner;

import vista.Formulario;
import vista.Menu;

public class GestorCrud {
	
	public static void run(Scanner scan) {
		
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
				break;

			case Menu.GESTIONAR_ESCUDOS:
				break;

			case Menu.GESTIONAR_ESCUDEROS:
				break;

			case Menu.GESTIONAR_CABALLOS:
				break;

			default:
				break;
			}

		} while (option != 0);
	}

}
