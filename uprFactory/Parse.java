package uprFactory;
import java.awt.*;
import java.awt.event.*;
public class Parse extends Frame {
private TextField tin;
private TextField tout1;
private TextField tout2;
public Parse () {
	setSize(320,120);
	setLayout(new GridLayout(4,2));
	
	add(new Label("Enter name:")); add(tin=new TextField());
	add(new Label("First name:")); add(tout1=new TextField());
	add(new Label("Last name:")); add(tout2=new TextField());
	
	tout1.setEditable(false);
	tout2.setEditable(false);
	
	Button parse=new Button("Parse"); add(parse);
	Button quit=new Button("Quit"); add(quit);
	
	parse.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	computeName();
	}
	});
	quit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	System.exit(0);
	}
	});
	addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	});
	setVisible(true);
	}
	private void computeName() {
	Namer namer = NameFactory.getNamer(tin.getText());
	tout1.setText(namer.getFirst());
	tout2.setText(namer.getLast());
	}
	public static void main (String[] args){
		new Parse();
	}
}