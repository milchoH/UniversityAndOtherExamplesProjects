package sendCommandToExecuteMethod;

import job.Job;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class sendCommandToExecuteMethod {
	Socket socket;
	ServerSocket server = null;
	String message;
	String IP = "192.168.1.67";
	Job job;
	Job job1,job2;
	Object obj;
	
	public void setupStreams(){
		
		job1 = new Job(); job1.str="job1";
		job2 = new Job(); job2.str="job2";

		job1.job = job2;

	//	send(job1);
		/*
		 * action == which method is going to be executed
		 * from giveCommandToExecute method in commandMethodExecution project
		 * 
		 * message == params to be executed with
		 */
		
		try{
		Socket socket = new Socket(IP, 4567); // IP to send to and PORT to send by
		
		OutputStream oS = socket.getOutputStream();
		ObjectOutput sO = new ObjectOutputStream(oS);
		sO.writeObject(job1);//(action+","+message);
		sO.flush();
	/*	if(sO!=null)
			sO.close();
		if(oS!= null)
			oS.close();
		if(socket!= null)
			socket.close();*/
		}catch(Exception e){
			System.out.println("Error in serialization setupStreams class: ServerClassSecondTest");	
			System.exit(1);
		}	
	}
	
	public void waitForServerResponse() throws IOException, ClassNotFoundException {
		server = new ServerSocket(4569);
		socket = server.accept();
		InputStream o = socket.getInputStream();
		ObjectInput s = new ObjectInputStream(o);	
		message =(String) s.readObject();
		System.out.println(message);
		socket.close();
		server.close();
	}

}
