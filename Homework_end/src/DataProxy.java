import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DataProxy implements DBInterface {

	private DBInterface dbInstance;
	int i=0;
	public DataProxy(DBInterface target){
		dbInstance= target;	
	}
	
	public void saveData(TeacherData data) {		
		checkData( data);		
	}

	public DefaultTableModel ReadData(DefaultTableModel table, JTable jtable) {
		sortData(jtable);
		return dbInstance.ReadData(table,null);
	}
	
	
	private void sortData(JTable jtable){
		jtable.setAutoCreateRowSorter(true);
		
	}
	
	private void checkData(TeacherData data){
	
		try{
		if(Character.isUpperCase(data.firstName.charAt(0))&& data.firstName.matches("[a-zA-Z]+")){i++; }	
		else{
			i--;
			JOptionPane.showMessageDialog(null, "Please correct: First Name ");
		}
		if(Character.isUpperCase(data.lastName.charAt(0))&& data.lastName.matches("[a-zA-Z]+")){i++;}
		else{
			i--;
			JOptionPane.showMessageDialog(null, "Please correct: Last Name ");
		}
		if(data.spec.matches("[a-zA-Z]+")){i++;}
		else{
			i--;
			JOptionPane.showMessageDialog(null, "Please correct: Subject ");
		}
		if(data.title.matches("[a-zA-Z]+")){i++;}
		else{
			i--;
			JOptionPane.showMessageDialog(null, "Please correct: Title ");
		}
		if(data.number.matches("\\d+")){i++;}
		else{
			i--;
			JOptionPane.showMessageDialog(null, "Please correct: Number ");
		}

		if(i==5){
			dbInstance.saveData(data);
			System.out.println("working");
		}
		else{
			System.out.println("unlucky working");
			}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("unlucky exception");
		}
		
		
	}
	


}
