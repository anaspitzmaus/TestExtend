package testExtend;



public class CtrlDlg_1 {

	Dlg_1 dlg;
	
	public CtrlDlg_1() {
		createDialog();
		
	}

	protected void createDialog() {
		dlg = new Dlg_1();	
	}

	public void showDialog() {
		dlg.setVisible(true);
		
	}
}
