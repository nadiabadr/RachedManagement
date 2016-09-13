package client;

import java.awt.Color;

import javax.swing.JPanel;

import BusinessDelegator.AdminDelegate;
import BusinessDelegator.SessionDelegate;
import Entities.Admin;
import javax.swing.JTextField;


public class ListeClientPanel extends JPanel {

	/**
	 * 
	 */
	public Admin authentifiedUser;
	private static final long serialVersionUID = 1L;
	private JTextField txtHellooooo;

	/**
	 * Create the panel.
	 */
	public ListeClientPanel() {
		setBackground(Color.GREEN);
		setLayout(null);
		
		txtHellooooo = new JTextField();
		txtHellooooo.setForeground(new Color(255, 255, 0));
		txtHellooooo.setBackground(new Color(51, 102, 153));
		txtHellooooo.setText("Hellooooo");
		txtHellooooo.setBounds(135, 86, 86, 20);
		add(txtHellooooo);
		txtHellooooo.setColumns(10);
		initialize();

	}

	private void initialize() {
		System.out.println("initilize panel");
		authentifiedUser = AdminDelegate.doAuthenticate(
				SessionDelegate.doGetLogin(), SessionDelegate.doGetPwd());

	}
}