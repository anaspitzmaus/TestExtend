package testExtend;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Pnl_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8204605304658642027L;
	JButton btnNewButton;
	/**
	 * Create the panel.
	 */
	public Pnl_1() {
		setLayout(new MigLayout("", "[]", "[]"));
		
		btnNewButton = new JButton("New button");
		add(btnNewButton, "cell 0 0");

	}
	
	protected void addBtnListener(ActionListener l) {
		btnNewButton.addActionListener(l);
	}

}
