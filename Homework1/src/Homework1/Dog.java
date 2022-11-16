package Homework1;

public class Dog {
	
	private String name;
	private int age;
	
	public Dog(String names, int ages) {
		name = names;
		age = ages;
	}
	
	public int humanAge() {
		age *= 7;
		return age;
	}
	
	//returns a string representation of this die
	public String toString() {
		String result;
		
		result = "Your dogs name is " + name + ", they are " + age + 
				" years old in dog years";
		
		return result;
	}
}
