import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class OutJPanel implements PanelInterface{

	JPanel output, south;
	JButton displayButton;
	DefaultTableModel tableModel;
	JTable table;
	JLabel teacherInfo;
	JScrollPane scrollPane;
	String[] columns={"First Name", "Last Name"};
	public OutJPanel(){

		table= new JTable();
		tableModel = new DefaultTableModel(0,2);
		tableModel.setColumnIdentifiers(columns);
		table.setModel(tableModel);
		table.setName("table");
		scrollPane= new JScrollPane(table);
		scrollPane.setName("scrollPane");
		
		output= new JPanel();
		output.setLayout(new BorderLayout());
		output.add(teacherInfo= new JLabel("Teacher's information:"), BorderLayout.NORTH);
		output.add(scrollPane,BorderLayout.CENTER);
			
		south = new JPanel();
		south.setLayout(new FlowLayout());	
		south.add(displayButton= new JButton("Display data"));	
		output.add(south, BorderLayout.SOUTH);
		
		output.setVisible(false);
		output.setBackground(Color.WHITE);
		south.setBackground(Color.WHITE);
		south.setName("south");
		
		displayButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				scrollPane.setViewportView(table);
				
				DBInterface dbInterface = new DataProxy(new DBAdapter());
				dbInterface.ReadData(tableModel,table);

			}
			
		});
		
		
		
	}
	
	public JPanel returnInput() {
		return output;
	}



}
