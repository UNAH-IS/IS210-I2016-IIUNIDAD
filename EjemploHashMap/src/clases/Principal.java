package clases;

import java.util.ArrayList;
import java.util.HashMap;

public class Principal {
	//HashMap<TipoParaIndice, TipoParaAlmacenar>
	private HashMap<String, Producto> productos;
	private ArrayList<Producto> listaProductos;
	
	public Principal(){
		productos = new HashMap<String, Producto>();
		listaProductos = new ArrayList<Producto>();
		Producto p1 = new Producto(10,"Mentolina");
		Producto p2 = new Producto(12,"Vix Vaporub");
		Producto p3 = new Producto(11,"Desodorante");
		
		productos.put("ProductoX", p1);
		productos.put("ProductoY", p2);
		productos.put("ProductoX", p3);
		
		/*System.out.println(productos.get("ProductoX"));
		System.out.println(productos.get("ProductoY"));*/
		//Ejemplo For Each para recorrer el hashmap
		for (String llave: productos.keySet()){
			System.out.println(productos.get(llave));
		}
		
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		
		//Ejemplo For Each
		for (Producto p: listaProductos){
			System.out.println(p.toString());
		}
	}

	public static void main(String[] args) {
		new Principal();
	}
}
