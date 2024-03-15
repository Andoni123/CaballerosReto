package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.Caballero;

public class GestorBBDD extends Conector {

	public void insertarCaballero() {
		
		String sql = "INSERT INTO `caballeros`(`idCaballero`, `idEcudero`, `idArma`, `idEscudo`, `Nombre`, `FuerzaLucha`, `Habilidad`, `idCaballo`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]')";
		
	}

	public  ArrayList<Caballero> getCaballeros() {
		
		ArrayList <Caballero> caballeros=new ArrayList<Caballero>();
		 String sql = "SELECT * FROM caballeros";
		 
		 try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);

				while (rs.next()) {
					Caballero caballero = new Caballero() ;

					rellenarCaballero(rs, caballero);

					caballeros.add(caballero);
				}
			} catch (SQLException e) {
				System.out.println("te revento ver caballeros maquina");
				e.printStackTrace();
			}

			return caballeros;
	}

	public ArrayList <Caballero> getCapalleroId(int idCaballero) {
		
		ArrayList <Caballero> caballeros=new ArrayList<Caballero>();
		 String sql = "SELECT * FROM caballeros Where idCaballero = ?";
		 
		 try {
			 /*
			  * PreparedStattemen pst = con.PrepareStatement(sql)
			  * pst.setInt(1,idCaballero)
			  * ResusltSet rs = pst.executequery.
			  */
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);

				while (rs.next()) {
					Caballero caballero = new Caballero() ;

					rellenarCaballero(rs, caballero);

					caballeros.add(caballero);
				}
			} catch (SQLException e) {
				System.out.println("te revento ver caballeros maquina");
				e.printStackTrace();
			}

			return caballeros;
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
