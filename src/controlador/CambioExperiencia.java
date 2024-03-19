package controlador;

import java.sql.SQLException;

import modelo.GestorBBDD;

public class CambioExperiencia {

	public static void ModificarExperienciaEscudero2(int idCaballero2) throws SQLException {
		int idCaballero = idCaballero2;
		System.out.println("Ha ganado caballero2");
		int exp = GestorBBDD.subirExperienciaEscudero(idCaballero);
		exp = exp + 50;
		int idEscudero = GestorBBDD.getIdEscudero(idCaballero);
		if (exp >= 350) {

			GestorBBDD.escuderoSube(idEscudero);

		} else {

			GestorBBDD.subirExperiencia(idEscudero);
		}
	}

	public static void ModificarExperienciaEscudero1(int idCaballero1) throws SQLException {
		int idCaballero = idCaballero1;
		System.out.println("Ha ganado caballero1");
		int exp = GestorBBDD.subirExperienciaEscudero(idCaballero);
		exp = exp + 50;
		int idEscudero = GestorBBDD.getIdEscudero(idCaballero);
		if (exp >= 350) {

			GestorBBDD.escuderoSube(idEscudero);
		} else {

			GestorBBDD.subirExperiencia(idEscudero);
		}
	}
}
