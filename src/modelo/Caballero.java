package modelo;

public class Caballero {

	private int idCaballero;
	private int idEscudero;
	private int idArma;
	private int idEscudo;
	private String nombre;
	private int fuerzaLucha;
	private int habilidad;
	private int idCaballo;
	
	public int getIdCaballero() {
		return idCaballero;
	}
	public void setIdCaballero(int idCaballero) {
		this.idCaballero = idCaballero;
	}
	public int getIdEscudero() {
		return idEscudero;
	}
	public void setIdEscudero(int idEscudero) {
		this.idEscudero = idEscudero;
	}
	public int getIdArma() {
		return idArma;
	}
	public void setIdArma(int idArma) {
		this.idArma = idArma;
	}
	public int getIdEscudo() {
		return idEscudo;
	}
	public void setIdEscudo(int idEscudo) {
		this.idEscudo = idEscudo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerzaLucha() {
		return fuerzaLucha;
	}
	public void setFuerzaLucha(int fuerzaLucha) {
		this.fuerzaLucha = fuerzaLucha;
	}
	public int getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(int habilidad) {
		this.habilidad = habilidad;
	}
	public int getIdCaballo() {
		return idCaballo;
	}
	public void setIdCaballo(int idCaballo) {
		this.idCaballo = idCaballo;
	}
	@Override
	public String toString() {
		return "Caballero [idCaballero=" + idCaballero + ", idEscudero=" + idEscudero + ", idArma=" + idArma
				+ ", idEscudo=" + idEscudo + ", nombre=" + nombre + ", fuerzaLucha=" + fuerzaLucha + ", habilidad="
				+ habilidad + ", idCaballo=" + idCaballo + "]";
	}
}
