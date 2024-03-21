package vista;

import java.util.ArrayList;

import modelo.Arma;
import modelo.Caballero;
import modelo.Caballo;
import modelo.Escudero;
import modelo.Escudo;

public class Visor {

	public static void mostrarCaballeros(ArrayList<Caballero> caballeros) {

		for (Caballero caballero : caballeros) {
			System.out.println(caballero.toString());
		}
	}

	public static void mostrarCaballero(Caballero caballero) {

		System.out.println(caballero.toString());
	}

	public static void caballeroInsertado() {

		System.out.println("Caballero insertado");
	}

	public static void caballeroModificado() {

		System.out.println("Caballero modificado");
	}

	public static void caballeroEliminado() {

		System.out.println("Caballero eliminado");
	}

	public static void armaInsertada() {
		System.out.println("Arma insertada");

	}

	public static void mostrarArma(Arma arma) {

		System.out.println(arma.toString());

	}

	public static void mostrarArmas(ArrayList<Arma> armas) {

		for (Arma arma : armas) {
			System.out.println(arma.toString());
		}
	}

	public static void armaModificada() {

		System.out.println("arma modificada");

	}

	public static void armaEliminada() {

		System.out.println("Arma eliminada");

	}

	public static void escudoInsertado() {

		System.out.println("Escudo insertado");

	}

	public static void mostrarEscudo(Escudo escudo) {

		System.out.println(escudo.toString());

	}

	public static void mostrarEscudos(ArrayList<Escudo> escudos) {

		for (Escudo escudo : escudos) {
			System.out.println(escudo.toString());
		}
	}

	public static void escudoModificado() {

		System.out.println("Escudo modificado");

	}

	public static void escudoEliminado() {

		System.out.println("Escudo eliminado");

	}

	public static void escuderoInsertado() {

		System.out.println("Escudero insertado");

	}

	public static void mostrarEscudero(Escudero escudero) {

		System.out.println(escudero.toString());

	}

	public static void mostrarEscuderos(ArrayList<Escudero> escuderos) {

		for (Escudero escudero : escuderos) {
			System.out.println(escudero.toString());
		}
	}

	public static void escuderoModificado() {
		System.out.println("Escudero Modificado");

	}

	public static void escuderoEliminado() {
		System.out.println("Escudero eliminado");

	}

	public static void caballoInsertado() {

		System.out.println("Caballo insertado");

	}

	public static void mostrarCaballo(Caballo caballo) {

		System.out.println(caballo.toString());

	}

	public static void mostrarCaballos(ArrayList<Caballo> caballos) {

		for (Caballo caballo : caballos) {
			System.out.println(caballo.toString());
		}

	}

	public static void caballoModificado() {

		System.out.println("Caballo modificado");

	}

	public static void caballoEliminado() {

		System.out.println("Caballo eliminado");

	}
	
	public static void mostrarInformacion() {
		
		System.out.println("\nInformación Educativa:");
        System.out.println("---------------------------");
        System.out.println("Los caballeros eran guerreros de élite en la sociedad feudal de la Edad Media, ");
        System.out.println("comprometidos con el código de honor conocido como la Caballería. Este código ");
        System.out.println("exigía lealtad, valentía, cortesía y protección de los débiles. Los caballeros ");
        System.out.println("participaron en torneos, justas y batallas en nombre de su señor feudal.");
        System.out.println("La Edad Media fue un período histórico que abarcó aproximadamente desde el siglo V ");
        System.out.println("hasta el siglo XV en Europa. Se caracterizó por la fragmentación política, la ");
        System.out.println("feudalización de la sociedad, el poder de la Iglesia Católica, las Cruzadas y el ");
        System.out.println("desarrollo de la arquitectura gótica, entre otros aspectos.");
	}

}
