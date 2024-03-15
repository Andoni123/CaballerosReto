package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

	public static ArrayList<Caballero> getCaballeros() {

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

		Caballero caballero = new Caballero();
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

	private static void rellenarCaballero(ResultSet rs, Caballero caballero) throws SQLException {
		caballero.setIdEscudero(rs.getInt("idEscudo"));
		caballero.setIdArma(rs.getInt("idArma"));
		caballero.setIdEscudo(rs.getInt("idEscudo"));
		caballero.setNombre(rs.getString("nombre"));
		caballero.setFuerzaLucha(rs.getInt("fuerzaLucha"));
		caballero.setHabilidad(rs.getInt("habilidad"));
		caballero.setIdCaballo(rs.getInt("idCaballo"));
	}

	public static Caballero modificarCaballero(Caballero caballero, int idCaballero) throws SQLException {

		String sql = "UPDATE caballeros SET idEscudero=?,idArma=?,idEscudo=?,nombre=?,fuerzaLucha=?,habilidad=?,idCaballo=? WHERE idCaballero=?";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setInt(1, caballero.getIdEscudero());
			pst.setInt(2, caballero.getIdArma());
			pst.setInt(3, caballero.getIdEscudo());
			pst.setString(4, caballero.getNombre());
			pst.setInt(5, caballero.getFuerzaLucha());
			pst.setInt(6, caballero.getHabilidad());
			pst.setInt(7, caballero.getIdCaballo());
			pst.setInt(8, idCaballero);

			pst.execute();

		} catch (SQLException e) {
			System.out.println("Peto en modificarCaballero");
			e.printStackTrace();
		}

		return caballero;

	}

	public void eliminarCaballero(int idCaballero) {

		String sentenciaSql = "DELETE FROM `caballeros` WHERE idCaballero = ?";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sentenciaSql);
			
			pst.setInt(1, idCaballero);

			pst.execute();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
