package modelo;

public class Escudo {

	private int idEscudo;
	private int defensa;
	private int durabilidad;
	private String material;
	public int getIdEscudo() {
		return idEscudo;
	}
	public void setIdEscudo(int idEscudo) {
		this.idEscudo = idEscudo;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getDurabilidad() {
		return durabilidad;
	}
	public void setDurabilidad(int durabilidad) {
		this.durabilidad = durabilidad;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Escudo [idEscudo=" + idEscudo + ", defensa=" + defensa + ", durabilidad=" + durabilidad + ", material="
				+ material + "]";
	}
	
}
