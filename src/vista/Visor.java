package vista;

import java.util.ArrayList;

import Modelo.Arma;
import Modelo.Caballero;
import Modelo.Caballo;
import Modelo.Escudero;
import Modelo.Escudo;

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

		System.out.println(arma);

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

		System.out.println(escudo);

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

		System.out.println(escudero);

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

		System.out.println(caballo);

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

}
