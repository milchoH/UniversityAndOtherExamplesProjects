package upr3Adapter1;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Adapter extends JList implements Target {

	DefaultListModel model;
	
	
	public void add(String item) {
		
	this.model.addElement(item);
	System.out.println(item);
	}

	public void remove(int index) {
	this.remove(index);
		
	}

	
	public int getItemCount() {
	
		return 0;
	}

	@Override
	public boolean isIndexSelected(int index) {
		return this.isSelectedIndex(index);
		 
	}

	@Override
	public void setMultipleMode(boolean on) {
		this.setMultipleMode(on);
		
	}

	public String getItem(int i) {
		
		return null;
	}

}
