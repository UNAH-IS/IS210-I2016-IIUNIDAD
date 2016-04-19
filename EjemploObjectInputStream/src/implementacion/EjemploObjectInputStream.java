package implementacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import clases.Computadora;

public class EjemploObjectInputStream {
	private ObjectInputStream ois;
	private boolean finArchivo=false;
	public EjemploObjectInputStream(){
		try {
			ois = new ObjectInputStream(new FileInputStream("C:\\Prueba\\computadoras.dat"));
			while (!finArchivo){
				try{
					Computadora c = (Computadora)ois.readObject();
					System.out.println("Marca computadora: " + c.getMarca());
				}catch (EOFException e){
					finArchivo = true;
					System.out.println("Fin del archivo");
				}
			}
			
			//ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EjemploObjectInputStream();
	}

}
