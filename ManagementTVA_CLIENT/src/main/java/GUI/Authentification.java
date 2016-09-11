package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import BusinessDelegator.AdminDelegate;
import BusinessDelegator.SessionDelegate;
import Entities.Admin;

public class Authentification extends JFrame {
	public Admin authentifiedUser;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Authentification authentification = new Authentification();
					authentification.setVisible(true);
					System.out
							.println("ena doub ma 7allit l'app: session login "
									+ SessionDelegate.doGetLogin()
									+ " Session Pwd "
									+ SessionDelegate.doGetPwd());

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Authentification() {
		// initialize();
		setTheme();
		setTitle("Identification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		setBounds(100, 100, 677, 475);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, "name_242183231327260");

		panel.setLayout(null);

		JLabel labelLogin = new JLabel("Login: ");
		labelLogin.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 17));
		labelLogin.setForeground(new Color(0, 51, 102));
		labelLogin.setBounds(10, 229, 89, 18);
		panel.add(labelLogin);

		JLabel labelPassword = new JLabel("Password: ");
		labelPassword.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 17));
		labelPassword.setForeground(new Color(0, 51, 102));
		labelPassword.setBounds(10, 287, 89, 18);
		panel.add(labelPassword);

		loginField = new JTextField();
		loginField.setBounds(98, 227, 151, 20);
		panel.add(loginField);
		loginField.setColumns(10);

		JButton buttonLogin = new JButton("Login");
		buttonLogin.setFont(new Font("Roboto", Font.PLAIN, 12));

		buttonLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				authentifiedUser = AdminDelegate.doAuthenticate(
						loginField.getText(), passwordField.getText());
				// recuperer l'utilisateur connecté
				SessionDelegate.doSetLogin(authentifiedUser.getPseudo());
				SessionDelegate.doSetPwd(authentifiedUser.getMdp());

				if (authentifiedUser instanceof Admin) {

					System.out.println("Hello Admin "
							+ authentifiedUser.getNom());
					JOptionPane.showMessageDialog(rootPane, "Welcome "
							+ authentifiedUser.getPrenom());
					// TravelerGI travelerGI = new TravelerGI();
					// travelerGI.setVisible(true);
					Menu auto = new Menu();
					auto.setVisible(true);
					System.out.println("ena connectit: session login "
							+ SessionDelegate.doGetLogin() + " Session Pwd "
							+ SessionDelegate.doGetPwd());
					dispose();

				} else {
					JOptionPane.showMessageDialog(rootPane,
							"authentification error, try again.");
					System.out.println("ena connectit: session login "
							+ SessionDelegate.doGetLogin() + " Session Pwd "
							+ SessionDelegate.doGetPwd());

				}
			}
		});
		buttonLogin.setBounds(570, 394, 76, 41);
		panel.add(buttonLogin);

		JLabel labelTitre = new JLabel("Authentication");
		labelTitre.setForeground(new Color(0, 153, 204));
		labelTitre.setFont(new Font("Roboto", Font.BOLD, 32));
		labelTitre.setBounds(225, 26, 282, 69);
		panel.add(labelTitre);

		passwordField = new JPasswordField();
		passwordField.setBounds(98, 288, 151, 20);
		panel.add(passwordField);

		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(-56, -203, 1277, 860);
		// lblBackground.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource(
		// "/images/backgr.jpg")));
		lblBackground.setText("");
		panel.add(lblBackground);
	}

	public static void setTheme() {
		// try {
		// // set this attribute will change the window border style
		// // definitions
		// BeautyEyeLNFHelper.frameBorderStyle =
		// BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
		// org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		// } catch (Exception e) {
		// // TODO Exception
		// }
	}
}
