import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public interface DBInterface {
	public void saveData(TeacherData data);
	public DefaultTableModel ReadData(DefaultTableModel table,JTable jtable);
}
