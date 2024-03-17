package vista;

public class Menu {

	public static final int GESTOR =1;
	public static final int BATALLA = 2;
	public static final int MAS_INFORMACION = 3;
	public static final int SALIR = 4;
	
	public static final int GESTIONAR_CABALLEROS = 1;
	public static final int GESTIONAR_ARMAS = 2;
	public static final int GESTIONAR_ESCUDOS = 3;
	public static final int GESTIONAR_ESCUDEROS = 4;
	public static final int GESTIONAR_CABALLOS = 5;
	public static final int SALIR_CRUD = 6;
	

	public static final int INSERTAR = 1;
	public static final int MOSTRAR_UNO= 2;
	public static final int MOSTRAR_VARIOS = 3;
	public static final int MODIFICAR = 4;
	public static final int ELIMINAR = 5;
	public static final int SALIR_MENU = 6;

	

	public static void mostrarMenuPrincipal() {

		System.out.println("--Menu Principal--");
		System.out.println(GESTOR + "-Gestor");
		System.out.println(BATALLA + "-Batalla de caballeros");
		System.out.println(MAS_INFORMACION + "-Informacion adicional");
	}
	
	public static void mostrarMenuCrud() {
		System.out.println("--Menu Crud--");
		System.out.println(GESTIONAR_CABALLEROS + "-Gestionar caballeros");
		System.out.println(GESTIONAR_ARMAS + "-Gestionar armas");
		System.out.println(GESTIONAR_ESCUDOS + "-Gestionar escudos");
		System.out.println(GESTIONAR_ESCUDEROS + "-Gestionar escuderos");
		System.out.println(GESTIONAR_CABALLOS + "-Gestionar caballos");
		System.out.println(SALIR_CRUD + "-Salir");
		
	}
	

	public static void mostrarMenuCaballeros() {

		System.out.println("--Menu Caballeros");
		System.out.println(INSERTAR + "-Insertar un caballero");
		System.out.println(MOSTRAR_UNO + "-Mostrar un caballero");
		System.out.println(MOSTRAR_VARIOS + "-Mostrar todos los caballeros");
		System.out.println(MODIFICAR + "-Modificar caballero");
		System.out.println(ELIMINAR + "-Eliminar caballero");
		System.out.println(SALIR_MENU + "-Salir");
	}
	
	public static void mostrarMenuArmas() {

		System.out.println("--Menu Armas");
		System.out.println(INSERTAR + "-Insertar un arma");
		System.out.println(MOSTRAR_UNO + "-Mostrar un arma");
		System.out.println(MOSTRAR_VARIOS + "-Mostrar todas las armas");
		System.out.println(MODIFICAR + "-Modificar arma");
		System.out.println(ELIMINAR + "-Eliminar arma");
		System.out.println(SALIR_MENU + "-Salir");
	}

	public static void mostrarMenuEscudos() {
		
		System.out.println("--Menu Escudos");
		System.out.println(INSERTAR + "-Insertar un escudo");
		System.out.println(MOSTRAR_UNO + "-Mostrar un escudo");
		System.out.println(MOSTRAR_VARIOS + "-Mostrar todas los escudos");
		System.out.println(MODIFICAR + "-Modificar escudo");
		System.out.println(ELIMINAR + "-Eliminar escudo");
		System.out.println(SALIR_MENU + "-Salir");
	}

	public static void mostrarMenuEscuderos() {
		
		System.out.println("--Menu Escuderos");
		System.out.println(INSERTAR + "-Insertar un escudero");
		System.out.println(MOSTRAR_UNO + "-Mostrar un escudero");
		System.out.println(MOSTRAR_VARIOS + "-Mostrar todas los escuderos");
		System.out.println(MODIFICAR + "-Modificar escudero");
		System.out.println(ELIMINAR + "-Eliminar escudero");
		System.out.println(SALIR_MENU + "-Salir");
	}
}
