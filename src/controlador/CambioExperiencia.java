package controlador;

import java.sql.SQLException;

<<<<<<< HEAD
import modelo.GestorBBDD;


=======
import modelo.*;
import vista.Visor;
>>>>>>> branch 'Andoni' of https://github.com/Andoni123/CaballerosReto.git

public class CambioExperiencia {

	public static void ModificarExperienciaEscudero2(int idCaballero2) throws SQLException {
		GestorBBDD gestorBBDD = new GestorBBDD();
		int idCaballero = idCaballero2;
		System.out.println("Ha ganado caballero2");
		Caballero caballero = gestorBBDD.getCaballeroId(idCaballero);
		int idEscudero = caballero.getIdEscudero();

<<<<<<< HEAD
			GestorBBDD.escuderoSube(idEscudero,exp);

=======
		if (idEscudero == 0) {
			System.out.println("la vida");
>>>>>>> branch 'Andoni' of https://github.com/Andoni123/CaballerosReto.git
		} else {
			int exp = GestorBBDD.subirExperienciaEscudero(idCaballero);
			exp = exp + 50;
			if (exp >= 350) {

				Escudero escudero = gestorBBDD.getEscuderoId(idEscudero);
				String nombre = escudero.getNombre();

				caballero.setNombre(nombre);
				caballero.setIdArma((int) (Math.random() * 5));
				caballero.setIdEscudo((int) (Math.random() * 5));
				caballero.setHabilidad((int) (Math.random() * 5));
				gestorBBDD.insertarCaballero(caballero);
				Visor.caballeroInsertado();
				gestorBBDD.eliminarEscudero(idEscudero);

			} else {

				idEscudero = GestorBBDD.getIdEscudero(idCaballero);
				GestorBBDD.subirExperiencia(idEscudero, exp);
			}
		}

	}

	public static void ModificarExperienciaEscudero1(int idCaballero1) throws SQLException {
		GestorBBDD gestorBBDD = new GestorBBDD();
		int idCaballero = idCaballero1;
		System.out.println("Ha ganado caballero1");
		Caballero caballero = gestorBBDD.getCaballeroId(idCaballero);
		int idEscudero = caballero.getIdEscudero();

<<<<<<< HEAD
			GestorBBDD.escuderoSube(idEscudero,exp);
=======
		if (idEscudero == 0) {
			System.out.println("la vida");
>>>>>>> branch 'Andoni' of https://github.com/Andoni123/CaballerosReto.git
		} else {
			int exp = GestorBBDD.subirExperienciaEscudero(idCaballero);
			exp = exp + 50;
			if (exp >= 350) {

				Escudero escudero = gestorBBDD.getEscuderoId(idEscudero);
				String nombre = escudero.getNombre();

				caballero.setNombre(nombre);
				caballero.setIdArma((int) (Math.random() * 5));
				caballero.setIdEscudo((int) (Math.random() * 5));
				caballero.setHabilidad((int) (Math.random() * 5));
				gestorBBDD.insertarCaballero(caballero);
				Visor.caballeroInsertado();
				gestorBBDD.eliminarEscudero(idEscudero);

			} else {

				idEscudero = GestorBBDD.getIdEscudero(idCaballero);
				GestorBBDD.subirExperiencia(idEscudero, exp);
			}
		}

	}
}
