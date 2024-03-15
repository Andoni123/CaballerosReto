package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.*;
import controlador.*;

import vista.*;

public class GestorCaballero {

	public static void run(Scanner scan) throws SQLException {

		int option;

		do {
			Menu.mostrarMenuCaballeros();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDD gestorBBDD = new GestorBBDD();
			

			switch (option) {
			case Menu.INSERTAR_CABALLERO:
				gestorBBDD.conectar();
				Caballero caballero = Formulario.pedirDatosCaballero(scan);
				gestorBBDD.insertarCaballero(caballero);
				Visor.caballeroInsertado();
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_CABALLERO:
				gestorBBDD.conectar();
				int idCaballero = Formulario.pedirIdCaballero(scan);
				 caballero=gestorBBDD.getCapalleroId(idCaballero);
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
				gestorBBDD.conectar();
				caballeros = GestorBBDD.getCaballeros();
				Visor.mostrarCaballeros(caballeros);
				idCaballero = Formulario.pedirIdCaballero(scan);
				caballero = Formulario.pedirDatosCaballero(scan);
				gestorBBDD.modificarCaballero(caballero, idCaballero);
				Visor.caballeroModificado();
				gestorBBDD.cerrar();
				break;

			case Menu.ELIMINAR_CABALLERO:
				gestorBBDD.conectar();
				idCaballero = Formulario.pedirIdCaballero(scan);
				gestorBBDD.eliminarCaballero(idCaballero);
				Visor.caballeroEliminado();
				gestorBBDD.cerrar();
				break;

			default:
				break;
			}

		} while (option != 0);

	}
}
