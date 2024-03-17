package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Caballero;
import Modelo.Caballo;
import vista.Formulario;
import vista.Menu;
import vista.Visor;

public class GestorCaballos {

	public static void run(Scanner scan) throws SQLException {

		int option;

		do {
			Menu.mostrarMenuCaballos();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDD gestorBBDD = new GestorBBDD();
			

			switch (option) {
			case Menu.INSERTAR:
				gestorBBDD.conectar();
				Caballo caballo = Formulario.pedirDatosCaballo(scan);
				gestorBBDD.insertarCaballo(caballo);
				Visor.caballoInsertado();
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_UNO:
				gestorBBDD.conectar();
				int idCaballo = Formulario.pedirIdCaballo(scan);
				caballo = gestorBBDD.getCaballoId(idCaballo);

				Visor.mostrarCaballo(caballo);
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_VARIOS:
				gestorBBDD.conectar();
				ArrayList <Caballo>caballos=gestorBBDD.getCaballos();
				Visor.mostrarCaballos(caballos);
				gestorBBDD.cerrar();
				break;

			case Menu.MODIFICAR:
				gestorBBDD.conectar();
				caballos = GestorBBDD.getCaballos();
				Visor.mostrarCaballos(caballos);
				idCaballo = Formulario.pedirIdCaballo(scan);
				caballo = Formulario.pedirDatosCaballo(scan);
				gestorBBDD.modificarCaballo(caballo, idCaballo);
				Visor.caballoModificado();
				gestorBBDD.cerrar();
				break;

			case Menu.ELIMINAR:
				gestorBBDD.conectar();
				idCaballo = Formulario.pedirIdCaballo(scan);
				gestorBBDD.eliminarCaballo(idCaballo);
				Visor.caballoEliminado();
				gestorBBDD.cerrar();
				break;

			default:
				break;
			}

		} while (option != 0);

	}
}
