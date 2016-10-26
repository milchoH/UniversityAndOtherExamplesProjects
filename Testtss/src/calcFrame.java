

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class calcFrame extends JFrame{
	
	JPanel northPanel,westPanel,southPanel,centerPanel;
	JLabel balance, intrest, years;
	JTextField balanceTF,intrestTF,yearTF;
	JButton calcButton, exitButton,clearButton;
	JTable table;
	DefaultTableModel tableModel;
	JScrollPane scrollPane;
	String[] columns={"Godini","Ostatak ot dalga","Lihvena Chast","Pogasitelna chast","Aniuitet"};
	int  n;
	float k,i,t;
	float suma;
	public calcFrame(){
		setSize(700,400);
		setLayout(new BorderLayout());
		
		table= new JTable();
		tableModel = new DefaultTableModel(0,5);
		tableModel.setColumnIdentifiers(columns);
		table.setModel(tableModel);
		table.setName("table");
		scrollPane= new JScrollPane(table);
		
		
	
		northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(3,2));
		northPanel.add(balance=new JLabel("balance(K):"));
		northPanel.add(balanceTF=new JTextField());
		northPanel.add(intrest= new JLabel("intrest:"));
		northPanel.add(intrestTF=new JTextField());
		northPanel.add(years= new JLabel("years:"));
		northPanel.add(yearTF=new JTextField());
		add(northPanel,BorderLayout.NORTH);
		
		southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout());
		southPanel.add(calcButton=new JButton("Calculate"));
		southPanel.add(exitButton= new JButton("Close"));
		add(southPanel, BorderLayout.SOUTH);
		
		calcButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if (table.getRowCount() > 0) {
				    for (int i = table.getRowCount() - 1; i > -1; i--) {
				        tableModel.removeRow(i);
				    }
				}
				k=Integer.parseInt(balanceTF.getText());
				i= Integer.parseInt(intrestTF.getText());
				i=i/100;
				n= Integer.parseInt(yearTF.getText());				
				suma=k;

					for(int y=1; y<=n;y++){
						
						
						suma = suma - t;
						t= k/n;//pogasqvane
						float lihva=suma*i; //lihva
						float z=t+lihva;//anuitet
						String data = Integer.toString(y) +" "+Float.toString(suma)+" " +Float.toString(lihva) +" "+ Float.toString(t)+" "+Float.toString(z);
						tableModel.addRow(data.split(" "));
				
					}
					
				System.out.println("complex");
			}		
		});
		centerPanel = new JPanel();
		centerPanel.add(scrollPane);
		add(centerPanel, BorderLayout.CENTER);
		
		
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}});
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				setVisible(false);
			}
		});
		setVisible(true);
		pack();
	}
	public static void main (String[] args){
		new calcFrame();
	}
}
