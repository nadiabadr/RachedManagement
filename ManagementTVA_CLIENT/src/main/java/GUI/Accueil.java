package GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Accueil extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
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
	public Accueil() {
		setResizable(false);
		setMinimumSize(new Dimension(1100, 700));
		setName("frameAccueil");
		setVisible(true);
		setType(Type.UTILITY);
		setTitle("                                                                                                                                                                                         Accueil");
		setBackground(Color.WHITE);
		setFont(new Font("Roboto", Font.ITALIC, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Roboto", Font.PLAIN, 14));
		contentPane
				.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setVisible(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcomeSiRached = new JLabel(
				"                                                                           Welcome Si Rached");
		lblWelcomeSiRached.setFont(new Font("Roboto", Font.PLAIN, 13));
		lblWelcomeSiRached.setBounds(265, 11, 487, 65);
		contentPane.add(lblWelcomeSiRached);

		JButton btnGestionClients = new JButton("Gestion Clients");
		btnGestionClients.setBounds(204, 148, 184, 120);
		contentPane.add(btnGestionClients);

		JButton btnGestionCommande = new JButton("Gestion Commande");
		btnGestionCommande.setBounds(447, 148, 184, 120);
		contentPane.add(btnGestionCommande);

		JButton btnGestionComptable = new JButton("Gestion Comptable");
		btnGestionComptable.setBounds(699, 148, 184, 120);
		contentPane.add(btnGestionComptable);

		JButton btnFicheClient = new JButton("Fiche Client");
		btnFicheClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFicheClient.setBounds(314, 375, 184, 120);
		contentPane.add(btnFicheClient);

		JButton btnGestionStock = new JButton("Gestion de stock ");
		btnGestionStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionStock.setBounds(578, 373, 184, 124);
		contentPane.add(btnGestionStock);

		JButton btnDeconnect = new JButton("Se deconnecter");
		btnDeconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeconnect.setBounds(925, 587, 126, 60);
		contentPane.add(btnDeconnect);
	}
}
