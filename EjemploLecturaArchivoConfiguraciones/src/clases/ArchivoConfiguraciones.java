package clases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ArchivoConfiguraciones {
	private Properties propiedades;
	public ArchivoConfiguraciones(){
		propiedades = new Properties();
		propiedades.setProperty("Propiedad1", "Valor1");
		propiedades.setProperty("Propiedad2", "Valor2");
		propiedades.setProperty("Propiedad3", "Valor3");
		propiedades.setProperty("Propiedad4", "Valor4");
		try {
			propiedades.store(new FileOutputStream("C:\\Prueba\\propiedades2.config"),"Estos son los comentarios");
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
