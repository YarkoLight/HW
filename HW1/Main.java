package HW1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		  Scanner io = new Scanner(System.in);
		  System.out.println("Input the radius of the circle: ");
		  double radius = io.nextDouble();
		  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		  System.out.println("Area is = " + (Math.PI * radius * radius));
		 }

}
