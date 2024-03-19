package modelo;

public class Arma {

	private int idArma;
	private int daño;
	private int durabilidad;
	private int velocidad;
	private String material;
	private String nombre;
	
	public int getIdArma() {
		return idArma;
	}
	public void setIdArma(int idArma) {
		this.idArma = idArma;
	}
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public int getDurabilidad() {
		return durabilidad;
	}
	public void setDurabilidad(int durabilidad) {
		this.durabilidad = durabilidad;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Arma [idArma=" + idArma + ", daño=" + daño + ", durabilidad=" + durabilidad + ", velocidad=" + velocidad
				+ ", material=" + material + ", nombre=" + nombre + "]";
	}
	
}
