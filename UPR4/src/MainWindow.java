
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MainWindow extends JFrame {
	
	JPanel MainPanel,CenterPanel, NorthPanel;
	JButton PrivedenDohod, NormaRentabilnost, SrokOtkupuvane, Exit;
	
	public MainWindow(){
	//	setSize(300,300);
		
		MainPanel = new JPanel();
		MainPanel.setLayout(new BorderLayout());
		
		CenterPanel = new JPanel();
		CenterPanel.setLayout(new GridLayout(4,3));
		
		NorthPanel = new JPanel();
		NorthPanel.setLayout(new GridLayout(2,1));
		
		NorthPanel.add(new JLabel("Efektivnost na ivesticiite"));
		NorthPanel.add(new JLabel("Metodi za izmervane na efektivnostta"));
		
		CenterPanel.add(new JLabel(""));
		CenterPanel.add(PrivedenDohod= new JButton("Metod za chistiq priveden dohod"));
		CenterPanel.add(new JLabel(""));
		
		CenterPanel.add(new JLabel(""));
		CenterPanel.add(NormaRentabilnost = new JButton("Metod na vatreshna norma na rentabilnost"));
		CenterPanel.add(new JLabel(""));
		
		CenterPanel.add(new JLabel(" "));
		CenterPanel.add(SrokOtkupuvane = new JButton("Metod na sroka na otkupuvane"));
		CenterPanel.add(new JLabel(""));
		
		CenterPanel.add(new JLabel(""));
		CenterPanel.add(Exit = new JButton("Exit"));
		CenterPanel.add(new JLabel(""));
		
		MainPanel.add(CenterPanel, BorderLayout.CENTER);
		MainPanel.add(NorthPanel, BorderLayout.NORTH);
		
		add(MainPanel);
		setVisible(true);
		pack();
		
		Exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		PrivedenDohod.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new PrivedenDohodWindow();
			}
		});
		
		NormaRentabilnost.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new NormaRentabilnostWindow();
			}
		});
		SrokOtkupuvane.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new SrokOtkupuvaneWindow();
			}
		});
		
	}
	
	public static void main(String[] args){
		new MainWindow();
	}

}
