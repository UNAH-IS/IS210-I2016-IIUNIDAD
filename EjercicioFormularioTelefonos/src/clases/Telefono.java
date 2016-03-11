package clases;

public class Telefono {
	private String marca;
	private String modelo;
	private String numero;
	private String imei;
	private String sistemaOperativo;
	private double precio;
	private int almacenamientoBytes;
	public Telefono(String marca, 
			String modelo, 
			String numero, 
			String imei,
			String sistemaOperativo, 
			double precio, 
			int almacenamientoBytes
	) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numero = numero;
		this.imei = imei;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
		this.almacenamientoBytes = almacenamientoBytes;
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
				+ ", almacenamientoBytes=" + almacenamientoBytes + "]";
	}
}
