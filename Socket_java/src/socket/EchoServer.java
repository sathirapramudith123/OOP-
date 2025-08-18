package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		try {
			
			System.out.println("waiting for clients .......");
			ServerSocket serversocket = new ServerSocket(1000); //identify a port number
			Socket soc = serversocket.accept();
			System.out.println("Connection estabilshed");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = in.readLine();
			PrintWriter out =  new PrintWriter(soc.getOutputStream(), true);
			out.println("Server says: " + str);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

}
