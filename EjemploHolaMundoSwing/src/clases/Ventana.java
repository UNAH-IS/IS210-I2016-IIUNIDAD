package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana implements ActionListener{
	private JFrame ventana;
	private JTextField txtMensaje;
	private JButton btnAccion;
	
	public Ventana(){
		inicializarVentana();
		inicializarComponentes();
		ubicarComponentes();
		gestionarEventos();		
		agregarComponentes();		
		ventana.setVisible(true);		
	}
	public void inicializarVentana(){
		ventana = new JFrame("Ejemplo Hola Mundo");
		ventana.setSize(280,150);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);//Permite utilizar coordenadas para ubicar los componentes 
		ventana.setResizable(false);
	}
	
	public void inicializarComponentes(){
		txtMensaje = new JTextField();
		btnAccion = new JButton("Click aqui");
	}
	
	public void ubicarComponentes(){
		txtMensaje.setBounds(30, 30, 225, 35);
		btnAccion.setBounds(50,70,150,35);
	}
	
	public void agregarComponentes(){
		ventana.add(txtMensaje);
		ventana.add(btnAccion);
	}
	
	public void gestionarEventos(){
		//Asociar listener a boton
		btnAccion.addActionListener(this);
	}
	
	public static void main(String args[]){
		new Ventana();
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		//evento.getSource()
		JOptionPane.showMessageDialog(ventana, 
				"Hola " + txtMensaje.getText());
	}
}
