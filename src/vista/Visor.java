package vista;

import java.util.ArrayList;

import Modelo.Caballero;

public class Visor {

	public static void mostrarCaballeros (ArrayList<Caballero> caballeros) {
		
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
	
	

}
