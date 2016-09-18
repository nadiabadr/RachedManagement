package GUI;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.ListeClientPanel;

public class GestionClient extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static javax.swing.JPanel panelContent;
	private JPanel contentPane;
	ListeClientPanel listeClientPanel = new ListeClientPanel();

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
		initComponents();
		setResizable(false);

	}

	private void initComponents() {
		setTitle("Welcome Rached");

		panelContent = new javax.swing.JPanel();

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
		btnSupprimerClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSupprimerClient.setBounds(0, 481, 195, 169);
		contentPane.add(btnSupprimerClient);

		panelContent.setBounds(200, 10, 880, 560);
		contentPane.add(panelContent);
		JButton btnListerClients = new JButton("Lister Clients");
		btnListerClients.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				listingBtnActionPerformed(evt);
			}
		});
		btnListerClients.setBounds(0, 322, 195, 159);
		contentPane.add(btnListerClients);

		JButton btnRetourAuMennu = new JButton("Retour Au Menu");
		btnRetourAuMennu.setBounds(931, 590, 121, 49);
		contentPane.add(btnRetourAuMennu);

	}

	private void listingBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gestionFournisseursBtnActionPerformed
		System.out.println("lister les clients");
		panelContent.removeAll();
		panelContent.add(listeClientPanel);
		panelContent.repaint();
		panelContent.revalidate(); // TODO add your handling code here:
	}
}
