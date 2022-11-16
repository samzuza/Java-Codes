package Homework1;

public class Kennel {

	public static void main(String[] args) {
		Dog d1 = new Dog("Spot", 4);
		Dog d2 = new Dog("Rover", 7);
		Dog d3 = new Dog("Jake", 2);
		
		System.out.print(d1);
		System.out.println(" and " + d1.humanAge() + " years old in human years");
		System.out.print(d2);
		System.out.println(" and " + d2.humanAge() + " years old in human years");
		System.out.print(d3);
		System.out.println(" and " + d3.humanAge() + " years old in human years");
	}

}
