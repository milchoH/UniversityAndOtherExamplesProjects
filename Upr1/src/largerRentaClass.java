import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class largerRentaClass extends Frame {
	Panel mainPanel, godPanel, lvPanel, lihvaPanel, northPanel, helpPanel;
	TextField Rr, r, n, i, result;
	Button calc, quit;
	float Rri, ri, ni, ii;
	double resulti;
	
	public largerRentaClass(){
		setSize(300, 300);
		
		mainPanel = new Panel();
		godPanel = new Panel();
		northPanel = new Panel();
		helpPanel = new Panel();
		lvPanel = new Panel();
		lihvaPanel = new Panel();
		
		mainPanel.setLayout(new BorderLayout());
		helpPanel.setLayout(new BorderLayout());	
		godPanel.setLayout(new GridLayout(1,2));
		lvPanel.setLayout(new GridLayout(3,2));
		lihvaPanel.setLayout(new GridLayout(2,3));
		northPanel.setLayout(new GridLayout(2,2));
		
		mainPanel.add(helpPanel, BorderLayout.CENTER);
		
		helpPanel.add(godPanel, BorderLayout.NORTH);
		helpPanel.add(lvPanel, BorderLayout.CENTER);
		helpPanel.add(lihvaPanel, BorderLayout.SOUTH);

		mainPanel.add(northPanel, BorderLayout.SOUTH);
		
		godPanel.add(new Label("Chlen na rentata (lv):"));
		godPanel.add(Rr = new TextField());
		
		lvPanel.add(new Label("Perion da rentata (god):"));
		lvPanel.add(r = new TextField());
		
		lvPanel.add(new Label("Srok na rentata (god):"));
		lvPanel.add(n = new TextField());
		
		lvPanel.add(new Label("Godishna lihva (%):"));
		lvPanel.add(i = new TextField());
	
		northPanel.add(new Label("Narastnalata suma e: "));	
		northPanel.add(result = new TextField());
		northPanel.add(calc = new Button("Izchislenie"));
		northPanel.add(quit = new Button("EXIT"));
		result.setEditable(false);
		
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
			}
		});
		
		calc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Rri =  Integer.parseInt(Rr.getText());
				ri = Integer.parseInt(r.getText());
				ni = Integer.parseInt(n.getText());
				ii = Integer.parseInt(i.getText());
				ii = ii/100;
				resulti = (Rri * (Math.pow(1 + ii, ni) - 1) / (Math.pow(1 + ii, ri) - 1));
				result.setText(Double.toString(resulti));		
			}
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				setVisible(false);
			}
		});
		add(mainPanel);
		setVisible(true);
		pack();
		
	}
}
