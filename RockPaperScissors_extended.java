import java.util.*;
public class RockPaperScissors_extended {

	public static void main(String[] args)
	{
		System.out.println("Welcome! player name?");
		Scanner scn = new Scanner(System.in);
		String namehere = scn.next();
		// prompt user for starting the game
		System.out.println("Hello " + namehere + ", choose your weapon");
		
		String UserWeapon = scn.next();
		System.out.println("You ended up picking " + UserWeapon);
			// Apparently you don't want to use == in a string comparison
		if (UserWeapon.equalsIgnoreCase("rock") | UserWeapon.equalsIgnoreCase("paper") | UserWeapon.equalsIgnoreCase("scissors") ) {
			System.out.println("Not a bad choice!");
		} else {
			System.out.println("That's not a rock, paper or scissor...");
			System.exit(1);
		}
		
		// Computer chooses
		Random gen = new Random();
		int randomlyGenerated = gen.nextInt(3); // O = loss, 1 = tie, 2 = win
		
		// See if computer wants you to win/lose/tie
		
		if(randomlyGenerated == 1)
		{
			System.out.print("You tied!");
		}
		else if(randomlyGenerated ==2) {
			System.out.print("You lost!");
		}
		else {
			System.out.print("You won!");
		}
	}
}
