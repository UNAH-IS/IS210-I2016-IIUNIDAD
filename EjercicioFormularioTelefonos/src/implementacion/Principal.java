package implementacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.Marca;
import clases.Modelo;
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
	private JLabel lblOperador;
	
	private JComboBox<Marca> cboMarca;
	private JComboBox<Modelo> cboModelo;
	private JTextField txtNumero;
	private JTextField txtIMEI;
	private JTextField txtPrecio;
	private JTextField txtAlmacenamiento;
	
	private JTextArea txtResultado;
	private JScrollPane scrlResultado; 
	
	private JButton btnGuardar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnNuevo;
	
	private JRadioButton rbtAndroid;
	private JRadioButton rbtIOS;
	
	private JCheckBox chkTigo;
	private JCheckBox chkClaro;
	//Este no es un componente grafico,
	//unicamente sirve para dar la logica a los radiobotones
	//y solo pueda seleccionar uno
	private ButtonGroup grupoSO;
	
	private ArrayList<Telefono> telefonos;
	
	public Principal(){
		telefonos = new ArrayList<Telefono>();
		inicializarVentana();
		inicializarComponentes();
		llenarInformacionInicial();
		ubicarComponentes();
		agregarComponentes();
		definirPropiedades();
		registrarEventos();
		ventana.setVisible(true);
	}
	
	public void inicializarVentana(){
		ventana = new JFrame("Registro de telefonos");
		ventana.setSize(450,540);
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
		lblOperador = new JLabel("Operador");
		
		cboMarca = new JComboBox<Marca>();
		cboModelo = new JComboBox<Modelo>();
		txtNumero = new JTextField();
		txtIMEI = new JTextField();
		txtPrecio = new JTextField();
		txtAlmacenamiento = new JTextField();
		
		txtResultado = new JTextArea();
		scrlResultado = new JScrollPane();
		
		btnGuardar = new JButton("Guardar");
		btnActualizar = new JButton("Actualizar");
		btnEliminar = new JButton("Eliminar");
		btnNuevo = new JButton("Nuevo");
		
		rbtAndroid = new JRadioButton("Android");
		rbtIOS = new JRadioButton("iOS");
		grupoSO = new ButtonGroup();
		//Agregarlos al mismo ButtonGroup para que solo pueda
		//seleccionar uno
		grupoSO.add(rbtAndroid);
		grupoSO.add(rbtIOS);
		
		chkTigo = new JCheckBox("Tigo");
		chkClaro = new JCheckBox("Claro");
	}
	
	public void llenarInformacionInicial(){
		cboMarca.addItem(new Marca(1, "Samsung"));
		cboMarca.addItem(new Marca(2, "Chino"));
		
		cboModelo.addItem(new Modelo(1,"S5","S5"));
		cboModelo.addItem(new Modelo(1,"S6","S6"));
		cboModelo.addItem(new Modelo(1,"S7","S7"));
	}
	
	public void ubicarComponentes(){
		lblMarca.setBounds(20, 20, 100, 25);
		lblModelo.setBounds(20, 60, 100, 25);
		lblNumero.setBounds(20, 100, 100, 25);
		lblIMEI.setBounds(20, 140, 100, 25);
		lblSistemaOperativo.setBounds(20, 180, 100, 25);
		lblPrecio.setBounds(20, 220, 100, 25);
		lblAlmacenamiento.setBounds(20, 260, 100, 25);
		lblOperador.setBounds(20, 300, 100, 25);
		
		cboMarca.setBounds(125,20,200, 25);
		cboModelo.setBounds(125, 60, 200, 25);
		txtNumero.setBounds(125, 100, 200, 25); 
		txtIMEI.setBounds(125, 140, 200, 25);
		txtPrecio.setBounds(125, 220, 200, 25);
		txtAlmacenamiento.setBounds(125, 260, 200, 25);
		
		scrlResultado.setBounds(20, 340, 400, 150);

		btnGuardar.setBounds(330, 20, 100, 30);
		btnActualizar.setBounds(330, 60, 100, 30);
		btnEliminar.setBounds(330, 100, 100, 30);
		btnNuevo.setBounds(330, 140, 100, 30);
		
		rbtAndroid.setBounds(125,180,70,20);
		rbtIOS.setBounds(200,180,100,20);
		
		chkTigo.setBounds(125,300,70,20);
		chkClaro.setBounds(200,300,70,20);
	}
	
	public void definirPropiedades(){
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIMEI.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSistemaOperativo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlmacenamiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOperador.setHorizontalAlignment(SwingConstants.RIGHT);
		
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
		ventana.add(lblOperador);
		
		ventana.add(cboMarca);
		ventana.add(cboModelo);
		ventana.add(txtNumero);
		ventana.add(txtIMEI);
		ventana.add(txtPrecio);
		ventana.add(txtAlmacenamiento);
		
		ventana.add(btnGuardar);
		ventana.add(btnActualizar);
		ventana.add(btnEliminar);
		ventana.add(btnNuevo);
		
		ventana.add(rbtAndroid);
		ventana.add(rbtIOS);
		
		ventana.add(scrlResultado);
		scrlResultado.setViewportView(txtResultado);
		
		ventana.add(chkTigo);
		ventana.add(chkClaro);
		
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
		cboMarca.setSelectedItem(null);
		cboModelo.setSelectedItem(null);
		txtNumero.setText(null);
		txtIMEI.setText(null);
		txtPrecio.setText(null);
		txtAlmacenamiento.setText(null);
	}
	
	public void guardarRegistro(){
		String sistemaOperativo = "";
		if (rbtAndroid.isSelected())
			sistemaOperativo = "Android";
		else if (rbtIOS.isSelected())
			sistemaOperativo = "iOS";
		else
			sistemaOperativo = "Otro";
		
		Telefono t = new Telefono(
				(Marca)cboMarca.getSelectedItem(),
				(Modelo)cboModelo.getSelectedItem(),
				txtNumero.getText(),
				txtIMEI.getText(),
				sistemaOperativo,//rbtAndroid.isSelected()?"Android":"iOS",
				Double.valueOf(txtPrecio.getText()),
				Integer.valueOf(txtAlmacenamiento.getText())
		);
		if (chkTigo.isSelected())
			t.agregarOperador("Tigo");
		if (chkClaro.isSelected())
			t.agregarOperador("Claro");
		telefonos.add(t);
		
		mostrarInformacion();
	}
	
	public void actualizarRegistro(){
		int indice = Integer.valueOf(JOptionPane.showInputDialog("Que elemento desea actualzar?"));
		String sistemaOperativo = "";
		if (rbtAndroid.isSelected())
			sistemaOperativo = "Android";
		else if (rbtIOS.isSelected())
			sistemaOperativo = "iOS";
		else
			sistemaOperativo = "Otro";
		
		
		telefonos.set(indice, new Telefono(
				(Marca)cboMarca.getSelectedItem(),
				(Modelo)cboModelo.getSelectedItem(),
				txtNumero.getText(),
				txtIMEI.getText(),
				sistemaOperativo,
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
