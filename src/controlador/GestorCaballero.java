package controlador;

import java.util.Scanner;

import Modelo.Caballero;
import vista.Formulario;
import vista.Menu;

public class GestorCaballero {

	public static void run(Scanner scan) {

		int option;

		do {
			Menu.mostrarMenuCaballeros();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDD gestorBBDD = new GestorBBDD();

			switch (option) {
			case Menu.INSERTAR_CABALLERO:
				Formulario.pedirDatosCaballero(scan);

				gestorBBDD.insertarCaballero();

				break;

			case Menu.MOSTRAR_CABALLERO:
				int idCaballero = Formulario.pedirIdCaballero(scan);
				gestorBBDD.getCapalleroId(idCaballero);

			case Menu.MOSTRAR_CABALLEROS:
				gestorBBDD.getCaballeros();

			case Menu.MODIFICAR_CABALLERO:

				break;

			case Menu.ELIMINAR_CABALLERO:
				break;

			default:
				break;
			}

		} while (option != 0);

	}
}
