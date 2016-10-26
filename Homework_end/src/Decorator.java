import javax.swing.JPanel;

public abstract class Decorator implements PanelInterface {

	public PanelInterface panel;
	
	public Decorator(PanelInterface panel)
	{
		this.panel = panel;
	}
	
	@Override
	public JPanel returnInput() {
		// TODO Auto-generated method stub
		return null;
	}

}
