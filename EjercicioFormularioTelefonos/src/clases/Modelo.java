package clases;

public class Modelo {
	private int codigoModelo;
	private String nombreModelo;
	private String abreviatura;
	
	public Modelo(int codigoModelo, String nombreModelo, String abreviatura) {
		super();
		this.codigoModelo = codigoModelo;
		this.nombreModelo = nombreModelo;
		this.abreviatura = abreviatura;
	}
	public int getCodigoModelo() {
		return codigoModelo;
	}
	public void setCodigoModelo(int codigoModelo) {
		this.codigoModelo = codigoModelo;
	}
	public String getNombreModelo() {
		return nombreModelo;
	}
	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	@Override
	public String toString() {
		return nombreModelo;
	}
}
