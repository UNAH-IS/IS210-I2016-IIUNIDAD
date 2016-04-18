package ejemplo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploBufferedOutputStream {
	private BufferedOutputStream bos;
	public EjemploBufferedOutputStream(){
		try {
			bos = new BufferedOutputStream(new FileOutputStream(new File("C:\\Prueba\\HolaMundo.txt")));
			String frase = "Hola mundo";
			bos.write(frase.getBytes());
			bos.write((int)'\n');
			//bos.write(13);
			bos.write(("Que ondas").getBytes());
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EjemploBufferedOutputStream();
	}

}
