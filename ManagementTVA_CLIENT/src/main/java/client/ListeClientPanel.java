package client;

import java.awt.Color;

import javax.swing.JPanel;

import BusinessDelegator.AdminDelegate;
import BusinessDelegator.SessionDelegate;
import Entities.Admin;
import javax.swing.border.TitledBorder;

public class ListeClientPanel extends JPanel {

	/**
	 * 
	 */
	public Admin authentifiedUser;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ListeClientPanel() {
		initialize();

	}

	private void initialize() {
		System.out.println("initilize panel");
		authentifiedUser = AdminDelegate.doAuthenticate(
				SessionDelegate.doGetLogin(), SessionDelegate.doGetPwd());

		setBackground(Color.GREEN);

		panel = new javax.swing.JPanel();
		panel.setBackground(new Color(255, 0, 51));
		panel.setBorder(new TitledBorder(null, "CLIENTS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 102, 255)));
		panel.setBounds(202, 11, 882, 568);
		add(panel);
		panel.setLayout(null);

	}

	private javax.swing.JPanel panel;
}