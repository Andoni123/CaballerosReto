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

	public static int pedirIdCaballero(Scanner scan) {
		int idCaballero;

		System.out.println("Dame el id del caballero que quieres ");
		idCaballero = Integer.parseInt(scan.nextLine());
		return idCaballero;
	}

	public static Arma pedirDatosArma(Scanner scan) {

		Arma arma = new Arma();

		System.out.println("Nombre del arma");
		String nombre = scan.nextLine();
		arma.setNombre(nombre);

		System.out.println("Material del arma");
		String material = scan.nextLine();
		arma.setMaterial(material);

		System.out.println("Daño del arma");
		int daño = Integer.parseInt(scan.nextLine());
		arma.setDaño(daño);

		System.out.println("Durabilidad del arma");
		int durabilidad = Integer.parseInt(scan.nextLine());
		arma.setDurabilidad(durabilidad);

		System.out.println("Velocidad del arma");
		int velocidad = Integer.parseInt(scan.nextLine());
		arma.setVelocidad(velocidad);

		return arma;
	}

	public static int pedirIdArma(Scanner scan) {
		int idArma;
		
		System.out.println("Dame el id del arma que quieres");
		idArma = Integer.parseInt(scan.nextLine());
		return idArma;
		
	}


}
