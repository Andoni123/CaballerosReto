package Modelo;

import java.util.Date;

public class Combate {

	private int id;
	private Date fecha;
	private int idCaballeroGanador;
	private int idCaballeroPerdedor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdCaballeroGanador() {
		return idCaballeroGanador;
	}
	public void setIdCaballeroGanador(int idCaballeroGanador) {
		this.idCaballeroGanador = idCaballeroGanador;
	}
	public int getIdCaballeroPerdedor() {
		return idCaballeroPerdedor;
	}
	public void setIdCaballeroPerdedor(int idCaballeroPerdedor) {
		this.idCaballeroPerdedor = idCaballeroPerdedor;
	}
	@Override
	public String toString() {
		return "Combate [id=" + id + ", fecha=" + fecha + ", idCaballeroGanador=" + idCaballeroGanador
				+ ", idCaballeroPerdedor=" + idCaballeroPerdedor + "]";
	}
}
