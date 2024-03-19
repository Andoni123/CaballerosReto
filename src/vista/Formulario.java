package vista;

import java.util.Scanner;

import modelo.Arma;
import modelo.Caballero;
import modelo.Caballo;
import modelo.Escudero;
import modelo.Escudo;

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

	public static Escudo pedirDatosEscudo(Scanner scan) {

		Escudo escudo = new Escudo();

		System.out.println("Defensa del escudo");
		int defensa = Integer.parseInt(scan.nextLine());
		escudo.setDurabilidad(defensa);

		System.out.println("Durabilidad del escudo");
		int durabilidad = Integer.parseInt(scan.nextLine());
		escudo.setDurabilidad(durabilidad);

		System.out.println("Material del escudo");
		String material = scan.nextLine();
		escudo.setMaterial(material);

		return escudo;
	}

	public static int pedirIdEscudo(Scanner scan) {
		int idEscudo;

		System.out.println("Dame el id del escudo que quieres");
		idEscudo = Integer.parseInt(scan.nextLine());
		return idEscudo;

	}

	public static Escudero pedirDatosEscudero(Scanner scan) {
		Escudero escudero = new Escudero();

		System.out.println("Nombre del escudero");
		String nombre = scan.nextLine();
		escudero.setNombre(nombre);

		System.out.println("Caballero del escudero");
		int idCaballero = Integer.parseInt(scan.nextLine());
		escudero.setIdCaballero(idCaballero);

		System.out.println("Experiencia del escudero");
		int exp = Integer.parseInt(scan.nextLine());
		escudero.setExp(exp);

		return escudero;
	}

	public static int pedirIdEscudero(Scanner scan) {

		int idEscudero;

		System.out.println("Dame el id del escudero que quieres");
		idEscudero = Integer.parseInt(scan.nextLine());
		return idEscudero;

	}

	public static Caballo pedirDatosCaballo(Scanner scan) {
		Caballo caballo = new Caballo();

		System.out.println("Velocidad del caballo");
		int velocidad = Integer.parseInt(scan.nextLine());
		caballo.setVelocidad(velocidad);

		System.out.println("Caballero del caballo");
		int idCaballero = Integer.parseInt(scan.nextLine());
		caballo.setIdCaballero(idCaballero);

		System.out.println("Color del caballo");
		String color = scan.nextLine();
		caballo.setColor(color);

		return caballo;
	}

	public static int pedirIdCaballo(Scanner scan) {

		int idCaballo;

		System.out.println("Dame el id del caballo que quieres");
		idCaballo = Integer.parseInt(scan.nextLine());
		return idCaballo;

	}

}
