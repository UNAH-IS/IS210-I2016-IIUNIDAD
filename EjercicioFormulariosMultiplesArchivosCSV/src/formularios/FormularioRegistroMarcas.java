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
import javax.swing.border.EmptyBorder;

import clases.Marca;

public class FormularioRegistroMarcas extends JInternalFrame {
	private JTextField txtCodigoMarca;
	private JTextField txtNombreMarca;
	
	private JList<Marca> lstResultado;
	private DefaultListModel<Marca> marcas; 

	/**
	 * Create the frame.
	 */
	public FormularioRegistroMarcas() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setTitle("Registro de marcas");
		setBounds(100, 100, 299, 300);
		getContentPane().setLayout(null);
		
		marcas = new DefaultListModel<Marca>();
		
		JLabel lblCodigoMarca = new JLabel("Codigo:");
		lblCodigoMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigoMarca.setBounds(10, 11, 100, 14);
		getContentPane().add(lblCodigoMarca);
		
		JLabel lblNombreMarca = new JLabel("Nombre Marca:");
		lblNombreMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreMarca.setBounds(10, 40, 100, 14);
		getContentPane().add(lblNombreMarca);
		
		txtCodigoMarca = new JTextField();
		txtCodigoMarca.setBounds(118, 8, 86, 20);
		getContentPane().add(txtCodigoMarca);
		txtCodigoMarca.setColumns(10);
		
		txtNombreMarca = new JTextField();
		txtNombreMarca.setBounds(118, 37, 151, 20);
		getContentPane().add(txtNombreMarca);
		txtNombreMarca.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marca m = new Marca(
						Integer.valueOf(txtCodigoMarca.getText()),
						txtNombreMarca.getText()
					);
				marcas.addElement(m);
				FormularioRegistroTelefonos.cboMarca.addItem(m);
			}
		});
		btnGuardar.setBounds(104, 68, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNuevo.setBounds(10, 68, 89, 23);
		getContentPane().add(btnNuevo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 263, 164);
		getContentPane().add(scrollPane);
		
		lstResultado = new JList<Marca>();
		scrollPane.setViewportView(lstResultado);
		lstResultado.setModel(marcas);

	}
}
