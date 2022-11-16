package Homework;
//************************************************************ 
//Election.java 
//
//This file contains a program that tallies the results of 
//an election.  It reads in the number of votes for each of 
//two candidates in each of several precincts.  It determines 
//the total number of votes received by each candidate, the 
//percent of votes received by each candidate, the number of 
//precincts each candidate carries, and the 
//maximum winning margin in a precinct. 
//************************************************************ 
import java.util.Scanner; 

public class Election {           
	
	public static void main (String[] args) { 
		int votesForPolly;  // number of votes for Polly in each precinct 
		int votesForErnest; // number of votes for Ernest in each precinct 
		int totalPolly; // running total of votes for Polly 
		int totalErnest; // running total of votes for Ernest 
		String response; // answer (y or n) to the "more precincts" question 

		Scanner scan = new Scanner(System.in); 
		System.out.println (); 
		System.out.println ("Election Day Vote Counting Program"); 
		System.out.println (); 

		//Initializations 
		totalPolly = 0;
		totalErnest = 0;
		response = "y";
		
		int precinctP = 0;
		int precinctE = 0;
		int precinctT = 0;
		
		//Loop to "process" the votes in each precinct 
		while(response.equalsIgnoreCase("y")) {
			System.out.println ("Enter Votes? Enter Y or N");
			response=scan.next().toUpperCase();
			
			if(response.equalsIgnoreCase("y")) {
				System.out.println ("Enter votes for Polly:");
				votesForPolly=scan.nextInt();
				totalPolly = totalPolly + votesForPolly;
		
				System.out.println ("Enter votes for Ernest:");
				votesForErnest=scan.nextInt();
				totalErnest = totalErnest + votesForErnest;
		
				System.out.println ("Enter precinct votes for Polly: ");
				precinctP = scan.nextInt(); 
				
				System.out.println ("Enter precinct votes for Ernest: ");
				precinctE = scan.nextInt(); 
				
				System.out.println ("Enter precinct votes that tied: ");
				precinctT = scan.nextInt(); 
			}
			
			long pollyPer = totalPolly / (totalPolly + totalErnest);
			long ernestPer = totalErnest / (totalPolly + totalErnest);
				
			if (response.equalsIgnoreCase("n")) {
			break; }
		
		// Print out the results
		System.out.println ("Total votes for Polly is: " + totalPolly + " at " + pollyPer + "%");
		System.out.println ("Total votes for Ernest is: " + totalErnest + " at " + ernestPer + "%");
		}
	} 
}