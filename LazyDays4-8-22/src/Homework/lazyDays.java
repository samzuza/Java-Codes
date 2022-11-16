package Homework;

import java.util.Scanner;

public class lazyDays {

	public static void main(String[] args) {
		double temp;
		String activity;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("What is the temperature outside? "); 
		temp = scan.nextDouble();
		
		if (temp > 95 || temp < 25) {
			activity = "to visit our shops!";
		}
		else if (temp >= 80) {
			activity = "swimming.";
		}
		else if (temp >= 60 && temp < 80) {
			activity = "tennis.";
		}
		else if (temp >= 40 && temp < 60) {
			activity = "golf.";
		}
		else {
			activity = "skiing.";
		}
		System.out.println("The activity appropriate for " + temp + " degrees is " + activity);
	}
}
