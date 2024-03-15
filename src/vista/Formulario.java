package vista;

import java.util.Scanner;

import Modelo.Arma;
import Modelo.Caballero;
import Modelo.Escudero;

public class Formulario {

	public static Caballero pedirDatosCaballero(Scanner scan) {

		Caballero caballero = new Caballero();

		System.out.println("Nombre del caballero");
		String nombreCaballero = scan.nextLine();
		caballero.setNombre(nombreCaballero);

		System.out.println("Escudero del caballero");
		int idEscudero = Integer.parseInt(scan.nextLine());
		caballero.setIdEscudero(idEscudero);

		System.out.println("Arma del caballero");
		int idArma = Integer.parseInt(scan.nextLine());
		caballero.setIdArma(idArma);

		System.out.println("Escudo del caballero");
		int idEscudo = Integer.parseInt(scan.nextLine());
		caballero.setIdEscudo(idEscudo);
		
		System.out.println("Fuerza del caballero");
		int fuerzaLucha = Integer.parseInt(scan.nextLine());
		caballero.setFuerzaLucha(fuerzaLucha);
		
		System.out.println("Habilidad del caballero");
		int habilidad = Integer.parseInt(scan.nextLine());
		caballero.setHabilidad(habilidad);
		
		System.out.println("Caballo del caballero");
		int idCaballo = Integer.parseInt(scan.nextLine());
		caballero.setIdCaballo(idCaballo);
		
		return caballero;

	}
}
