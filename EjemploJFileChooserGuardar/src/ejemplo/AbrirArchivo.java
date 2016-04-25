package ejemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class AbrirArchivo {
	private JFileChooser dialogo;
	public AbrirArchivo(){
		dialogo = new JFileChooser("C:\\Prueba");
		int resultado = dialogo.showSaveDialog(null);
		if (resultado == JFileChooser.APPROVE_OPTION){
			File archivo = dialogo.getSelectedFile();
			System.out.println(archivo.getAbsolutePath());
			System.out.println(archivo.getName());
			try {
				BufferedWriter flujo = new BufferedWriter(new FileWriter(archivo));
				flujo.write("Hola esta es una linea");
				flujo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	public static void main(String[] args) {
		new AbrirArchivo();
	}

}
