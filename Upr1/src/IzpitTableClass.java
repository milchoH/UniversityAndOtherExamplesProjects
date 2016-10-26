import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class IzpitTableClass {
	
	int K = 100000;
	int Z,A;
	int T = 10000;
	
	private static final Object[][] rowData = {};
	private static final Object[] columnNames = {"Godina", "Ostatak ot dalga","Lihvena chast, Zn", "Pogasitelna chast, T", "Aniuitet"};
	public void testCase() {
	    DefaultTableModel listTableModel;
	    listTableModel = new DefaultTableModel(rowData, columnNames);
	    listTableModel.addRow(new Object[]{"Godina", "Ostatak ot dalga", "Lihvena Chast, Zn", "Pogasitelna chast, T", "Aniuitet"});
	    for (int i = 1; i < 11; i++) { 	
	    	K = (K- (i-1)*T);
	    	Z = ((K - (i-1)*T)*i);
	    	A = (T+(K-(i-1)*T)*i);
	    	
	        String rowString = "godina " + i;
	        listTableModel.addRow(new Object[]{rowString, K, Z, T, A });
	    }

	    //listTableModel = new DefaultTableModel(50, 50);

	    JTable listTable;
	    listTable = new JTable(listTableModel);
	    listTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    listTable.setCellEditor(null);
	    listTable.setBounds(37, 143, 397, 183);

	    JFrame frame = new JFrame();
	    frame.add(listTable);
	    frame.setVisible(true);
	    frame.pack();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		IzpitTableClass tester = new IzpitTableClass();
	    tester.testCase();

	}

}
