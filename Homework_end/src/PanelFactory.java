
public class PanelFactory {
	
	
	
	public static PanelInterface createPanel(int e){
		PanelInterface result=null;
		if(e ==0){
			result= new InJPanel();
			
			}
		else if(e==1){
			result= new OutJPanel();
			}
		
			return result;
		
		
		
		
	}
}
