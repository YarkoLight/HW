package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("What is your name ?");
	String name = br.readLine();
	System.out.println("Where do you live ?");
	String country = br.readLine();
	
	
	
	System.out.println("Your name is " + name);
	System.out.println("You live in " + country);
	

	}

}
