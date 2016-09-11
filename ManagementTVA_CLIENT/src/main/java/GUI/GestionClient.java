package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAjouterClient = new JButton("Ajouter Client");
		btnAjouterClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjouterClient.setBounds(0, 0, 195, 169);
		contentPane.add(btnAjouterClient);
		
		JButton btnMettreJour = new JButton("Mettre \u00E0 jour Client");
		btnMettreJour.setBounds(0, 168, 195, 154);
		contentPane.add(btnMettreJour);
		
		JButton btnSupprimerClient = new JButton("Supprimer Client");
		btnSupprimerClient.setBounds(0, 481, 195, 169);
		contentPane.add(btnSupprimerClient);
		
		JButton btnListerClients = new JButton("Lister Clients");
		btnListerClients.setBounds(0, 322, 195, 159);
		contentPane.add(btnListerClients);
		
		JButton btnRetourAuMennu = new JButton("Retour Au Menu");
		btnRetourAuMennu.setBounds(931, 590, 121, 49);
		contentPane.add(btnRetourAuMennu);
	}

}
