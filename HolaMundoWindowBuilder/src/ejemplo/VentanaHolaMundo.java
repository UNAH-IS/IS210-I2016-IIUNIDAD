package ejemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaHolaMundo extends JFrame {
	
	private JPanel contentPane;
	private JLabel lblHolaMundo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VentanaHolaMundo frame = new VentanaHolaMundo();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public VentanaHolaMundo() {
		setTitle("Hola Mundo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHolaMundo = new JLabel("Hola Mundo");
		lblHolaMundo.setBounds(160, 11, 99, 26);
		contentPane.add(lblHolaMundo);
		
		JButton btnClickAqu = new JButton("Click Aqu\u00ED");
		
		btnClickAqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar();
			}
		});
		
		btnClickAqu.setBounds(160, 204, 106, 23);
		contentPane.add(btnClickAqu);
	}
	
	public void guardar(){
		lblHolaMundo.setText("Hola Juan");
	}
}
