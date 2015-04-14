import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args)
	{
		// prompt user for starting the game
		System.out.println("Hello Game Player, choose your weapon");
		
		Scanner scn = new Scanner(System.in);
		String UserWeapon = scn.next();
		System.out.println("You choose " + UserWeapon);
		
		
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
