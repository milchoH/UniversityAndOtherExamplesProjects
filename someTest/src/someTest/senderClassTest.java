package someTest;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class senderClassTest{
	
	final static int PORT = 4567;
	
	private static ServerSocket server = null;
	private static Socket socket = null;
	static ObjectInputStream input;
	static ObjectOutputStream output;
	
	static ArrayList<String> connectedModules = new ArrayList<String>();
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		try{
			server = new ServerSocket(PORT);
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
	public static void waitForConnection() throws IOException, ClassNotFoundException{
		System.out.println("waiting for Connections ... ");
		while(true){
			socket = server.accept();
			InputStream o = socket.getInputStream();
			ObjectInput s = new ObjectInputStream(o);
			connectedModules =(ArrayList<String>) s.readObject();
	        for(String tmp: connectedModules){
	            System.out.println(tmp);
	       }
		}
	}
}
