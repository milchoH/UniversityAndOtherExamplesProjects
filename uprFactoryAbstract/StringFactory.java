package uprFactoryAbstract;

public class StringFactory {
	public static UI  createProg(int num){
		UI open = null;
		if (num>5){
			open= new GUI();
		}else{
			open = new CUI();
		}
		
		return open;
	}
}
