import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class outputClassWithTail {
	
	final static int PORT = 4567;
	
	static ServerSocket serverSocket = null; 
	static Socket connectionSocket = null;
	
	static ArrayList<String> connectedModules = new ArrayList<String>();
	
	public static void main(String args[]){	
		receiveFromTailed();
		sendToSender();
	}
	
	public static void sendToSender(){
		ArrayList<String> connectedModules = new ArrayList<String>();
		connectedModules.add("smth written first part of tail");
	try{
	Socket connectionSocket = new Socket("192.168.1.42", PORT);
	
	OutputStream o = connectionSocket.getOutputStream();
	ObjectOutput s = new ObjectOutputStream(o);
	
	s.writeObject(connectedModules);
	s.flush();
	if(s!=null)
	s.close();
	if(o!=null)
	o.close();
	if(connectionSocket!= null)
	connectionSocket.close();
	}catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println("Error during serialization in Receiver");
        System.exit(1);
	}
	}
	public static void receiveFromTailed(){
		try{
			serverSocket = new ServerSocket(4568);
			System.out.println("outpitClassWithTail is listening on port: " + 4568);
			connectionSocket = serverSocket.accept();
			
			InputStream o = connectionSocket.getInputStream();
			ObjectInput s = new ObjectInputStream(o);
			
			connectedModules =(ArrayList<String>) s.readObject();
			if(s!= null)
			s.close();
	        for(String tmp: connectedModules){
	            System.out.println(tmp);
	        }
		
		}catch(Exception e){
	         System.out.println(e.getMessage());
	         System.out.println("Error during serialization in Sender");
	         System.exit(1);
		}
	}

}
