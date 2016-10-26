import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DBAdapter implements DBInterface{


	public void saveData(TeacherData data) {
		
		String theData=data.firstName+" "+data.lastName+" "+data.spec+" "+data.title+" "+data.number;
		
		PrintWriter save;
		try {
			save = new PrintWriter(new BufferedWriter(new FileWriter("example.txt",true)));
			save.write(theData+"\n");
			save.close();
		} catch (IOException e) {}
		
		
	}

	
	public DefaultTableModel ReadData(DefaultTableModel table, JTable jtable) {
		
		String line;
		BufferedReader reader;
		if (table.getRowCount() > 0) {
		    for (int i = table.getRowCount() - 1; i > -1; i--) {
		        table.removeRow(i);
		    }
		}
	    try{       
	        reader = new BufferedReader(new FileReader("example.txt"));
	        while((line = reader.readLine()) != null) 
	        {
	           table.addRow(line.split(" ")); 
	          
	        }
	        reader.close();
	     }
	    catch(IOException ea){}
	    return table;
	}

}
