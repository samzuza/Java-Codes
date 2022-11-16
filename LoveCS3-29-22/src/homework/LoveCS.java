package homework;

import java.util.Scanner;

public class LoveCS { 
	
	public static void main(String[] args) { 
		
		final int LIMIT = 10; 
		int count = 1; 
		int printNumber;
		int counting = 1;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print ("Enter the number of times you want the message printed: "); 
		printNumber = scan.nextInt(); 

		while (count <= printNumber){ 
			System.out.println(counting + " I love Computer Science!!"); 
			sum = sum + counting;
			count++; 
			counting++;
		} 
		counting = counting - 1;
		
		System.out.print("Printed this message " + counting + " times.");
		System.out.print(" The sum of the numbers from 1 to " + counting + " is " + sum + ".");
	} 
}