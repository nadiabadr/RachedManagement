package GUI;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

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
					Menu frame = new Menu();
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
	public Menu() {
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
		btnGestionClient.setBounds(197, 114, 172, 133);
		contentPane.add(btnGestionClient);
		
		JButton btnGestionComptable = new JButton("Gestion Comptable");
		btnGestionComptable.setBounds(455, 114, 172, 133);
		contentPane.add(btnGestionComptable);
		
		JButton btnGestionCommande = new JButton("Gestion Commande");
		btnGestionCommande.setBounds(697, 114, 172, 133);
		contentPane.add(btnGestionCommande);
		
		JButton btnFicheClient = new JButton("Fiches Clients");
		btnFicheClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFicheClient.setBounds(274, 351, 172, 133);
		contentPane.add(btnFicheClient);
		
		JButton btnGestionDeStock = new JButton("Gestion de Stock");
		btnGestionDeStock.setBounds(551, 351, 172, 133);
		contentPane.add(btnGestionDeStock);
	}
}
