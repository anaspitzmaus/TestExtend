package testExtend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class FrmStart extends JFrame {

	private JPanel contentPane;
	CtrlPnl_1 ctrlpnl_1;
	CtrlPnl_2 ctrlpnl_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStart frame = new FrmStart();
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
	public FrmStart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		ctrlpnl_1 = new CtrlPnl_1();
		ctrlpnl_2 = new CtrlPnl_2();
		tabbedPane.addTab("Panel_1", ctrlpnl_1.getPanel());
		
		tabbedPane.addTab("Panel_2", ctrlpnl_2.getPanel());
	}

}
