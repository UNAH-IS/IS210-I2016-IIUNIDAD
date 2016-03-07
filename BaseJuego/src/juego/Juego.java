package juego;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import clases.Auto;

public class Juego extends Canvas implements KeyListener{
	private JFrame ventana;
	private BufferStrategy dobleBuffer;
	private Graphics2D g2D;
	
	private boolean jugando  = false;

	public static final int ANCHO_VENTANA = 700/*DEFINA SUS PROPIAS DIMENSIONES*/;
	public static final int ALTO_VENTANA = 500/*DEFINA SUS PROPIAS DIMENSIONES*/;
	
	int lastFpsTime; //Variable auxiliar para calculo de la pausa del ciclo principal
	int fps; //Fotogramas por segundo
	
	private HashMap<String,BufferedImage> imagenes = new HashMap<String,BufferedImage>();
	private Auto auto; //Lo mejor es almacenar los objetos de juego en un ArrayList
	
	public Juego(){
		cargarImagenes();
		inicializarObjetosJuego();
		//Crear la ventana y establecer sus propiedades
		
		ventana = new JFrame(); //Crear instancia de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminar aplicacion cuando se de click en la X
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA); //Establecer las dimensiones de la ventana
		ventana.setLocationRelativeTo(null); //Centrar ventana en el escritorio
		ventana.setTitle("Establezca el titulo de su conveniencia"); //Definir el titulo de la ventana
		ventana.getContentPane().add(this); //Agregar el Canvas (lienzo) a la ventana
		ventana.setVisible(true); //Mostrar ventana
		
		createBufferStrategy(2); //Crear una estrategia de doble buffer (metodo optimo para videojuegos)
		dobleBuffer = getBufferStrategy(); //Obtener una instancia de BufferStrategy (para luego dibujar los componentes)
		
		jugando = true; //Definir la variable logica de juego en true	
		
		this.requestFocus(); //Solicitar el foco para que los eventos del teclado puedan ser capturados por el Canvas.
		this.addKeyListener(this); //Agregar interfaz de escucha para poder interceptar las teclas pulsadas por el usuario.
		
		cicloPrincipal(); //Ejecutar el ciclo principal del juego (Este no necesariamente debe llamarse desde aqui)
	}
	
	public void inicializarObjetosJuego(){
		auto = new Auto("Juan", 200,200,2,"auto");
	}
	
	//Cargar Imagenes
	public void cargarImagenes(){
		//Es mas conveniente almacenar las imagenes en un hashmap para poder darle un alias.
		try {
			imagenes.put("auto", ImageIO.read(getClass().getResource("/recursos/auto.png")));
			imagenes.put("auto_furioso", ImageIO.read(getClass().getResource("/recursos/auto_rapido_furioso.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//Metodo para pintar los componentes del juego
	private void pintar(){
        g2D = (Graphics2D)dobleBuffer.getDrawGraphics(); //Obtener la instancia de Graphics para pintar los elementos
        
        //Puede borrar las siguientes 4 lineas
        g2D.setColor(Color.BLACK); //Definir el color negro en el contexto
        g2D.fillRect(0, 0, ANCHO_VENTANA, ALTO_VENTANA); //Dibujar un rectangulo
        g2D.setColor(Color.WHITE); //Definir el color blanco en el contexto
        g2D.drawString("Dibuje en esta seccion los componentes",30,30); //Dibujar un string
        
        //Pintar el auto
        auto.pintar(g2D, imagenes.get(auto.getLlaveImagen()), this);
        
        dobleBuffer.show(); //Mostrar lo que se ha dibujado
	}
	
	public void actualizar(){
		//Agregue aqui el codigo necesario para actualizar los componentes de juego y construir la logica del juego
		auto.mover();
	}

	public void cicloPrincipal(){
       //variables para el calculo del tiempo para la pausa, este codigo es opcional, si lo desea puede definir un valor para la pausa en duro.
	   long lastLoopTime = System.nanoTime(); 
       final int TARGET_FPS = 60;
       final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;
       
       while (jugando){
    	   //Calculo del tiempo optimo y uniforme para la pausa.
    	   long now = System.nanoTime();
    	   long updateLength = now - lastLoopTime;
    	   lastLoopTime = now;
    	   double delta = updateLength / ((double)OPTIMAL_TIME);
    	   lastFpsTime += updateLength;
    	   fps++;
    	   if (lastFpsTime >= 1000000000){
    		   System.out.println("(FPS: "+fps+")");
    		   lastFpsTime = 0;
    		   fps = 0;
    	   }
    	   //Fin del calculo del tiempo optimo y uniforme para la pausa.
    	   
    	   //Metodos para pintar el lienzo y actualizar los componentes de juego
    	   pintar();    	   
    	   actualizar();
    	   
    	   //Aplicar la pausa.
    	   try{Thread.sleep((lastLoopTime-System.nanoTime() + OPTIMAL_TIME)/1000000 );} //Puede sustituir el valor de la pausa por un valor fijo
    	   catch(Exception e){};
       }
    }
		
	//Metodo que se ejecuta cuando el usuario presiona una tecla
	public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
        	case KeyEvent.VK_SPACE:
        			auto.setVelocidad(5);
        			auto.setLlaveImagen("auto_furioso");
        		break;
        }
    }

	//Metodo que se ejecuta cuando el usuario suelta una tecla
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
	        case KeyEvent.VK_SPACE:
				auto.setVelocidad(2);
				auto.setLlaveImagen("auto");
			break;
        }
    }    
    //Sin uso, pero a fuerzas se debe redefinir
  	public void keyTyped(KeyEvent e) {}
	
    public static void main(String[] args){
		new Juego(); //Crear un objeto del tipo Juego.
	}
}