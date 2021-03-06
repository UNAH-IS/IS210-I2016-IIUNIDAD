package ejemplo;

import java.io.File; 
import java.io.IOException;
import java.text.SimpleDateFormat;
//i: Input (entrada=>Lectura), o: Output(salida=>escritura)

public class EjemploFile {
	private File flujo;
	private File flujo2;
	private File flujo3;
	public EjemploFile(){
		//La clase File se utiliza para archivos o directorios
		flujo = new File("HolaMundo.txt");
		if(flujo.exists())
			System.out.println("El archivo/directorio existe");
		else{
			System.out.println("El archivo/directorio NO existe");
			try {
				if(flujo.createNewFile())
					System.out.println("Archivo creado correctamente");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Tama�o del archivo/directorio:"+flujo.length());
		System.out.println("Ruta absoluta: "+flujo.getAbsolutePath());
		System.out.println("Nombre archivo/directorio: "+flujo.getName());
		//System.out.println("Padre: "+flujo.getParent());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Ultima fecha de modificacion: " + 
				sdf.format(flujo.lastModified()));
		System.out.println("Es un archivo?: "+flujo.isFile());
		System.out.println("Es un directorio?: "+flujo.isDirectory());
		System.out.println("Se puede escribir?: "+flujo.canWrite());
		System.out.println("Se puede leer?: "+flujo.canRead());
		
		flujo2 = new File("directorioX");
		if(flujo2.exists())
			System.out.println("El archivo/directorio existe");
		else{
			System.out.println("El archivo/directorio NO existe");
			if(flujo2.mkdir())
				System.out.println("Directorio creado correctamente");
		}
		
		
		flujo3 = new File("C:\\Prueba\\NuevoArchivo.java");
		if (flujo3.exists())
			System.out.println("El archivo/directorio existe");
		else{
			System.out.println("El archivo/directorio NO existe");
			try {
				if(flujo3.createNewFile())
					System.out.println("Se creo el archivo dentro del directorio");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		for (int i = 0 ; i<100; i++){
			File f = new File("vamo_a_calmarno"+i+".abc");
			
			try {
				f.createNewFile();
				if ((i%2) == 0)
					f.delete();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new EjemploFile();
	}

}
