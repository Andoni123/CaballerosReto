package controlador;

import java.util.Scanner;

import Modelo.*;
import vista.*;

public class Batalla {
	public static void run(Scanner scan) {
		GestorBBDD gestorBBDD = new GestorBBDD();

		gestorBBDD.conectar();
		int idCaballero1 = Formulario.pedirIdCaballero(scan);
		int idCaballero2 = Formulario.pedirIdCaballero(scan);
		int habilidad1 = gestorBBDD.getHabilidadCaballero1(idCaballero1);
		int habilidad2 = gestorBBDD.getHabilidadCaballero2(idCaballero2);

		int daño1 = gestorBBDD.getDañoArma1(idCaballero1);
		int daño2 = gestorBBDD.getDañoArma2(idCaballero2);

		int defensa1 = gestorBBDD.getDañoEscudo1(idCaballero1);
		int defensa2 = gestorBBDD.getDañoEscudo2(idCaballero2);
		
		Caballero caballero1 = gestorBBDD.getCaballeroId(idCaballero1);
		Visor.mostrarCaballero(caballero1);
		
		System.out.println("VS");
		
		Caballero caballero2 = gestorBBDD.getCaballeroId(idCaballero1);
		Visor.mostrarCaballero(caballero2);

		CalculadoraBatalla.calculo(daño1, daño2, defensa1, defensa2, habilidad1, habilidad2);

		gestorBBDD.cerrar();
	}

}
