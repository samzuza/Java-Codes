package Homework;

import java.util.Scanner; 

public class processingGrades {
	
	public static void main (String[] args) { 

		double grade;  //a student's grade 
		double sumOfGrades; // a running total of the student grades 
		int numStudents; //a count of the students 
		int numPass;     //a count of the number who pass 
		int numFail;     // a count of the number who fail 

		Scanner scan = new Scanner(System.in); 
		System.out.println ("\nGrade Processing Program\n"); 

		// Initialize summing and counting variables 
		sumOfGrades = 0; 
		numStudents = 0; 
		numPass = 0; 
		numFail = 0; 

		// Read in the first grade 
		System.out.print ("Enter the first student's grade: "); 
		grade = scan.nextDouble(); 

		while (grade >= 0) { 
			sumOfGrades += grade; 
			numStudents++; 
	
			if (grade < 60) 
				numFail++; 
			else 
				numPass++; 
 
			// Read the next grade 
			System.out.print ("Enter the next grade (a negative to quit): "); 
			grade = scan.nextDouble(); 
		} 
		String msg = numStudents > 0 ? ("\nGrade Summary: \nClass Average: " + sumOfGrades/numStudents + 
				"\nNumber of Passing Grades: " + numPass + "\nNumber of Failing Grades: " + 
				numFail) : "No grades processed";
		
		System.out.println(msg);
	} 
}