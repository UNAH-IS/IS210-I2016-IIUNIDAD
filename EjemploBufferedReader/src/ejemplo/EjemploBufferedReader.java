package ejemplo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBufferedReader {
	private File archivo;
	private FileReader flujo;
	private BufferedReader bf;
	private String linea;
	public EjemploBufferedReader(){
		try {
			archivo = new File("C:/Prueba/HolaMundo.java");
			flujo = new FileReader(archivo);
			bf = new BufferedReader(flujo);
			while ((linea = bf.readLine())!=null){
				System.out.println(linea);
			}
			flujo.close();
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EjemploBufferedReader();
	}

}
