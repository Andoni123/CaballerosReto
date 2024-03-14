package Modelo;

public class Caballo {

	private int idCaballo;
	private int velocidad;
	private int idCaballero;
	private String color;
	public int getIdCaballo() {
		return idCaballo;
	}
	public void setIdCaballo(int idCaballo) {
		this.idCaballo = idCaballo;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getIdCaballero() {
		return idCaballero;
	}
	public void setIdCaballero(int idCaballero) {
		this.idCaballero = idCaballero;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Caballo [idCaballo=" + idCaballo + ", velocidad=" + velocidad + ", idCaballero=" + idCaballero
				+ ", color=" + color + "]";
	}
	
}
