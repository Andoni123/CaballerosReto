package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Arma;
import Modelo.Caballero;
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

		/*	case Menu.MOSTRAR_VARIOS:
				gestorBBDD.conectar();
				ArrayList <Caballero>caballeros=gestorBBDD.getCaballeros();
				Visor.mostrarCaballeros(caballeros);
				gestorBBDD.cerrar();
				break;

			case Menu.MODIFICAR:
				gestorBBDD.conectar();
				caballeros = GestorBBDD.getCaballeros();
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
				break;*/

			default:
				break;
			}

		} while (option != 0);

	}
	
}
