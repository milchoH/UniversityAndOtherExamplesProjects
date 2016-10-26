package commandMethodExecution;

import job.Job;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class giveCommandToExecute {
	final int PORT = 4567;
	private ServerSocket server = null;
	private Socket socket = null;
	ObjectInputStream input;
	ObjectOutputStream output;
	int action;
	String message, answer;
	String IP = "192.168.1.42";
	String[] str;
	Job job;
	Object obj;
	
	public void run(){
		try{
		server = new ServerSocket(PORT);
				while(true){
			try{
				waitForConnection();			
			}catch(EOFException eofException){
				System.out.println("Server closed connection ... ");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}catch(IOException ioException){
		ioException.printStackTrace();
	}
	}
	
	public void waitForConnection() throws IOException, ClassNotFoundException{
		System.out.println("waiting for Connections ... ");

		while(true){
			/*
			 * accepts connections and parse received messages with results decides which method to execute
			 */
			socket = server.accept();
			InputStream o = socket.getInputStream();
			ObjectInput s = new ObjectInputStream(o);
			System.out.println("imere");
			job =  (Job) s.readObject();
			job.run();
		  /*       if(action == 0){
		        	 //execute method 0 with params
		        	 System.out.println("exectue method 0");
		        	 answer = "Method 0 executed " + str[1]; // does its thing
		        	 sendResults(answer);
		         }
		         if (action == 1){
		        	 //execute method 1 with params
		        	 System.out.println("exectue method 1");
		        	 answer = "Method 1 executed "+str[1];// does its thing
		        	 sendResults(answer);
		        }
		         if(action == 2){
		        	 //execute method 2 with params
		        	 System.out.println("exectue method 2");
		        	 answer = "Method 2 finish "+str[1];// does its thing
		        	 sendResults(answer);
		         }
		         
		         if(action == 3){
		        	 //execute method 3 with params
		        	 System.out.println("exectue method 3");
		        	 answer = "Method 3 executed "+str[1];// does its thing
		        	 sendResults(answer);
		         }   */    
		}
	}
	
	public void sendResults(String message){
		/*
		 * send results back
		 */
		try{
			Socket socket = new Socket(IP, 4569);
				System.out.println(InetAddress.getLocalHost() + message);

			OutputStream oS = socket.getOutputStream();
			ObjectOutput sO = new ObjectOutputStream(oS);
		
			sO.writeObject(message);
			sO.flush();
			sO.close();
			oS.close();
			socket.close();
		}catch(Exception e){
			System.out.println("UNLUCKY EXCEPTION!!!!");	
			System.exit(1);
		}			
	}
}