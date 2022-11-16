
import java.util.Scanner;

public class TestString {

	public static void main(String[] args) throws StringTooLongException {
		
		final int MAX = 20;
		String input = "NOT DONE";
		
		Scanner scan = new Scanner(System.in);
		
		StringTooLongException lengthException = new StringTooLongException("String has too many characters");
		
		System.out.println("Enter your strings, enter DONE when finished");
		
		while (input.equals("DONE")) {
			
			input = scan.nextLine();
			
			if(input.equals("DONE"))
				if(input.length() > MAX)
					throw lengthException;
				else
					System.out.println("You entered: " + input);
		}
		System.out.println("Your program successfully completed!");
	}
}
