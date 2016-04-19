package clases;

import java.io.Serializable;

public class Computadora implements Serializable{
	private String marca;
	private String modelo;
	private String resolucion;
	private int capacidadDisco;
	private int capacidadMemoria;
	
	public Computadora(String marca, String modelo, String resolucion,
			int capacidadDisco, int capacidadMemoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.resolucion = resolucion;
		this.capacidadDisco = capacidadDisco;
		this.capacidadMemoria = capacidadMemoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public int getCapacidadDisco() {
		return capacidadDisco;
	}
	public void setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}
	public int getCapacidadMemoria() {
		return capacidadMemoria;
	}
	public void setCapacidadMemoria(int capacidadMemoria) {
		this.capacidadMemoria = capacidadMemoria;
	}
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo
				+ ", resolucion=" + resolucion + ", capacidadDisco="
				+ capacidadDisco + ", capacidadMemoria=" + capacidadMemoria
				+ "]";
	}
}
