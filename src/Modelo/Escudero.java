package Modelo;

public class Escudero {

	private int idEscudero;
	private String nombre;
	private int idCaballero;
	private int exp;
	
	//Getters y setters
	
	public int getIdEscudero() {
		return idEscudero;
	}
	public void setIdEscudero(int idEscudero) {
		this.idEscudero = idEscudero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdCaballero() {
		return idCaballero;
	}
	public void setIdCaballero(int idCaballero) {
		this.idCaballero = idCaballero;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Escudero [idEscudero=" + idEscudero + ", nombre=" + nombre + ", idCaballero=" + idCaballero + ", exp="
				+ exp + "]";
	}
}
