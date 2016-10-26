package sendCommandToExecuteMethod;

import java.io.IOException;

public class main {
	public static void main(String args[]){
		new sendCommandToExecuteMethod().setupStreams();
		try {
			new sendCommandToExecuteMethod().waitForServerResponse();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
