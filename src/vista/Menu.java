package vista;

public class Menu {

	public static final int GESTOR = 1;
	public static final int BATALLA = 2;
	public static final int MAS_INFORMACION = 3;

	public static final int INSERTAR_CABALLERO = 1;
	public static final int MOSTRAR_CABALLERO = 2;
	public static final int MOSTRAR_CABALLEROS = 3;
	public static final int MODIFICAR_CABALLERO = 4;
	public static final int ELIMINAR_CABALLERO = 5;

	

	public static void mostrarMenuPrincipal() {

		System.out.println("--Menu Principal--");
		System.out.println(GESTOR + "-Creacion");
		System.out.println(BATALLA + "-Batalla de caballeros");
		System.out.println(MAS_INFORMACION + "-Informacion adicional");
	}

	public static void mostrarMenuCaballeros() {

		System.out.println("--Menu Caballeros");
		System.out.println(INSERTAR_CABALLERO + "Insertar un caballero");
		System.out.println(MOSTRAR_CABALLERO + "Mostrar un caballero");
		System.out.println(MOSTRAR_CABALLEROS + "Mostrar todos los caballeros");
		System.out.println(MODIFICAR_CABALLERO + "Modificar caballero");
		System.out.println(ELIMINAR_CABALLERO + "Eliminar caballero");
	}
}
