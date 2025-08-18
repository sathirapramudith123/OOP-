package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {

	public static void main(String[] args) {
		try {
			System.out.println("Client stared");
			Socket soc = new Socket ("localhost", 1000);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number");
			int number = Integer.parseInt(userInput.readLine());
			PrintWriter out  = new PrintWriter(soc.getOutputStream(), true);
			out.println(number);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.err.println(in.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
