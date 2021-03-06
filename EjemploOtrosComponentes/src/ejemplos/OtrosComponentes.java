package ejemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

public class OtrosComponentes extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtrosComponentes frame = new OtrosComponentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OtrosComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnClickAqui = new JToggleButton("Click aqui");
		tglbtnClickAqui.setBounds(305, 63, 86, 23);
		contentPane.add(tglbtnClickAqui);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(222, 122, 121, 20);
		contentPane.add(passwordField);
		
		JSlider slider = new JSlider();
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setMaximum(200);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(10, 11, 107, 261);
		slider.setValue(85);
		contentPane.add(slider);
		
		progressBar = new JProgressBar();
		progressBar.setValue(10);
		progressBar.setStringPainted(true);
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setBounds(163, 11, 17, 131);
		contentPane.add(progressBar);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*if (tglbtnClickAqui.isSelected())
					JOptionPane.showMessageDialog(null, "ToggleButton seleccionado");
				else
					JOptionPane.showMessageDialog(null, "ToggleButton NO seleccionado");*/
				//JOptionPane.showMessageDialog(null, new String(passwordField.getPassword()));
				
				//passwordField.setText("asd.456");
				JOptionPane.showMessageDialog(null, 
						"Valor seleccionado: " + slider.getValue());
			}
		});
		btnVerificar.setBounds(175, 227, 89, 23);
		contentPane.add(btnVerificar);
		simularCarga();
	}
	
	public void simularCarga(){
		new Thread(new Runnable(){
				@Override
				public void run() {
					for (int i=0;i<=100;i++){
						progressBar.setValue(i);
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		).start();
		
	}
}
