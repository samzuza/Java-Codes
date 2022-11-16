package homework;
import java.util.Scanner; 

public class Paint {

	public static void main(String[] args) { 
		final int COVERAGE = 350;
		int length, width, height;
		int doors;
		int windows;
		double totalSqFt, paintNeeded;
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter length of room: ");
		length = myObj.nextInt();
		
		System.out.println("Enter width of room: ");
		width = myObj.nextInt();
		
		System.out.println("Enter height of room: ");
		height = myObj.nextInt();

		System.out.println("Enter the number of doors in the room: ");
		doors = myObj.nextInt();
		doors = doors * 20; //20 sq. ft. per door

		System.out.println("Enter the number of windows in the room: ");
		windows = myObj.nextInt();
		windows = windows * 15; //15 sq. ft. per window

		totalSqFt = (((2 * length * height) + (2 * width * height)) - (doors + windows));
		
		paintNeeded = totalSqFt / COVERAGE;
		
		System.out.println("With length " + length + ", width " 
		+ width + " and height " + height + 
		", the number of gallons of paint needed is " + paintNeeded + ".");
	}//end main
	
}