package testExtend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class CtrlPnl_1 {
	Pnl_1 pnl;
	MouseListener btnListener;
	
	public CtrlPnl_1() {
		createPanel();
		setListener();
	}
	
	protected void setListener() {
		btnListener = new MouseListener();
		pnl.addBtnListener(btnListener);
	}
	
	protected void createPanel() {
		pnl = new Pnl_1();
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return this.pnl;
	}
	
	class MouseListener implements ActionListener{
		protected CtrlDlg_1 ctrlDlg;
		@Override
		public void actionPerformed(ActionEvent e) {
			ctrlDlg = new CtrlDlg_1();
			ctrlDlg.showDialog();
			
			
		}
		
	}
}
