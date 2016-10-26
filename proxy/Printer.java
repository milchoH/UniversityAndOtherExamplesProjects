package proxy;

public class Printer implements PrinterInterface{

	
	public void printData(String data) {
		System.out.println("printer:"+data);
		
	}

	public String pipeData(String data) {
		return data;
	}

}
