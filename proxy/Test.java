package proxy;

public class Test {
	
	public static void main(String[] args){
		
		testProxy();
	}
	
	public static void testProxy(){
		PrinterInterface printer= new PrinterProxy(new Printer());
		printer.printData("this is test");
		String crypted = printer.pipeData("test");
		printer.printData(crypted);
	
	}
}
