package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.*;

public class GestorBBDD extends Conector {

	public void insertarCaballero() {

		String sql = "INSERT INTO `caballeros`(`idCaballero`, `idEcudero`, `idArma`, `idEscudo`, `Nombre`, `FuerzaLucha`, `Habilidad`, `idCaballo`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]')";

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

	public Caballero getCaballeroId(int idCaballero) {

		Caballero caballero=new Caballero();
		String sql = "SELECT * FROM caballeros Where idCaballero = '?'";

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

	public static  Caballero modificarCaballero(Caballero caballero, int idCaballero) throws SQLException {
		
		String sql ="UPDATE caballeros SET idEscudero=?,idArma=?,idEscudo=?,nombre=?,fuerzaLucha=?,habilidad=?,idCaballo=? WHERE idCaballero=?";
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





	public int getDañoArma1(int idCaballero1) {
		String sql = "SELECT Daño FROM arma WHERE idArma =(SELECT  idArma FROM  caballeros WHERE idCaballero = '?') ";
		
		Arma arma = new Arma();
		int daño;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero1);

			ResultSet rs = pst.executeQuery();
			rs.next();
			daño=arma.setDaño(rs.getInt("Daño"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return daño;
	}
	public int getDañoArma2(int idCaballero2) {
		String sql = "SELECT Daño FROM arma WHERE idArma =(SELECT  idArma FROM  caballeros WHERE idCaballero = '?') ";
		
		Arma arma = new Arma();
		int daño;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			daño=arma.setDaño(rs.getInt("Daño"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return daño;
	}

	public int getDañoEscudo1(int idCaballero1) {
		String sql = "SELECT Defensa FROM escudo WHERE idEscudo =(SELECT  idEscudo FROM  caballeros WHERE idCaballero = '?') ";
		
		Escudo escudo = new Escudo();
		int defensa;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero1);

			ResultSet rs = pst.executeQuery();
			rs.next();
			defensa=Escudo.setDefensa(rs.getInt("Defensa"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return defensa;
	}
	public int getDañoEscudo2(int idCaballero2) {
		String sql = "SELECT Defensa FROM escudo WHERE idEscudo =(SELECT  idEscudo FROM  caballeros WHERE idCaballero = '?') ";
		
		Escudo escudo = new Escudo();
		int defensa;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			defensa=Escudo.setDefensa(rs.getInt("Defensa"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return defensa;
	}

	public int getHabilidadCaballero1(int idCaballero1) {
		String sql = "SELECT Habilidad FROM caballeros WHERE  idCaballero = '?') ";
		
		Caballero caballero = new Caballero();
		int habilidad;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero1);

			ResultSet rs = pst.executeQuery();
			rs.next();
			habilidad=caballero.setHabilidad(rs.getInt("Habilidad"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get Habilidad maquina");
			e.printStackTrace();
		}

		return habilidad;
		}
	public int getHabilidadCaballero2(int idCaballero2) {
		String sql = "SELECT Habilidad FROM caballeros WHERE  idCaballero = '?') ";
		
		Caballero caballero = new Caballero();
		int habilidad;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			habilidad=caballero.setHabilidad(rs.getInt("Habilidad"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get Habilidad maquina");
			e.printStackTrace();
		}

		return habilidad;
		}
	}


