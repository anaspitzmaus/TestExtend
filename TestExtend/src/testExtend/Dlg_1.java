package testExtend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;

public class Dlg_1 extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7881320636262625624L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	

	/**
	 * Create the dialog.
	 */
	public Dlg_1() {
		setTitle("Dlg_1");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[grow]", "[][]"));
		{
			JButton btnNewButton = new JButton("New button");
			contentPanel.add(btnNewButton, "cell 0 0");
		}
		{
			textField = new JTextField();
			contentPanel.add(textField, "cell 0 1,growx");
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
