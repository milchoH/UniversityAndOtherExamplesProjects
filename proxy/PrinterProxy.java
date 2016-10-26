package proxy;

public class PrinterProxy implements PrinterInterface{

	
	PrinterInterface delegate=null;
	
	public PrinterProxy(PrinterInterface target){
	
		this.delegate=target;
	}
	public void printData(String data) {
		String processData= process(data);
		delegate.printData(processData);
		
	}
	public String process(String data){//not crypting sortiiiiing
		String result="";
	
		byte[] bytes=data.getBytes();
		byte[] crypted = new byte [bytes.length];
		for(int i=0;i<bytes.length;i++ ){
			byte nextByte= bytes[i];
			crypted[i]=(byte) (nextByte^0x07);
		}
		result= new String(crypted);
		return result;
	}
	@Override
	public String pipeData(String data) {
		String processed = process(data);
		return processed;
	}

}
