package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Arma;
import modelo.Caballero;
import modelo.GestorBBDD;
import vista.Formulario;
import vista.Menu;
import vista.Visor;

public class GestorArmas {

	public static void run(Scanner scan) throws SQLException {
		
		int option;

		do {
			Menu.mostrarMenuArmas();
			System.out.println("Introduzca la opcion");
			option = Integer.parseInt(scan.nextLine());
			GestorBBDD gestorBBDD = new GestorBBDD();
			

			switch (option) {
			case Menu.INSERTAR:
				gestorBBDD.conectar();
				Arma arma = Formulario.pedirDatosArma(scan);
				gestorBBDD.insertarArma(arma);
				Visor.armaInsertada();
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_UNO:
				gestorBBDD.conectar();
				int idArma = Formulario.pedirIdArma(scan);
				 arma=gestorBBDD.getArmaId(idArma);
				Visor.mostrarArma(arma);
				gestorBBDD.cerrar();
				break;

			case Menu.MOSTRAR_VARIOS:
				gestorBBDD.conectar();
				ArrayList <Arma>armas=gestorBBDD.getArmas();
				Visor.mostrarArmas(armas);
				gestorBBDD.cerrar();
				break;

				case Menu.MODIFICAR:
				gestorBBDD.conectar();
				armas = GestorBBDD.getArmas();
				Visor.mostrarArmas(armas);
				idArma = Formulario.pedirIdArma(scan);
				arma = Formulario.pedirDatosArma(scan);
				gestorBBDD.modificarArma(arma, idArma);
				Visor.armaModificada();
				gestorBBDD.cerrar();
				break;

			case Menu.ELIMINAR:
				gestorBBDD.conectar();
				idArma = Formulario.pedirIdArma(scan);
				gestorBBDD.eliminarArma(idArma);
				Visor.armaEliminada();
				gestorBBDD.cerrar();
				break;

			default:
				break;
			}

		} while (option != 0);

	}
	
}
