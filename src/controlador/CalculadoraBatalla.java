package controlador;

import Modelo.Caballero;
import vista.*;

public class CalculadoraBatalla {

	public static void calculo(int daño1, int daño2, int defensa1, int defensa2,int habilidad1,int habilidad2) {

		int resultadoBatalla=(int) ((daño1+defensa1+habilidad1)*(Math.random()+1)-(daño2+defensa2+habilidad2)*(Math.random()+1));
		if(resultadoBatalla<0){
			System.out.println("Ha ganado caballero2");
		}else if(resultadoBatalla>0) {
			System.out.println("Ha ganado caballero1");
		}else{
			System.out.println("Empate");
		}
	}

	

}
