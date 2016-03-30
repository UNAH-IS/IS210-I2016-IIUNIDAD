package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmSalir;
	private JInternalFrame internalFrame;
	private JMenuItem mntmRegistrarMarca;

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
		setBounds(100, 100, 500, 334);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Operaciones");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Registrar Telefono");
		mnFile.add(mntmOpen);
		
		mntmRegistrarMarca = new JMenuItem("Registrar Marca");
		mnFile.add(mntmRegistrarMarca);
		
		JMenuItem mntmRegistrarModelo = new JMenuItem("Registrar Modelo");
		mnFile.add(mntmRegistrarModelo);
		
		mntmSalir = new JMenuItem("Salir");
		mnFile.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		internalFrame = new JInternalFrame("Registrar Marca");
		internalFrame.setMaximizable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setClosable(true);
		internalFrame.setBounds(10, 11, 282, 198);
		contentPane.add(internalFrame);
		
		gestionEventos();
	}
	
	public void gestionEventos(){
		mntmSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		mntmRegistrarMarca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				internalFrame.setVisible(true);
			}
		});
	}
}
