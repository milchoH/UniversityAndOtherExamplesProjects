package uprFactoryAbstract;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends UI{
	Frame f; 
	Label l,l1;
	TextField t,t2;
	Button b;
	String word;
	GUI(){
		f= new Frame();
		f.setSize(200, 150);
		f.setLayout(new GridLayout(4,1));
		f.setVisible(true);
		l= new Label("molq vyvedete simvuli");
		t= new TextField();
		l1= new Label();
		b= new Button("up!");
		t2 = new TextField();
		f.add(l);
		f.add(t);
		f.add(b);
		f.add(t2);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		b.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		input();
	    		upperCase();
	    		printLn();
	    	
	    		
		}});
	
	}
	
	public void input() {
		getInfo();
		
	}


	public void upperCase() {
		up();
		
	}

	
	public void printLn() {
		printInfo();
		
	}
	
	public void getInfo(){
		word=t.getText();
	}
	public void up(){
		word=word.toUpperCase();
	}
	public void printInfo(){
		t2.setText(word);
	}
}
