package GUI;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class AjoutForm extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public AjoutForm() {
		setPreferredSize(new Dimension(800, 600));
		setMinimumSize(new Dimension(800, 600));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Comic Sans MS", lblNewLabel.getFont().getStyle(), lblNewLabel.getFont().getSize() + 3));
		lblNewLabel.setBounds(124, 101, 101, 38);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(256, 101, 150, 38);
		add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Responsable");
		label.setBounds(124, 173, 101, 38);
		add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(256, 173, 150, 38);
		add(textField_1);
		
		JLabel lblNumTl = new JLabel("Num T\u00E9l");
		lblNumTl.setBounds(124, 255, 101, 38);
		add(lblNumTl);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(256, 255, 150, 38);
		add(textField_2);

	}
}
