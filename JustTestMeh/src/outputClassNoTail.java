import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class outputClassNoTail{
	
	public static void main(String args[]){
		
		ArrayList<String> connectedModules = new ArrayList<String>();
		connectedModules.add("Third");
	try{
	Socket connectionSocket = new Socket("192.168.1.42", 4568);
	
	OutputStream o = connectionSocket.getOutputStream();
	ObjectOutput s = new ObjectOutputStream(o);
	
	s.writeObject(connectedModules);
	s.flush();
	if(s!=null)
	s.close();
	if(o!= null)
	o.close();
	if(connectionSocket!= null)
	connectionSocket.close();
	}catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println("Error during serialization in Receiver");
        System.exit(1);
	}
}

}
