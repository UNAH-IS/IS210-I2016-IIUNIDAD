package clases;

import java.util.ArrayList;

public class Telefono {
	private Marca marca; //Composicion
	private Modelo modelo;
	private String numero;
	private String imei;
	private String sistemaOperativo;
	private double precio;
	private int almacenamientoBytes;
	private ArrayList<String> operadores=new ArrayList<String>();
	public Telefono(Marca marca, 
			Modelo modelo, 
			String numero, 
			String imei,
			String sistemaOperativo, 
			double precio, 
			int almacenamientoBytes
	) {
		this.marca = marca;
		this.modelo = modelo;
		this.numero = numero;
		this.imei = imei;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
		this.almacenamientoBytes = almacenamientoBytes;
	}
	public void agregarOperador(String operador){
		operadores.add(operador);
	}
		
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getAlmacenamientoBytes() {
		return almacenamientoBytes;
	}
	public void setAlmacenamientoBytes(int almacenamientoBytes) {
		this.almacenamientoBytes = almacenamientoBytes;
	}
	@Override
	public String toString() {
		return "Telefono [marca=" + marca + ", modelo=" + modelo + ", numero="
				+ numero + ", imei=" + imei + ", sistemaOperativo="
				+ sistemaOperativo + ", precio=" + precio
				+ ", almacenamientoBytes=" + almacenamientoBytes + "]"+
				operadores;
	}
}
