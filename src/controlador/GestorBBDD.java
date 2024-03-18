package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.*;


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
		caballero.setIdCaballero(rs.getInt("idCaballero"));
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
	
	public void insertarArma (Arma arma) {
		
		String sql = "INSERT INTO `arma`(`Daño`, `Durabilidad`, `Velocidad`, `Material`, `Nombre`) VALUES (?,?,?,?,?)";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sql);

			pst.setInt(1, arma.getDaño());
			pst.setInt(2, arma.getDurabilidad());
			pst.setInt(3, arma.getVelocidad());
			pst.setString(4, arma.getMaterial());
			pst.setString(5, arma.getNombre());
			

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Arma getArmaId(int idArma) {
		
		Arma arma = new Arma();
		String sql = "SELECT * FROM arma Where idArma = ?";

		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idArma);
			ResultSet rs = pst.executeQuery();
			rs.next();
			rellenarArma(rs, arma);

		} catch (SQLException e) {
			System.out.println("te reventó ver armas maquina");
			e.printStackTrace();
		}

		return arma;
		
	}
	
	private static void rellenarArma(ResultSet rs, Arma arma) throws SQLException {
		arma.setIdArma(rs.getInt("idArma"));
		arma.setDaño(rs.getInt("Daño"));
		arma.setDurabilidad(rs.getInt("Durabilidad"));
		arma.setVelocidad(rs.getInt("Velocidad"));
		arma.setMaterial(rs.getString("Material"));
		arma.setNombre(rs.getString("Nombre"));
	
	}

	public static ArrayList<Arma> getArmas() {
		
		ArrayList<Arma> armas = new ArrayList<Arma>();
		String sql = "SELECT * FROM arma";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Arma arma = new Arma();

				rellenarArma(rs, arma);

				armas.add(arma);
			}
		} catch (SQLException e) {
			System.out.println("te revento ver caballeros maquina");
			e.printStackTrace();
		}

		return armas;
		
	}

	public static Arma modificarArma(Arma arma, int idArma) throws SQLException {
		
		String sql = "UPDATE arma SET Daño=?,Durabilidad=?,Velocidad=?,Material=?,Nombre=? WHERE idArma=?";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setInt(1, arma.getDaño());
			pst.setInt(2, arma.getDurabilidad());
			pst.setInt(3, arma.getVelocidad());
			pst.setString(4, arma.getMaterial());
			pst.setString(5, arma.getNombre());
			pst.setInt(6, idArma);

			pst.execute();

		} catch (SQLException e) {
			System.out.println("Peto en modificarCaballero");
			e.printStackTrace();
		}

		return arma;
		
	}

	public void eliminarArma(int idArma) {
		
		String sentenciaSql = "DELETE FROM `arma` WHERE idArma = ?";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sentenciaSql);
			
			pst.setInt(1, idArma);

			pst.execute();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public static void subirExperienciaEscudero2(int idCaballero2) {

		String sql = "SELECT exp FROM escudero WHERE  idCaballero = '?') ";
		Escudero escudero= new Escudero();
		int exp;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			exp=Escudero.setExp(rs.getInt("exp"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get Habilidad maquina");
			e.printStackTrace();
		}

		return exp;
		}
	

	public static void subirExperienciaEscudero1(int idCaballero1) {

		
	}

	public static void escuderoSube(int idEscudero2) {

		String sql="INSERT INTO  caballeros (Nombre)SELECT nombre FROM escudero WHERE idEscudero= '?' ";
		Escudero escudero= new Escudero();
		int idEscudero;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idEscudero);

			ResultSet rs = pst.executeQuery();
			rs.next();
			idEscudero=caballero.setIdEscudero(rs.getInt("idEscudero"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get idEscudero maquina");
			e.printStackTrace();
		}

		return idEscudero;
	}

	public static void getIdEscudero(int idCaballero2) {
		String sql = "SELECT idEscudero FROM caballeros WHERE  idCaballero = '?') ";
		
		Caballero caballero = new Caballero();
		int idEscudero;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			idEscudero=caballero.setIdEscudero(rs.getInt("idEscudero"));
			
		} catch (SQLException e) {
			System.out.println("te reventó get idEscudero maquina");
			e.printStackTrace();
		}

		return idEscudero;
		
	}
	}


