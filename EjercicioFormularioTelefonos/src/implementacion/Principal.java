package implementacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.Telefono;

public class Principal {
	private JFrame ventana;
	
	private JLabel lblMarca;
	private JLabel lblModelo;
	private JLabel lblNumero;
	private JLabel lblIMEI;
	private JLabel lblSistemaOperativo;
	private JLabel lblPrecio;
	private JLabel lblAlmacenamiento;
	
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtNumero;
	private JTextField txtIMEI;
	private JTextField txtSistemaOperativo;
	private JTextField txtPrecio;
	private JTextField txtAlmacenamiento;
	
	private JTextArea txtResultado;
	private JScrollPane scrlResultado; 
	
	private JButton btnGuardar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnNuevo;
	
	private ArrayList<Telefono> telefonos;
	
	public Principal(){
		telefonos = new ArrayList<Telefono>();
		inicializarVentana();
		inicializarComponentes();
		ubicarComponentes();
		agregarComponentes();
		definirPropiedades();
		registrarEventos();
		ventana.setVisible(true);
	}
	
	public void inicializarVentana(){
		ventana = new JFrame("Registro de telefonos");
		ventana.setSize(450,500);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);//Permite utilizar coordenadas para ubicar los componentes 
		ventana.setResizable(false);
	}
	
	public void inicializarComponentes(){
		lblMarca = new JLabel("Marca:");
		lblModelo = new JLabel("Modelo:");
		lblNumero = new JLabel("Numero:");
		lblIMEI = new JLabel("IMEI:");
		lblSistemaOperativo = new JLabel("S.O.:");
		lblPrecio = new JLabel("Precio:");
		lblAlmacenamiento = new JLabel("Almacenamiento:");
		
		txtMarca = new JTextField();
		txtModelo = new JTextField();
		txtNumero = new JTextField();
		txtIMEI = new JTextField();
		txtSistemaOperativo = new JTextField();
		txtPrecio = new JTextField();
		txtAlmacenamiento = new JTextField();
		
		txtResultado = new JTextArea();
		scrlResultado = new JScrollPane();
		
		btnGuardar = new JButton("Guardar");
		btnActualizar = new JButton("Actualizar");
		btnEliminar = new JButton("Eliminar");
		btnNuevo = new JButton("Nuevo");
	}
	
	public void ubicarComponentes(){
		lblMarca.setBounds(20, 20, 100, 25);
		lblModelo.setBounds(20, 60, 100, 25);
		lblNumero.setBounds(20, 100, 100, 25);
		lblIMEI.setBounds(20, 140, 100, 25);
		lblSistemaOperativo.setBounds(20, 180, 100, 25);
		lblPrecio.setBounds(20, 220, 100, 25);
		lblAlmacenamiento.setBounds(20, 260, 100, 25);
		
		txtMarca.setBounds(125,20,200, 25);
		txtModelo.setBounds(125, 60, 200, 25);
		txtNumero.setBounds(125, 100, 200, 25); 
		txtIMEI.setBounds(125, 140, 200, 25);
		txtSistemaOperativo.setBounds(125, 180, 200, 25);
		txtPrecio.setBounds(125, 220, 200, 25);
		txtAlmacenamiento.setBounds(125, 260, 200, 25);
		
		scrlResultado.setBounds(20, 300, 400, 150);

		btnGuardar.setBounds(330, 20, 100, 30);
		btnActualizar.setBounds(330, 60, 100, 30);
		btnEliminar.setBounds(330, 100, 100, 30);
		btnNuevo.setBounds(330, 140, 100, 30);
	}
	
	public void definirPropiedades(){
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIMEI.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSistemaOperativo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlmacenamiento.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btnGuardar.setMnemonic('G');
		btnActualizar.setMnemonic('A');
		btnEliminar.setMnemonic('E');
		btnNuevo.setMnemonic('N');
	}
	
	public void agregarComponentes(){
		ventana.add(lblMarca);
		ventana.add(lblModelo);
		ventana.add(lblNumero);
		ventana.add(lblIMEI);
		ventana.add(lblSistemaOperativo);
		ventana.add(lblPrecio);
		ventana.add(lblAlmacenamiento);
		
		ventana.add(txtMarca);
		ventana.add(txtModelo);
		ventana.add(txtNumero);
		ventana.add(txtIMEI);
		ventana.add(txtSistemaOperativo);
		ventana.add(txtPrecio);
		ventana.add(txtAlmacenamiento);
		
		ventana.add(btnGuardar);
		ventana.add(btnActualizar);
		ventana.add(btnEliminar);
		ventana.add(btnNuevo);
		
		ventana.add(scrlResultado);
		scrlResultado.setViewportView(txtResultado);
		
	}
	
	public void registrarEventos(){
		btnGuardar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				guardarRegistro();
			}
		});
		
		btnActualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actualizarRegistro();
			}
		});
		btnEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				eliminarRegistro();
			}
		});
		btnNuevo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nuevoRegistro();
			}			
		});
		
	}
	
	public void nuevoRegistro(){
		txtMarca.setText(null);
		txtModelo.setText(null);
		txtNumero.setText(null);
		txtIMEI.setText(null);
		txtSistemaOperativo.setText(null);
		txtPrecio.setText(null);
		txtAlmacenamiento.setText(null);
	}
	
	public void guardarRegistro(){
		telefonos.add(new Telefono(
				txtMarca.getText(),
				txtModelo.getText(),
				txtNumero.getText(),
				txtIMEI.getText(),
				txtSistemaOperativo.getText(),
				Double.valueOf(txtPrecio.getText()),
				Integer.valueOf(txtAlmacenamiento.getText())
		));
		mostrarInformacion();
	}
	
	public void actualizarRegistro(){
		int indice = Integer.valueOf(JOptionPane.showInputDialog("Que elemento desea actualzar?"));
		telefonos.set(indice, new Telefono(
				txtMarca.getText(),
				txtModelo.getText(),
				txtNumero.getText(),
				txtIMEI.getText(),
				txtSistemaOperativo.getText(),
				Double.valueOf(txtPrecio.getText()),
				Integer.valueOf(txtAlmacenamiento.getText())
		));
		mostrarInformacion();
	}
	
	public void eliminarRegistro(){
		int indice = Integer.valueOf(JOptionPane.showInputDialog("Que elemento desea eliminar?"));
		telefonos.remove(indice);
		mostrarInformacion();
	}
	
	public void mostrarInformacion(){
		//Limpiar el TextArea
		txtResultado.setText(null);
		//Llena utilizando un for each
		for(Telefono t: telefonos)
			txtResultado.append(t.toString() + "\n");
	}
	
	public static void main(String args[]){
		new Principal();
	}
}
