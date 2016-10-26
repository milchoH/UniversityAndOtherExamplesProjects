package ex5_2;

import java.awt.*;
import java.awt.event.*;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class GUI extends Frame {
	public GUI () {
		setSize(400,200);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		//Creating CheckboxGroup object
		CheckboxGroup CG = new CheckboxGroup();
		
		//adding to CheckboxGroup
        Checkbox c1 = new Checkbox("Option 1", CG, true);
        Checkbox c2 = new Checkbox("Option 2", CG, true);
        Checkbox c3 = new Checkbox("Option 3", CG, true);
		
		//adding items to Choice
		Choice c = new Choice();
		c.addItem("element 1");
		c.addItem("element 2");
		c.addItem("element 3");
		
		//adding panels
		Panel p = new Panel ();
		Panel p1= new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		//setting panels layouts
		p.setLayout(new BorderLayout());
		p1.setLayout(new GridLayout());
		p2.setLayout(new GridLayout());
		p3.setLayout(new GridLayout());
		
		//adding sub panels to main panel
		p.add(p1, BorderLayout.NORTH);
		p.add(p2, BorderLayout.CENTER);
		p.add(p3, BorderLayout.SOUTH);
		
		//adding items to sub panels
		p1.add(new Label("Label 1"));
		p1.add(new Label("Label 2"));
		
		//add items to p2
		p2.add(new TextField(" "));
		p2.add(new Button("Click me"));
		
		//add items to p3
		p3.add(c);
		p3.add(c1);
		p3.add(c2);
		p3.add(c3);
		
		add(p);
		setVisible(true);	
		pack();
	}
		
		public void itemStateChanged(ItemEvent event){
		
			GUI guii = new GUI();
	//	String strChoice = c.getSelectedItem();
	//	CG.getSelectedCheckbox();
		
	//	System.out.println("izbranoto ot Choice e: " + strChoice);
	//	System.out.println(CG.getSelectedCheckbox());
		}
					
	public static void main (String[] args){
		new GUI();
	}

}
