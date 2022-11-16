package homework;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		
		int number;
		int product = 1;
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print ("Enter the number you want the factorial of: "); 
		number = scan.nextInt(); 
		
		while (number < 0) {
				System.out.print ("A nonnegative number is required, enter a positive number: "); 
				number = scan.nextInt(); 
			}
		
		System.out.print("The factorial of " + number + " is ");

		while (number > 0) {
			product = product * number;
			number--;
		}
		
		System.out.println(product);
		
	}
}
