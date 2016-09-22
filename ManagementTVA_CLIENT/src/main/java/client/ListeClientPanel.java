package client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import models.ClientsModel;
import BusinessDelegator.AdminDelegate;
import BusinessDelegator.SessionDelegate;
import Entities.Admin;

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

		setPreferredSize(new Dimension(880, 560));
		setMinimumSize(new Dimension(880, 560));
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Clients", TitledBorder.LEFT, TitledBorder.TOP, null,
				new Color(102, 51, 204)));

		// *************************************************************
		jPannelLibrary = new javax.swing.JPanel();
		jPannelLibrary.setBounds(10, 108, 482, 484);
		jScrollLibrary = new javax.swing.JScrollPane();
		jScrollLibrary.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getComponent());

			}
		});
		jTable1 = new javax.swing.JTable();
		setLayout(null);

		jPannelLibrary.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						51, 0, 0)), "Liste de tous mes clients",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 2, 12),
				new java.awt.Color(102, 0, 0))); // NOI18N

		jTable1.setModel(new ClientsModel());
		jScrollLibrary.setViewportView(jTable1);

		javax.swing.GroupLayout gl_jPannelLibrary = new javax.swing.GroupLayout(
				jPannelLibrary);
		jPannelLibrary.setLayout(gl_jPannelLibrary);
		gl_jPannelLibrary
				.setHorizontalGroup(gl_jPannelLibrary
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gl_jPannelLibrary
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollLibrary,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												490, Short.MAX_VALUE)
										.addContainerGap()));
		gl_jPannelLibrary
				.setVerticalGroup(gl_jPannelLibrary
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gl_jPannelLibrary
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollLibrary,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												286, Short.MAX_VALUE)
										.addContainerGap()));

		add(jPannelLibrary);

		buttonRefresh = new JButton();
		buttonRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(SessionDelegate.doGetDuration());
				// jTable1.setModel(new EbookTableModel("sa"));
			}
		});
		buttonRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jTable1.setModel(new ClientsModel());
			}
		});
		buttonRefresh.setText("Refresh ");
		buttonRefresh.setBounds(82, 84, 103, 23);
		add(buttonRefresh);

	}

	// Variables declaration - do not modify

	private javax.swing.JPanel jPannelLibrary;
	private javax.swing.JScrollPane jScrollLibrary;
	private javax.swing.JTable jTable1;

	private JButton buttonRefresh;

	// ***********************************************************

}