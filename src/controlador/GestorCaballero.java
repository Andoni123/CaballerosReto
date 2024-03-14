package controlador;

import java.util.Scanner;

import vista.Menu;

public class GestorCaballero {

	public static void run(Scanner scan) {
		
		 int option;
		 
		 do {
			 Menu.mostrarMenuCaballeros();
			 System.out.println("Introduzca la opcion");
			 option = Integer.parseInt(scan.nextLine());
			 
			 switch (option) {
			case Menu.INSERTAR_CABALLERO :
				
				break;
				
			case Menu.MOSTRAR_CABALLERO :
				break;
				
			case Menu.MOSTRAR_CABALLEROS :
				break;
				
			case Menu.MODIFICAR_CABALLERO :
				break;
				
			case Menu.ELIMINAR_CABALLERO :
				break;

			default:
				break;
			}
			 
		 }while (option!=0);
		 
		
		
	}
}
