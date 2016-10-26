import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;

public class upr1 extends Frame {
	
	Panel mainPanel, buttonsPanel;
	Button postRenta, predRenta, srokRenta, pSrRenta, largerRenta, quit;
	
	
	public upr1(){
		setSize(400,400);
		
	mainPanel = new Panel();
	buttonsPanel = new Panel();
		
	mainPanel.setLayout(new BorderLayout());
	buttonsPanel.setLayout(new GridLayout(5, 1));
	
	mainPanel.add(new Label("Rentni izchisleniq"), BorderLayout.NORTH);
	mainPanel.add(buttonsPanel, BorderLayout.CENTER);
	mainPanel.add(quit = new Button("EXIT"), BorderLayout.SOUTH);
	
	buttonsPanel.add(postRenta = new Button("Postnumerandna Renta"));
	buttonsPanel.add(predRenta = new Button("Prednumerandna Renta"));
	buttonsPanel.add(srokRenta = new Button("Opredelqne srok na rentata"));
	buttonsPanel.add(pSrRenta = new Button("P-srochna renta"));
	buttonsPanel.add(largerRenta = new Button("Renta s period po-golqm ot edna godina"));
	
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
	
	quit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	});
	
	postRenta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		new	postRentaClass();
		}
	});
	predRenta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		new	predRentaClass();
		}
	});
	srokRenta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		new	srokRentaClass();
		}
	});
	pSrRenta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		new	pSrRentaClass();
		}
	});
	largerRenta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		new	largerRentaClass();
		}
	});
	
	add(mainPanel);
	setVisible(true);
	pack();
	}
	
	public static void main(String[] args){
		new upr1();
	}
}
