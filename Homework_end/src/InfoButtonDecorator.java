import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InfoButtonDecorator extends Decorator {

	public InfoButtonDecorator(PanelInterface panel) {
		super(panel);
	}
	
	private Container getContainer(Component[] comps, String compName)
	{
		for (int i = 0; i < comps.length; i++){
			if ((comps[i] instanceof Container) && comps[i].getName() != null) 
				if (comps[i].getName().compareTo(compName) == 0){
					return (Container)comps[i];
				}
		}
		return null;
	}
	
	public void addInfoButton()
	{
		JPanel pan = panel.returnInput();
		
		Component[] comps = pan.getComponents();
		
		// Create infoButton.
		JButton infoButton = new JButton("Info");
		
		infoButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {				
				String[] columns={"First Name", "Last Name","Subject","Title","Number"};
				
				// Create new table.
				JTable table = new JTable();
				DefaultTableModel tableModel = new DefaultTableModel(0,5);
				tableModel.setColumnIdentifiers(columns);
				table.setModel(tableModel);
				// ---
				
				// Add the new table in the scrollPane.
				JScrollPane scrollPane = (JScrollPane)getContainer(comps, "scrollPane");
				scrollPane.setViewportView(table);
				// ---
				
				DBInterface dbInterface = new DataProxy(new DBAdapter());
				dbInterface.ReadData(tableModel,table);
			}
		});
		// End of infoButton creation.
		
		// Add the button to the panel.
		Container south = getContainer(comps, "south");
		south.add(infoButton);
	}
}
