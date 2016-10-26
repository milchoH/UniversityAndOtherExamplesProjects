package distributedTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class senderClass extends Thread {
	final static int PORT = 4567;
	
	private static ServerSocket serverSocket = null; 
	private static Socket connectionSocket =null;
	
	static ArrayList<String> connectedModules = new ArrayList<String>();
	
	public static void main(String args[]){
	(new senderClass()).start();
	//System.out.println("Server is listening on port: " + PORT);
//	}
	//public static void senderClassMethod(){
		
/*		try {
			serverSocket = new ServerSocket(PORT);
			InputStream o = connectionSocket.getInputStream();
			ObjectInput s = new ObjectInputStream(o);
			connectedModules =(ArrayList<String>) s.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
*/
        }

		/*	try{	
			serverSocket = new ServerSocket(PORT);
			System.out.println("Server is listening on port: " + serverSocket.getLocalPort());
			connectionSocket = serverSocket.accept();
			System.out.println("Server IP: " + connectionSocket.getInetAddress());
			InputStream o = connectionSocket.getInputStream();
			ObjectInput s = new ObjectInputStream(o);
			connectedModules =(ArrayList<String>) s.readObject();
			if(s!= null)
			s.close();
			//testing smth
	//		System.out.println("Connection socket inet address " + connectionSocket.getInetAddress());
	//		System.out.println("Server socket local port "+ serverSocket.getLocalPort());
		}catch(Exception e){
	         System.out.println(e.getMessage());
	         System.out.println("Error during serialization in Sender");
	         System.exit(1);
		}
        for(String tmp: connectedModules){
            System.out.println(tmp);
        }*/	
		public void run(){
			boolean running = true;
			while(running){
				try{
					serverSocket = new ServerSocket(PORT);
					connectionSocket = serverSocket.accept();
					InputStream o = connectionSocket.getInputStream();
					ObjectInput s = new ObjectInputStream(o);
					connectedModules =(ArrayList<String>) s.readObject();
				}catch(IOException e){
					e.printStackTrace();	
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				new Thread().start();
		        for(String tmp: connectedModules){
		            System.out.println(tmp);
		        }
		        if(Thread.interrupted()){
		        	return;
		        }
			}
		}		
}
