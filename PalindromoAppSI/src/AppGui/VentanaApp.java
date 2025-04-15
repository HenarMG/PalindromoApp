package AppGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import mainApp.AppMethods;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaApp {

	private JFrame frmPalindromoApp;
	private JTextField textField_palabraDada;
	private JLabel lblNewLabel_result;
	AppMethods method;
	private JButton btnNewButton_limpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaApp window = new VentanaApp();
					window.frmPalindromoApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPalindromoApp = new JFrame();
		frmPalindromoApp.setTitle("Palindromo App");
		frmPalindromoApp.setBounds(100, 100, 450, 300);
		frmPalindromoApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPalindromoApp.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe una palabra abajo:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 37, 277, 27);
		frmPalindromoApp.getContentPane().add(lblNewLabel);
		
		lblNewLabel_result = new JLabel("");
		lblNewLabel_result.setOpaque(true);
		lblNewLabel_result.setForeground(new Color(0, 0, 0));
		lblNewLabel_result.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_result.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_result.setBackground(new Color(153, 204, 255));
		lblNewLabel_result.setBounds(75, 181, 277, 34);
		frmPalindromoApp.getContentPane().add(lblNewLabel_result);
		
		textField_palabraDada = new JTextField();
		textField_palabraDada.setBounds(75, 75, 277, 34);
		frmPalindromoApp.getContentPane().add(textField_palabraDada);
		textField_palabraDada.setColumns(10);
		
		JButton btnNewButton_check = new JButton("¡Comprobar!");
		btnNewButton_check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action
				int numAction;				
				numAction=method.esPalin(textField_palabraDada.getText().trim());
				System.out.println(numAction);
				
				if (numAction==-1) {				
					lblNewLabel_result.setText("No hay palabra, escribe otra vez.");
				} else 
					if (numAction==0) {
					lblNewLabel_result.setText("No es un palíndromo.");
				} else if (numAction==1) {
					lblNewLabel_result.setText("¡Sí, es un palíndromo!");;
				}
			}
		});
		btnNewButton_check.setBounds(75, 133, 115, 23);
		frmPalindromoApp.getContentPane().add(btnNewButton_check);
		
		btnNewButton_limpiar = new JButton("Limpiar");
		btnNewButton_limpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_palabraDada.setText("");
				lblNewLabel_result.setText("");
				
			}
		});
		btnNewButton_limpiar.setBounds(237, 133, 115, 23);
		frmPalindromoApp.getContentPane().add(btnNewButton_limpiar);
	}
}
