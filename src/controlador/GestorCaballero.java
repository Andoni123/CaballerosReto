package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import controlador.*;
import modelo.*;
import vista.*;

public class GestorCaballero {

	public static void run(Scanner scan) throws SQLException {

		int option;

		do {
			Menu.mostrarMenuCaballeros();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDDcontrolador gestorBBDD = new GestorBBDDcontrolador();
			

			switch (option) {
			case Menu.INSERTAR:
				gestorBBDD.conectar();
				Caballero caballero = Formulario.pedirDatosCaballero(scan);
				gestorBBDD.insertarCaballero(caballero);
				Visor.caballeroInsertado();
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_UNO:
				gestorBBDD.conectar();
				int idCaballero = Formulario.pedirIdCaballero(scan);
				 caballero=gestorBBDD.getCaballeroId(idCaballero);

				Visor.mostrarCaballero(caballero);
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_VARIOS:
				gestorBBDD.conectar();
				ArrayList <Caballero>caballeros=gestorBBDD.getCaballeros();
				Visor.mostrarCaballeros(caballeros);
				gestorBBDD.cerrar();
				break;

			case Menu.MODIFICAR:
				gestorBBDD.conectar();
				caballeros = GestorBBDDcontrolador.getCaballeros();
				Visor.mostrarCaballeros(caballeros);
				idCaballero = Formulario.pedirIdCaballero(scan);
				caballero = Formulario.pedirDatosCaballero(scan);
				gestorBBDD.modificarCaballero(caballero, idCaballero);
				Visor.caballeroModificado();
				gestorBBDD.cerrar();
				break;

			case Menu.ELIMINAR:
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
