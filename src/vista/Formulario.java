package vista;

import java.util.Scanner;

import Modelo.Arma;
import Modelo.Caballero;
import Modelo.Escudero;

public class Formulario {

	public static void pedirDatosCaballero(Scanner scan) {
		
		Caballero caballero = new Caballero();
		Escudero escudero = new Escudero();
		Arma arma = new Arma();
		

		System.out.println("Escudero del caballero");
		String nombreEscudero = scan.nextLine();
		escudero.setNombre(nombreEscudero);
		caballero.setIdEscudero(escudero.getIdEscudero());
		
		
		
	}

	public static  int pedirIdCaballero(Scanner scan) {
		int idCaballero;
		
		System.out.println("Dame el id del caballero que quieres ver");
		idCaballero= Integer.parseInt(scan.nextLine());
		return idCaballero;
	}
}
