package controlador;

public class GestorBBDD extends Conector {

	public void insertarCaballero() {
		
		String sql = "INSERT INTO `caballeros`(`idCaballero`, `idEcudero`, `idArma`, `idEscudo`, `Nombre`, `FuerzaLucha`, `Habilidad`, `idCaballo`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]')";
		
	}

}
