package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Escudero;
import Modelo.Escudo;
import vista.Formulario;
import vista.Menu;
import vista.Visor;

public class GestorEscudero {

	public static void run(Scanner scan) throws SQLException {

		int option;

		do {
			Menu.mostrarMenuEscuderos();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDD gestorBBDD = new GestorBBDD();

			switch (option) {
			case Menu.INSERTAR:
				gestorBBDD.conectar();
				Escudero escudero = Formulario.pedirDatosEscudero(scan);
				gestorBBDD.insertarEscudero(escudero);
				Visor.escuderoInsertado();
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_UNO:
				gestorBBDD.conectar();
				int idEscudero = Formulario.pedirIdEscudero(scan);
				escudero = gestorBBDD.getEscuderoId(idEscudero);
				Visor.mostrarEscudero(escudero);
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_VARIOS:
				gestorBBDD.conectar();
				ArrayList<Escudero> escuderos = gestorBBDD.getEscuderos();
				Visor.mostrarEscuderos(escuderos);
				gestorBBDD.cerrar();
				break;

			case Menu.MODIFICAR:
				gestorBBDD.conectar();
				escuderos = GestorBBDD.getEscuderos();
				Visor.mostrarEscuderos(escuderos);
				idEscudero = Formulario.pedirIdEscudero(scan);
				escudero = Formulario.pedirDatosEscudero(scan);
				gestorBBDD.modificarEscudero(escudero, idEscudero);
				Visor.escuderoModificado();
				gestorBBDD.cerrar();
				break;

			case Menu.ELIMINAR:
				gestorBBDD.conectar();
				idEscudero = Formulario.pedirIdEscudero(scan);
				gestorBBDD.eliminarEscudero(idEscudero);
				Visor.escuderoEliminado();
				gestorBBDD.cerrar();
				break;

			default:
				break;
			}

		} while (option != 0);
	}
}
