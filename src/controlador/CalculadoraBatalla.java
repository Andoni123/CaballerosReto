package controlador;

import java.sql.SQLException;
import java.util.Date;

import modelo.GestorBBDD;
import vista.*;

public class CalculadoraBatalla {

	public static void calculo(int daño1, int daño2, int defensa1, int defensa2, int habilidad1, int habilidad2,
			int idCaballero1, int idCaballero2) throws SQLException {

		int resultadoBatalla = (int) ((daño1 + defensa1 + habilidad1) * (Math.random() + 1)
				- (daño2 + defensa2 + habilidad2) * (Math.random() + 1));
		
		
		
		if (resultadoBatalla < 0) {
			GestorBBDD gestorBBDD = new GestorBBDD();

			CambioExperiencia.ModificarExperienciaEscudero2(idCaballero2);
			gestorBBDD.guardarResultado(idCaballero2,idCaballero1);

		} else if (resultadoBatalla > 0) {
			GestorBBDD gestorBBDD = new GestorBBDD();

			CambioExperiencia.ModificarExperienciaEscudero1(idCaballero1);
			gestorBBDD.guardarResultado(idCaballero1,idCaballero2);

		} else {
			System.out.println("Empate");
		}
	}

}
