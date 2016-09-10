package InterfacesGraphiques;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JButton;

public class GestionClients extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionClients frame = new GestionClients();
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
	public GestionClients() {
		setFont(new Font("Roboto Lt", Font.PLAIN, 13));
		setMinimumSize(new Dimension(1100, 700));
		setName("frameGestionClients");
		setType(Type.UTILITY);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Ajouter Client");
		button.setBounds(0, 0, 125, 113);
		contentPane.add(button);
		
		Button button_1 = new Button("Modifier Client");
		button_1.setBounds(0, 114, 125, 113);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Supprimer Client");
		button_2.setBounds(0, 228, 125, 113);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Afficher les Clients");
		button_3.setBounds(0, 342, 125, 113);
		contentPane.add(button_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 959, 671);
		contentPane.add(panel_1);
		panel_1.setRequestFocusEnabled(false);
		panel_1.setIgnoreRepaint(true);
		panel_1.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(359, 142, 187, 41);
		panel_1.add(textField_5);
		
		JLabel label = new JLabel("Entreprise");
		label.setFont(new Font("Roboto", label.getFont().getStyle(), label.getFont().getSize() + 4));
		label.setBounds(207, 142, 142, 41);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Nom Responsable");
		label_1.setBounds(207, 206, 142, 41);
		panel_1.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(359, 206, 187, 41);
		panel_1.add(textField_6);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setBounds(207, 281, 142, 41);
		panel_1.add(label_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(359, 281, 187, 41);
		panel_1.add(textField_7);
		
		JLabel label_3 = new JLabel("T\u00E9l");
		label_3.setBounds(207, 353, 142, 41);
		panel_1.add(label_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(359, 353, 187, 41);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(359, 444, 187, 137);
		panel_1.add(textField_9);
		
		JLabel label_4 = new JLabel("Adresse");
		label_4.setBounds(207, 444, 142, 41);
		panel_1.add(label_4);
		
		JButton btnMettreJour = new JButton("Mettre \u00E0 jour client");
		btnMettreJour.setBounds(435, 605, 111, 36);
		panel_1.add(btnMettreJour);
		
		Panel panel = new Panel();
		panel.setBounds(116, -9, 965, 650);
		panel_1.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(360, 142, 187, 41);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNom = new JLabel("Entreprise");
		lblNom.setFont(new Font("Roboto", lblNom.getFont().getStyle(), lblNom.getFont().getSize() + 3));
		lblNom.setBounds(208, 142, 142, 41);
		panel.add(lblNom);
		
		JLabel lblNomResponsable = new JLabel("Nom Responsable");
		lblNomResponsable.setFont(new Font("Roboto", lblNomResponsable.getFont().getStyle(), lblNomResponsable.getFont().getSize() + 4));
		lblNomResponsable.setBounds(208, 206, 142, 41);
		panel.add(lblNomResponsable);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(360, 206, 187, 41);
		panel.add(textField_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Roboto", lblEmail.getFont().getStyle(), lblEmail.getFont().getSize() + 4));
		lblEmail.setBounds(208, 281, 142, 41);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(360, 281, 187, 41);
		panel.add(textField_2);
		
		JLabel lblTl = new JLabel("T\u00E9l");
		lblTl.setFont(new Font("Roboto", lblTl.getFont().getStyle(), lblTl.getFont().getSize() + 4));
		lblTl.setBounds(208, 353, 142, 41);
		panel.add(lblTl);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(360, 353, 187, 41);
		panel.add(textField_3);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Roboto", lblAdresse.getFont().getStyle(), lblAdresse.getFont().getSize() + 4));
		lblAdresse.setBounds(208, 444, 142, 41);
		panel.add(lblAdresse);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(360, 444, 187, 137);
		panel.add(textField_4);
		
		JButton btnNewButton = new JButton("Ajouter Client");
		btnNewButton.setBounds(436, 605, 111, 36);
		panel.add(btnNewButton);
	}
}
