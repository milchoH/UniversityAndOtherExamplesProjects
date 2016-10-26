import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InJPanel implements PanelInterface{
	JLabel teacherLabel,fNameLabel,lNameLabel,specLabel,titleLabel,numberLabel;
	JTextField firstNameTF, lastNameTF,specTF,titleTF,numberTF;
	TeacherData data;
	public JButton clearButton, saveButton;
	JPanel west,center,south,north,input;
	String s = "drhdhfh";
	
	public InJPanel(){
		data = new TeacherData();
		input = new JPanel();
		input.setVisible(false);
		input.setLayout(new BorderLayout());
		
		north = new JPanel();
		north.setLayout(new FlowLayout());
		north.add(teacherLabel= new JLabel("Teacher"));
		input.add(north,BorderLayout.NORTH);
		
		west = new JPanel();
		west.setLayout(new GridLayout(5,1));
		west.add(fNameLabel= new JLabel("First Name:"));
		west.add(lNameLabel= new JLabel("Last Name:"));
		west.add(specLabel= new JLabel("Subject:"));
		west.add(titleLabel= new JLabel("Title:"));
		west.add(numberLabel = new JLabel("Number:"));
		input.add(west, BorderLayout.WEST);
		
		center = new JPanel();
		center.setLayout(new GridLayout(5,1));
		center.add(firstNameTF= new JTextField());
		center.add(lastNameTF= new JTextField());
		center.add(specTF= new JTextField());
		center.add(titleTF= new JTextField());
		center.add(numberTF= new JTextField());	
		input.add(center, BorderLayout.CENTER);
		
		south= new JPanel();
		south.setLayout(new FlowLayout());
		south.add(clearButton= new JButton("Clear"));
		south.add(saveButton= new JButton("Save"));
		input.add(south, BorderLayout.SOUTH);
		
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				firstNameTF.setText("");
				lastNameTF.setText("");
				specTF.setText("");
				numberTF.setText("");
				titleTF.setText("");
			}
			
		});
		
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				data.firstName=firstNameTF.getText();
				data.lastName=lastNameTF.getText();
				data.spec=specTF.getText();
				data.number=numberTF.getText();
				data.title= titleTF.getText();
				DBInterface dbInterface = new DataProxy(new DBAdapter());
				dbInterface.saveData(data);
			
				
			}
			
		});
		input.setBackground(Color.WHITE);
		north.setBackground(Color.WHITE);
		west.setBackground(Color.WHITE);
		center.setBackground(Color.WHITE);
		south.setBackground(Color.WHITE);
		
	}
	public JPanel returnInput(){
		return input;
	}


	
}
