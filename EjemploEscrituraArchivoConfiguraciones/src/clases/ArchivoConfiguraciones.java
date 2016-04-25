package clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ArchivoConfiguraciones {
	private Properties propiedades;
	public ArchivoConfiguraciones(){
		propiedades = new Properties();
		try {
			propiedades.load(new FileInputStream("C:\\Prueba\\propiedades.config"));
			System.out.println(propiedades.getProperty("VIDAS"));
			System.out.println(propiedades.getProperty("PUNTUACION_MAXIMA"));
			System.out.println(propiedades.getProperty("USUARIO_DEFECTO"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ArchivoConfiguraciones();
	}

}