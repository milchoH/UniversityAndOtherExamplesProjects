import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUI extends JFrame {

	public static GUI instance=null;


	JMenu menu;
	JMenuItem inputInfo,outputInfo;
	JMenuBar menuBar;
	
	private GUI(){
		// setting frame size.
		setSize(420,320);	
		
		// Create menubar.
		menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    menu= new JMenu("Mode");
	    inputInfo = new JMenuItem("Adding information");
	    outputInfo= new JMenuItem("Displaying information");
	    menu.add(inputInfo);
	    menu.add(outputInfo);
	    menuBar.add(menu);
	    
	    //Creating InJPanel and OutJPanel using PanelFactory
		PanelInterface outPanel=PanelFactory.createPanel(1);
		PanelInterface inPanel=PanelFactory.createPanel(0);
		
		// Add button through decorator.
		InfoButtonDecorator decorator = new InfoButtonDecorator(outPanel);
		decorator.addInfoButton();
		// ---
		
		inputInfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				
				add(inPanel.returnInput());
				outPanel.returnInput().setVisible(false);
				inPanel.returnInput().setVisible(true);	
		
			}		
		});
		
		outputInfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
								
				add(outPanel.returnInput());
				inPanel.returnInput().setVisible(false);
				outPanel.returnInput().setVisible(true);		
			}
			
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

			
		setVisible(true);
	}
		
	public static GUI createInstance(){
		if(instance==null) {
			instance= new GUI();
			}
		return instance;
	}
}
