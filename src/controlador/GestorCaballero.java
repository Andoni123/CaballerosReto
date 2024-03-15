package controlador;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Caballero;
import vista.*;

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
				gestorBBDD.conectar();
				int idCaballero = Formulario.pedirIdCaballero(scan);
				Caballero caballero=gestorBBDD.getCapalleroId(idCaballero);
				Visor.mostrarCaballero(caballero);
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_CABALLEROS:
				gestorBBDD.conectar();
				ArrayList <Caballero>caballeros=gestorBBDD.getCaballeros();
				Visor.mostrarCaballeros(caballeros);
				gestorBBDD.cerrar();
				break;

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
