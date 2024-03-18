package controlador;

import Modelo.Caballero;
import vista.*;

public class CalculadoraBatalla {

	public static void calculo(int daño1, int daño2, int defensa1, int defensa2,int habilidad1,int habilidad2,int idCaballero1,int idCaballero2) {

		int resultadoBatalla=(int) ((daño1+defensa1+habilidad1)*(Math.random()+1)-(daño2+defensa2+habilidad2)*(Math.random()+1));
		if(resultadoBatalla<0){
			System.out.println("Ha ganado caballero2");
			int exp=GestorBBDD.subirExperienciaEscudero2(idCaballero2);
			exp=exp+50;
			if(exp>=350) {
				int idEscudero2=GestorBBDD.getIdEscudero(idCaballero2);
				GestorBBDD.escuderoSube(idEscudero2);
			}
			GestroBBDD.introducirExperiencia
		}else if(resultadoBatalla>0) {
			System.out.println("Ha ganado caballero1");
			int exp=GestorBBDD.subirExperienciaEscudero1(idCaballero1);

		}else{
			System.out.println("Empate");
		}
	}

	

}
