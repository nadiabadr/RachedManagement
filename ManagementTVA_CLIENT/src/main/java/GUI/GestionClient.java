package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;

public class GestionClient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionClient frame = new GestionClient();
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
	public GestionClient() {
		setMinimumSize(new Dimension(1100, 700));
		setPreferredSize(new Dimension(1100, 700));
		setSize(new Dimension(1100, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(1100, 700));
		contentPane.setMaximumSize(new Dimension(1100, 700));
		contentPane.setMinimumSize(new Dimension(1100, 700));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestionClient = new JButton("Gestion Client");
		btnGestionClient.setBounds(88, 114, 172, 133);
		contentPane.add(btnGestionClient);
		
		JButton btnGestionComptable = new JButton("Gestion Comptable");
		btnGestionComptable.setBounds(335, 114, 172, 133);
		contentPane.add(btnGestionComptable);
		
		JButton button = new JButton("Gestion Comptable");
		button.setBounds(589, 114, 172, 133);
		contentPane.add(button);
	}
}
