package homework;
import java.util.Random;
public class RollDice {

	public static void main(String[] args) {
		
		//declaring int variables
		int dice1;
		int dice2;
		int totalRoll;
		
		Random generator = new Random();
		
		//declaring random ints for dice1 and dice2
		dice1 = generator.nextInt(1,7);
		dice2 = generator.nextInt(1,7);
		
		//adding the random ints together
		totalRoll = dice1 + dice2;
		
		System.out.println("Dice 1 rolled: " + dice1);
		System.out.println("Dice 2 rolled: " + dice2);
		System.out.println("The total roll of " + dice1 + " and " 
							+ dice2 + ": " + totalRoll);
	
	}

}
