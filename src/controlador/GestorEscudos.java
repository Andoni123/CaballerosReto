package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Arma;
import modelo.Escudo;
import modelo.GestorBBDD;
import vista.Formulario;
import vista.Menu;
import vista.Visor;

public class GestorEscudos {

	public static void run(Scanner scan) throws SQLException {

		int option;

		do {
			Menu.mostrarMenuEscudos();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDD gestorBBDD = new GestorBBDD();

			switch (option) {
			case Menu.INSERTAR:
				gestorBBDD.conectar();
				Escudo escudo = Formulario.pedirDatosEscudo(scan);
				gestorBBDD.insertarEscudo(escudo);
				Visor.escudoInsertado();
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_UNO:
				gestorBBDD.conectar();
				int idEscudo = Formulario.pedirIdEscudo(scan);
				escudo = gestorBBDD.getEscudoId(idEscudo);
				Visor.mostrarEscudo(escudo);
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_VARIOS:
				gestorBBDD.conectar();
				ArrayList<Escudo> escudos = gestorBBDD.getEscudos();
				Visor.mostrarEscudos(escudos);
				gestorBBDD.cerrar();
				break;

			case Menu.MODIFICAR:
				gestorBBDD.conectar();
				escudos = GestorBBDD.getEscudos();
				Visor.mostrarEscudos(escudos);
				idEscudo = Formulario.pedirIdEscudo(scan);
				escudo = Formulario.pedirDatosEscudo(scan);
				gestorBBDD.modificarEscudo(escudo, idEscudo);
				Visor.escudoModificado();
				gestorBBDD.cerrar();
				break;

			case Menu.ELIMINAR:
				gestorBBDD.conectar();
				idEscudo = Formulario.pedirIdEscudo(scan);
				gestorBBDD.eliminarEscudo(idEscudo);
				Visor.escudoEliminado();
				gestorBBDD.cerrar();
				break;

			default:
				break;
			}

		} while (option != 6);

	}

}
