package adapter;

public class Ram {
String ramMem="";
	private static Ram instance=null;
	
	private Ram(){
		
	}

	public static instance(){
		if(instance==null){
			instance = new Ram();
		}
		return instance;
	}
	
	public String readRam() {
	
		return ramMem;
	}


	public void writeToRam(String data) {

		this.ramMem=data;
	}

}
