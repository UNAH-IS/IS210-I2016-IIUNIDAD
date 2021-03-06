package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class FormularioPrincipal extends JFrame {

	private JDesktopPane contentPane;
	private JMenuItem mntmSalir;
	private FormularioRegistroMarcas frmRegistroMarcas;
	private JMenuItem mntmRegistrarMarca;
	private FormularioRegistroTelefonos frmRegistroTelefonos;
	private FormularioRegistroModelos frmRegistroModelos;
	private JMenuItem mntmRegistrarTelefono;
	private JMenuItem mntmRegistrarModelo;
	private JToolBar toolBar;
	private JButton btnAbrir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FormularioPrincipal frame = new FormularioPrincipal();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
				
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Operaciones");
		menuBar.add(mnFile);
		
		mntmRegistrarTelefono = new JMenuItem("Registrar Telefono");
		mnFile.add(mntmRegistrarTelefono);
		
		mntmRegistrarMarca = new JMenuItem("Registrar Marca");
		mnFile.add(mntmRegistrarMarca);
		
		mntmRegistrarModelo = new JMenuItem("Registrar Modelo");
		mnFile.add(mntmRegistrarModelo);
		
		mntmSalir = new JMenuItem("Salir");
		mnFile.add(mntmSalir);
		contentPane = new JDesktopPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		frmRegistroMarcas = new FormularioRegistroMarcas();
		contentPane.add(frmRegistroMarcas);
		
		frmRegistroModelos = new FormularioRegistroModelos();
		frmRegistroModelos.getContentPane().setLayout(null);
		contentPane.add(frmRegistroModelos);
		
		frmRegistroTelefonos = new FormularioRegistroTelefonos();
		contentPane.add(frmRegistroTelefonos);
		
		toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 884, 34);
		contentPane.add(toolBar);
		
		btnAbrir = new JButton("");
		btnAbrir.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/recursos/abrir.png")));
		toolBar.add(btnAbrir);
		
		gestionEventos();
	}
	
	public void gestionEventos(){
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Abrir");
			}
		});
		mntmSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		mntmRegistrarMarca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmRegistroMarcas.setLocation(0, 0);
				frmRegistroMarcas.setVisible(true);
			}
		});
		
		mntmRegistrarModelo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmRegistroModelos.setLocation(0, 0);
				frmRegistroModelos.setVisible(true);
			}
		});
		
		mntmRegistrarTelefono.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmRegistroTelefonos.setLocation(0, 0);
				frmRegistroTelefonos.setVisible(true);
			}
		});
		
	}
}
