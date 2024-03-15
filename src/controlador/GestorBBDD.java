package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modelo.Caballero;

public class GestorBBDD extends Conector {

	public void insertarCaballero(Caballero caballero) {
		
		String sql = "INSERT INTO `caballeros`(`idEscudero`, `idArma`, `idEscudo`, `Nombre`, `FuerzaLucha`, `Habilidad`, `idCaballo`) VALUES (?,?,?,?,?,?,?)";
		
		PreparedStatement pst;
		
		try {

			pst = con.prepareStatement(sql);

			pst.setInt(1, caballero.getIdEscudero());
			pst.setInt(2, caballero.getIdArma());
			pst.setInt(3, caballero.getIdArma());
			pst.setString(4, caballero.getNombre());
			pst.setInt(5, caballero.getFuerzaLucha());
			pst.setInt(6, caballero.getHabilidad());
			pst.setInt(7, caballero.getIdCaballo());
			
			pst.execute();
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
