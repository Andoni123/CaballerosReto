package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.Caballero;

public class GestorBBDD extends Conector {

	public void insertarCaballero() {

		String sql = "INSERT INTO `caballeros`(`idCaballero`, `idEcudero`, `idArma`, `idEscudo`, `Nombre`, `FuerzaLucha`, `Habilidad`, `idCaballo`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]')";

	}

	public ArrayList<Caballero> getCaballeros() {

		ArrayList<Caballero> caballeros = new ArrayList<Caballero>();
		String sql = "SELECT * FROM caballeros";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Caballero caballero = new Caballero();

				rellenarCaballero(rs, caballero);

				caballeros.add(caballero);
			}
		} catch (SQLException e) {
			System.out.println("te revento ver caballeros maquina");
			e.printStackTrace();
		}

		return caballeros;
	}

	public Caballero getCapalleroId(int idCaballero) {

		Caballero caballero=new Caballero();
		String sql = "SELECT * FROM caballeros Where idCaballero = ?";

		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero);
			ResultSet rs = pst.executeQuery();
			rs.next();
			rellenarCaballero(rs, caballero);

			
		} catch (SQLException e) {
			System.out.println("te reventó ver caballeros maquina");
			e.printStackTrace();
		}

		return caballero;
	}

	private void rellenarCaballero(ResultSet rs, Caballero caballero) throws SQLException {
		caballero.setIdEscudero(rs.getInt("idEscudo"));
		caballero.setIdArma(rs.getInt("idArma"));
		caballero.setIdEscudo(rs.getInt("idEscudo"));
		caballero.setNombre(rs.getString("nombre"));
		caballero.setFuerzaLucha(rs.getInt("fuerzaLucha"));
		caballero.setHabilidad(rs.getInt("habilidad"));
		caballero.setIdCaballo(rs.getInt("idCaballo"));
	}

}
