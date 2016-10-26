package outputClassTest;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class outputClassTest {

	/*
	 * Start of server part
	 * 
	 */
	
	final static int PORT = 4568;
	
	private static ServerSocket server = null;
	private static Socket socket = null;
	static ObjectInputStream input;
	static ObjectOutputStream output;
	
	static ArrayList<String> connectedModules = new ArrayList<String>();
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		try{
			server = new ServerSocket(PORT);
			setupStreams();
			while(true){
				try{

					waitForConnection();
				}catch(EOFException eofException){
					System.out.println("Server ended connection... ");
				}
			}
		}catch (IOException ioException){
			ioException.printStackTrace();
		}
	}
	public static void setupStreams() {
		try{
		connectedModules.add("This goes first");
		Socket connectionSocket = new Socket("192.168.1.42", 4567);
		
		OutputStream oS = connectionSocket.getOutputStream();
		ObjectOutput sO = new ObjectOutputStream(oS);
		
		sO.writeObject(connectedModules);
		sO.flush();
		if(sO!=null)
		sO.close();
		if(oS!= null)
		oS.close();
		if(connectionSocket!= null)
		connectionSocket.close();
		}catch(Exception e){
	        System.out.println(e.getMessage());
	        System.out.println("Error during serialization in Receiver");
	        System.exit(1);
		}
	}
	public static void waitForConnection() throws IOException, ClassNotFoundException{
		System.out.println("waiting for Connections ... ");
		while(true){
			socket = server.accept();
			InputStream o = socket.getInputStream();
			ObjectInput s = new ObjectInputStream(o);
			connectedModules =(ArrayList<String>) s.readObject();
	    //   for(String tmp: connectedModules){
	    	   try{
	    	//		connectedModules.add("This goes first");
	   			Socket connectionSocket = new Socket("192.168.1.42", 4567);
	   			
	   			OutputStream oS = connectionSocket.getOutputStream();
	   			ObjectOutput sO = new ObjectOutputStream(oS);
	   			
	   			sO.writeObject(connectedModules);
	   			sO.flush();
	   			if(sO!=null)
	   			sO.close();
	   			if(oS!= null)
	   			o.close();
	   			if(connectionSocket!= null)
	   			connectionSocket.close();
	   			}catch(Exception e){
	   		        System.out.println(e.getMessage());
	   		        System.out.println("Error during serialization in Receiver");
	   		        System.exit(1);
	   			}
	    //   }
		}
	}
	/*
	 * End of server part
	 * 
	 * Start of Client part
	 */
	public static void clientTest(){
		try{

			Socket connectionSocket = new Socket("192.168.1.42", 4567);
			
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

