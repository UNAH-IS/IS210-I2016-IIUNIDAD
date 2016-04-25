package ejemplo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class AbrurArchivo {
	private JFileChooser dialogo;
	public AbrurArchivo(){
		dialogo = new JFileChooser("C:\\Prueba");
		int resultado = dialogo.showOpenDialog(null);
		if (resultado == JFileChooser.APPROVE_OPTION){
			File archivo = dialogo.getSelectedFile();
			System.out.println(archivo.getAbsolutePath());
			System.out.println(archivo.getName());
			try {
				BufferedReader flujo = new BufferedReader(new FileReader(archivo));
				String linea;
				while((linea = flujo.readLine())!=null)
					System.out.println(linea);
				flujo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	public static void main(String[] args) {
		new AbrurArchivo();
	}

}
