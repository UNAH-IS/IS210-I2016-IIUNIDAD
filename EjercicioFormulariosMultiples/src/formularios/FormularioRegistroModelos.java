package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.Modelo;

public class FormularioRegistroModelos extends JInternalFrame {
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtAbreviatura;
	private JList<Modelo> list;
	private DefaultListModel<Modelo> listaModelos;

	/**
	 * Create the frame.
	 */
	public FormularioRegistroModelos() {
		listaModelos = new DefaultListModel<Modelo>();
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Registro de Modelos");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 358, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCodigoModelo = new JLabel("Codigo Modelo:");
		lblCodigoModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigoModelo.setBounds(0, 14, 93, 14);
		getContentPane().add(lblCodigoModelo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(95, 11, 86, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(0, 39, 93, 14);
		getContentPane().add(lblModelo);
		
		JLabel lblAbreviatura = new JLabel("Abreviatura");
		lblAbreviatura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAbreviatura.setBounds(0, 64, 93, 14);
		getContentPane().add(lblAbreviatura);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(95, 36, 237, 20);
		getContentPane().add(txtNombre);
		
		txtAbreviatura = new JTextField();
		txtAbreviatura.setColumns(10);
		txtAbreviatura.setBounds(95, 61, 86, 20);
		getContentPane().add(txtAbreviatura);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 117, 320, 142);
		getContentPane().add(scrollPane);
		
		list = new JList<Modelo>();
		scrollPane.setViewportView(list);
		list.setModel(listaModelos);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(10, 89, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Modelo m = new Modelo(
						Integer.valueOf(txtCodigo.getText()),
						txtNombre.getText(),
						txtAbreviatura.getText()
					);
				listaModelos.addElement(m);
				FormularioRegistroTelefonos.agregarModelo(m);
			}
		});
		btnGuardar.setBounds(105, 89, 89, 23);
		getContentPane().add(btnGuardar);

	}
}
