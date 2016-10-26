import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class srokRentaClass extends Frame {
	Panel mainPanel, godPanel, lvPanel, lihvaPanel, northPanel, helpPanel;
	TextField Sn, r, i, result;
	Button calc, quit; 
	float Sni, Ri, ii, qi;
	double resulti = 0;
	
	public srokRentaClass(){
		setSize(300, 300);
		
		mainPanel = new Panel();
		godPanel = new Panel();
		northPanel = new Panel();
		helpPanel = new Panel();
		lvPanel = new Panel();
		lihvaPanel = new Panel();
		
		mainPanel.setLayout(new BorderLayout());
		helpPanel.setLayout(new BorderLayout());	
		godPanel.setLayout(new GridLayout(2,3));
		lvPanel.setLayout(new GridLayout(2,3));
		lihvaPanel.setLayout(new GridLayout(2,3));
		northPanel.setLayout(new GridLayout(2,2));
		
		mainPanel.add(helpPanel, BorderLayout.CENTER);
		
		helpPanel.add(godPanel, BorderLayout.NORTH);
		helpPanel.add(lvPanel, BorderLayout.CENTER);
		helpPanel.add(lihvaPanel, BorderLayout.SOUTH);

		mainPanel.add(northPanel, BorderLayout.SOUTH);
		
		godPanel.add(new Label("Narastnala suma:"));
		godPanel.add(new Label(""));
		godPanel.add(new Label(""));
		godPanel.add(new Label("Sn ="));
		godPanel.add(Sn = new TextField());
		godPanel.add(new Label("god."));
		
		lvPanel.add(new Label("Suma:"));
		lvPanel.add(new Label(""));
		lvPanel.add(new Label(""));
		lvPanel.add(new Label("R = "));
		lvPanel.add(r = new TextField());
		lvPanel.add(new Label("lv."));
		
		lihvaPanel.add(new Label("Godishna lihva:"));
		lihvaPanel.add(new Label(""));
		lihvaPanel.add(new Label(""));
		lihvaPanel.add(new Label("i ="));
		lihvaPanel.add(i = new TextField());
		lihvaPanel.add(new Label("%"));
		
		northPanel.add(new Label("Sroka na rentata e: "));	
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
				Sni = Integer.parseInt(Sn.getText());
				Ri =  Integer.parseInt(r.getText());
				ii = Integer.parseInt(i.getText());
				ii = ii/100;
				qi = ii+1;
				resulti = ((Math.log10(((Sni/Ri) * (qi-1))+ 1))/Math.log10(qi));
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
