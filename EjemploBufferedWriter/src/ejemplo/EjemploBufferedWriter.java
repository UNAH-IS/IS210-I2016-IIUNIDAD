package ejemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploBufferedWriter {
	private File archivo;
	private FileWriter flujo;
	private BufferedWriter bw;
	public EjemploBufferedWriter(){
		try {
			archivo = new File("C:/Prueba/HolaMundo.juan");
			flujo = new FileWriter(archivo);
			bw = new BufferedWriter(flujo);
			bw.write("Hola mundo");
			bw.newLine();
			bw.write("Otra linea");
			bw.close();
			flujo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EjemploBufferedWriter();
	}

}
