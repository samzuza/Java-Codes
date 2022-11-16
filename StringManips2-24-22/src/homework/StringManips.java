package homework;
//*************************************************************** 
//StringManips.java 
//
//Test several methods for manipulating String objects 
//*************************************************************** 
import java.util.Scanner; 
public class StringManips { 

	public static void main (String[] args) { 

		String phrase = new String ("This is a String test."); 

		int phraseLength;   // number of characters in the phrase String 
		int middleIndex;    // index of the middle character in the String 
		int leftIndex;		//middle left character
		int rightIndex;		//middle right character
		
		String firstHalf;   	// first half of the phrase String 
		String secondHalf;  	// second half of the phrase String 
		String switchedPhrase; 	//a new phrase with original halves switched 
		String middle3; 		//middle 3 characters
		String newPhrase;		//replaces all " " with "*"
		String city;
		String state;
		
		Scanner sc = new Scanner(System.in);
		
		//user input for city
		System.out.println("Enter your hometown/city: ");
		city = sc.nextLine();

		//user input for state
		System.out.println("Enter your state: ");
		state = sc.nextLine();
		
		//makes string city all lower case letters
		city = city.toLowerCase();
		//makes string state all capital letters
		state = state.toUpperCase();
		
		//compute the length and middle index of the phrase 
		phraseLength = phrase.length(); 
		middleIndex = phraseLength / 2; 
		leftIndex = middleIndex - 1;
		rightIndex = middleIndex + 2;

		//get the substring for each half of the phrase 
		firstHalf = phrase.substring(0,middleIndex); 
		secondHalf = phrase.substring(middleIndex, phraseLength); 
		middle3 = phrase.substring(leftIndex, rightIndex);

		//concatenate the firstHalf at the end of the secondHalf 
		switchedPhrase = secondHalf.concat(firstHalf); 
		newPhrase = switchedPhrase.replaceAll(" ", "*");
		switchedPhrase = newPhrase;
		
		//print information about the phrase 
		System.out.println(); 
		System.out.println ("Original phrase: " + phrase); 
		System.out.println ("Length of the phrase: " + phraseLength + " characters"); 
		System.out.println ("Index of the middle: " + middleIndex); 
		System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex)); 
		System.out.println ("Switched phrase: " + switchedPhrase); 
		System.out.println(); 
		System.out.println("The middle 3 letters: " + middle3);
		System.out.println(state + city + state); 
	} 
}