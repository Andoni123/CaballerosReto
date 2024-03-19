package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controlador.Conector;

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

		Caballero caballero = new Caballero();
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

	public void insertarArma(Arma arma) {

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

	public void insertarEscudo(Escudo escudo) {

		String sql = "INSERT INTO `escudo`(`Defensa`, `Durabilidad`, `Material`) VALUES (?,?,?)";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sql);

			pst.setInt(1, escudo.getDefensa());
			pst.setInt(2, escudo.getDurabilidad());
			pst.setString(3, escudo.getMaterial());

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Escudo getEscudoId(int idEscudo) {

		Escudo escudo = new Escudo();
		String sql = "SELECT * FROM escudo Where idEscudo = ?";

		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idEscudo);
			ResultSet rs = pst.executeQuery();
			rs.next();
			rellenarEscudo(rs, escudo);

		} catch (SQLException e) {
			System.out.println("te reventó ver escudos maquina");
			e.printStackTrace();
		}

		return escudo;

	}

	private static void rellenarEscudo(ResultSet rs, Escudo escudo) throws SQLException {

		escudo.setIdEscudo(rs.getInt("idEscudo"));
		escudo.setDefensa(rs.getInt("defensa"));
		escudo.setDurabilidad(rs.getInt("durabilidad"));
		escudo.setMaterial(rs.getString("material"));

	}

	public static ArrayList<Escudo> getEscudos() {

		ArrayList<Escudo> escudos = new ArrayList<Escudo>();
		String sql = "SELECT * FROM escudo";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Escudo escudo = new Escudo();

				rellenarEscudo(rs, escudo);

				escudos.add(escudo);
			}
		} catch (SQLException e) {
			System.out.println("te revento ver escudos maquina");
			e.printStackTrace();
		}

		return escudos;

	}

	public static Escudo modificarEscudo(Escudo escudo, int idEscudo) throws SQLException {

		String sql = "UPDATE escudo SET Defensa=?,Durabilidad=?,Material=? WHERE idEscudo=?";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setInt(1, escudo.getDefensa());
			pst.setInt(2, escudo.getDurabilidad());
			pst.setString(3, escudo.getMaterial());
			pst.setInt(4, idEscudo);

			pst.execute();

		} catch (SQLException e) {
			System.out.println("Peto en modificarEscudo");
			e.printStackTrace();
		}

		return escudo;

	}

	public void eliminarEscudo(int idEscudo) {

		String sentenciaSql = "DELETE FROM `escudo` WHERE idEscudo = ?";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sentenciaSql);

			pst.setInt(1, idEscudo);

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertarEscudero(Escudero escudero) {

		String sql = "INSERT INTO `escudero`(`nombre`, `idCaballero`, `exp`) VALUES (?,?,?)";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sql);

			pst.setString(1, escudero.getNombre());
			pst.setInt(2, escudero.getIdCaballero());
			pst.setInt(3, escudero.getExp());

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Escudero getEscuderoId(int idEscudero) {

		Escudero escudero = new Escudero();
		String sql = "SELECT * FROM escudero Where idEscudero = ?";

		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idEscudero);
			ResultSet rs = pst.executeQuery();
			rs.next();
			rellenarEscudero(rs, escudero);

		} catch (SQLException e) {
			System.out.println("te reventó ver escuderos maquina");
			e.printStackTrace();
		}

		return escudero;

	}

	private static void rellenarEscudero(ResultSet rs, Escudero escudero) throws SQLException {

		escudero.setIdEscudero(rs.getInt("idEscudero"));
		escudero.setNombre(rs.getString("nombre"));
		escudero.setIdCaballero(rs.getInt("idCaballero"));
		escudero.setExp(rs.getInt("exp"));

	}

	public static ArrayList<Escudero> getEscuderos() {

		ArrayList<Escudero> escuderos = new ArrayList<Escudero>();
		String sql = "SELECT * FROM escudero";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Escudero escudero = new Escudero();

				rellenarEscudero(rs, escudero);

				escuderos.add(escudero);
			}
		} catch (SQLException e) {
			System.out.println("te revento ver escuderos maquina");
			e.printStackTrace();
		}

		return escuderos;

	}

	public static Escudero modificarEscudero(Escudero escudero, int idEscudero) throws SQLException {

		String sql = "UPDATE escudero SET nombre=?,idCaballero=?,exp=? WHERE idEscudero=?";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setString(1, escudero.getNombre());
			pst.setInt(2, escudero.getIdCaballero());
			pst.setInt(3, escudero.getExp());
			pst.setInt(4, idEscudero);

			pst.execute();

		} catch (SQLException e) {
			System.out.println("Peto en modificarEscudo");
			e.printStackTrace();
		}

		return escudero;

	}

	public void eliminarEscudero(int idEscudero) {

		String sentenciaSql = "DELETE FROM `escudero` WHERE idEscudero = ?";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sentenciaSql);

			pst.setInt(1, idEscudero);

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertarCaballo(Caballo caballo) {

		String sql = "INSERT INTO `caballo`(`Velocidad`, `idCaballero`, `Color`) VALUES (?,?,?)";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sql);

			pst.setInt(1, caballo.getVelocidad());
			pst.setInt(2, caballo.getIdCaballero());
			pst.setString(3, caballo.getColor());

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Caballo> getCaballos() {

		ArrayList<Caballo> caballos = new ArrayList<Caballo>();
		String sql = "SELECT * FROM caballo";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Caballo caballo = new Caballo();

				rellenarCaballo(rs, caballo);

				caballos.add(caballo);
			}
		} catch (SQLException e) {
			System.out.println("te revento ver caballeros maquina");
			e.printStackTrace();
		}

		return caballos;
	}

	public Caballo getCaballoId(int idCaballo) {

		Caballo caballo = new Caballo();
		String sql = "SELECT * FROM caballo Where idCaballo = ?";

		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballo);
			ResultSet rs = pst.executeQuery();
			rs.next();
			rellenarCaballo(rs, caballo);

		} catch (SQLException e) {
			System.out.println("te reventó ver caballeros maquina");
			e.printStackTrace();
		}

		return caballo;
	}

	private static void rellenarCaballo(ResultSet rs, Caballo caballo) throws SQLException {

		caballo.setIdCaballo(rs.getInt("idCaballo"));
		caballo.setVelocidad(rs.getInt("velocidad"));
		caballo.setIdCaballero(rs.getInt("idCaballero"));
		caballo.setColor(rs.getString("color"));
	}

	public static Caballo modificarCaballo(Caballo caballo, int idCaballo) throws SQLException {

		String sql = "UPDATE caballo SET velocidad=?,idCaballo=?,color=? WHERE idCaballo=?";
		PreparedStatement pst = con.prepareStatement(sql);

		try {
			pst.setInt(1, caballo.getVelocidad());
			pst.setInt(2, caballo.getIdCaballero());
			pst.setString(3, caballo.getColor());
			pst.setInt(4, idCaballo);

			pst.execute();

		} catch (SQLException e) {
			System.out.println("Peto en modificarCaballero");
			e.printStackTrace();
		}

		return caballo;

	}

	public void eliminarCaballo(int idCaballo) {

		String sentenciaSql = "DELETE FROM `caballo` WHERE idCaballo = ?";

		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sentenciaSql);

			pst.setInt(1, idCaballo);

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getDañoArma1(int idCaballero1) {
		String sql = "SELECT Daño FROM arma WHERE idArma =(SELECT  idArma FROM  caballeros WHERE idCaballero = ?)";

		Arma arma = new Arma();
		int daño = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero1);

			ResultSet rs = pst.executeQuery();
			rs.next();

			daño = rs.getInt("daño");

		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return daño;
	}

	public int getDañoArma2(int idCaballero2) {
		String sql = "SELECT Daño FROM arma WHERE idArma =(SELECT  idArma FROM  caballeros WHERE idCaballero = ?) ";

		Arma arma = new Arma();
		int daño = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			daño = rs.getInt("daño");

		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return daño;
	}

	public int getDañoEscudo1(int idCaballero1) {
		String sql = "SELECT Defensa FROM escudo WHERE idEscudo =(SELECT  idEscudo FROM  caballeros WHERE idCaballero = ?) ";

		Escudo escudo = new Escudo();
		int defensa = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero1);

			ResultSet rs = pst.executeQuery();
			rs.next();
			defensa = (rs.getInt("Defensa"));

		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return defensa;
	}

	public int getDañoEscudo2(int idCaballero2) {
		String sql = "SELECT Defensa FROM escudo WHERE idEscudo =(SELECT  idEscudo FROM  caballeros WHERE idCaballero = ?) ";

		Escudo escudo = new Escudo();
		int defensa = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			defensa = (rs.getInt("Defensa"));

		} catch (SQLException e) {
			System.out.println("te reventó get defensa maquina");
			e.printStackTrace();
		}

		return defensa;
	}

	public int getHabilidadCaballero1(int idCaballero1) {
		String sql = "SELECT Habilidad FROM caballeros WHERE  idCaballero = ? ";

		Caballero caballero = new Caballero();
		int habilidad = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero1);

			ResultSet rs = pst.executeQuery();
			rs.next();
			habilidad = (rs.getInt("Habilidad"));

		} catch (SQLException e) {
			System.out.println("te reventó get Habilidad maquina");
			e.printStackTrace();
		}

		return habilidad;
	}

	public int getHabilidadCaballero2(int idCaballero2) {
		String sql = "SELECT Habilidad FROM caballeros WHERE  idCaballero = ? ";

		Caballero caballero = new Caballero();
		int habilidad = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero2);

			ResultSet rs = pst.executeQuery();
			rs.next();
			habilidad = (rs.getInt("Habilidad"));

		} catch (SQLException e) {
			System.out.println("te reventó get Habilidad maquina");
			e.printStackTrace();
		}

		return habilidad;
	}

	public static int subirExperienciaEscudero(int idCaballero) {

		String sql = "SELECT exp FROM escudero WHERE  idCaballero = ? ";
		Escudero escudero = new Escudero();
		int exp = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero);

			ResultSet rs = pst.executeQuery();
			rs.next();
			exp = (rs.getInt("exp"));

		} catch (SQLException e) {
			System.out.println("te reventó get Habilidad maquina");
			e.printStackTrace();
		}

		return exp;
	}

	public static Escudero subirExperiencia(int idEscudero2) throws SQLException {

		String sql = "UPDATE escudero SET exp=? WHERE idEscudero=?";
		PreparedStatement pst = con.prepareStatement(sql);
		Escudero escudero = new Escudero();
		try {

			pst.setInt(1, escudero.getExp());
			pst.setInt(2, idEscudero2);

			pst.execute();

		} catch (SQLException e) {
			System.out.println("Peto en modificarEscudo");
			e.printStackTrace();
		}

		return escudero;

	}

	public static int escuderoSube(int idEscudero) {

		String sql = "INSERT INTO  caballeros (Nombre)SELECT nombre FROM escudero WHERE idEscudero= ? ";
		Escudero escudero = new Escudero();
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idEscudero);

			ResultSet rs = pst.executeQuery();
			rs.next();
			idEscudero = (rs.getInt("idEscudero"));

		} catch (SQLException e) {
			System.out.println("te reventó get idEscudero maquina");
			e.printStackTrace();
		}

		return idEscudero;
	}

	public static int getIdEscudero(int idCaballero) {
		String sql = "SELECT idEscudero FROM caballeros WHERE  idCaballero = ? ";

		Caballero caballero = new Caballero();
		int idEscudero = 0;
		try {

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, idCaballero);

			ResultSet rs = pst.executeQuery();
			rs.next();
			idEscudero = (rs.getInt("idEscudero"));

		} catch (SQLException e) {
			System.out.println("te reventó get idEscudero maquina");
			e.printStackTrace();
		}

		return idEscudero;

	}

	public static void guardarResultado( int idCaballeroGanador, int idCaballeroPerdedor) {

		String sql = "INSERT INTO `combate`(`fecha`, `idCaballeroGanador`, `idCaballeroPerdedor`) VALUES (?,?,?)";
		Combate combate = new Combate();
		PreparedStatement pst;

		try {

			pst = con.prepareStatement(sql);

			
			
			pst.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
			pst.setInt(2, idCaballeroGanador);
			pst.setInt(3, idCaballeroPerdedor);

			pst.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
