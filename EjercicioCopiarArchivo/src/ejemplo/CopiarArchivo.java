package ejemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArchivo {
	private String archivoOrigen = "F:\\Teach UNAH\\Programacion II\\2016-I\\Repositorio de Ejercicios\\Unidad I\\IS210-I2016-IUNIDAD\\AnotacionesClase.txt";
	private String archivoDestino = "C:/Prueba/copia.txt";
	private FileReader flujoLectura;
	private BufferedReader br;
	private FileWriter flujoEscritura;
	private BufferedWriter bw;
	private String linea;
	public CopiarArchivo(){
		try {
			flujoLectura = new FileReader(archivoOrigen);
			br = new BufferedReader(flujoLectura);
			flujoEscritura = new FileWriter(archivoDestino);
			bw = new BufferedWriter(flujoEscritura);
			
			while((linea = br.readLine())!=null){
				System.out.println(linea);
				bw.write(linea);
				bw.newLine();
			}
			
			br.close();
			bw.close();
			flujoLectura.close();
			flujoEscritura.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	public static void main(String[] args) {
		new CopiarArchivo();
	}

}
