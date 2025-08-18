package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {

	public static void main(String[] args) {
		try {
			
			System.out.println("waiting for clients .......");
			ServerSocket serversocket = new ServerSocket(1000); //identify a port number
			Socket soc = serversocket.accept();
			System.out.println("Connection estabilshed");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			int number = Integer.parseInt(in.readLine());
			PrintWriter out  = new PrintWriter(soc.getOutputStream(), true);
			out.println("Factorial of " + number + " is:" + calculatorFactorial(number));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	static int calculatorFactorial(int number) {
		int fact=1;
		for (int i=1; i<=number; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
