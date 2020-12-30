package testExtend;

import java.awt.event.ActionEvent;




public class CtrlPnl_2 extends CtrlPnl_1{
	
	@Override
	protected void createPanel() {
		pnl = new Pnl_2();
	}
	
	@Override
	protected void setListener() {
		btnListener = new MouseListener();
		pnl.addBtnListener(btnListener);
	}
	
	class MouseListener extends CtrlPnl_1.MouseListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ctrlDlg = new CtrlDlg_2();
			ctrlDlg.showDialog();
			
			
		}
		
	}
}
