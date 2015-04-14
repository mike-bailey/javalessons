import java.util.Random;	
	// Import is for later :P but it goes before public class
public class BasicJava
{

	/*
		These are comments
		
		Essential datatypes
		booleans -> true, false
		integers -> -2,  -1, 0, 1, 2
		doubles -> -2.00, -1.00, 0.0, 1.0, 2.0
		characters -> a, b, c, A, B, C, etc
		
	*/
				// Java will essentially take the void and go "oh I have to do things
				// with this
	public static void main(String[] args)
	{
		// TODO LIST
		boolean toasterButton = true;
		boolean toasterPower = false;
		
		if(toasterPower)
		{
			// Will fail if toasterPower is set to true, which it isn't atm
			if(toasterButton)
			{
				// Stuff happens here when toaster button is true
			}
			else if(toasterButton == false)
			{	
				toasterButton = true;
			}
		}
		else if(toasterPower == false)
		{
			// If power is off, turn power on
			toasterPower = true;
		}
		
		// Math stuff
		int bigNumber = Integer.MAX_VALUE; // 2^31 essentially
		int smallNumber = Integer.MIN_VALUE; // -2^31
		
		int newNumber = bigNumber + smallNumber - 400;
		// in the lesson the below int was changed to double with a decimal to
		// show an example
		double coolNumber = 2 + 2.0;
		System.out.print(coolNumber);
		
		
		// Characters
		// Remove single quotes and you end up with just A
		char A = 'A';
		char littleB = 'b';
		// "" performs conversion from char + char to char + string + char
		
		/* If you don't do the string, it'll convert A and b to ASCII value 
		 And assume you're doing a math operation with it's ascii values
		*/
		System.out.print( A + "" + littleB);
		
		// Strings
		String twoCharacters = A + "" + littleB;
		System.out.println(twoCharacters);
		System.out.println("");
		/*
		Difference between print and println is println will add a new line after
		you print the contents between parentheses
		*/
		System.out.println("Hello 12345 skldafjwlerjelcjkalkerjlewkjqlkwejrqwer");
		// Strings are reference types
		// boolean, integers, doubles, and characters are all primitive 
		String MyName = "Michael Bailey";
		/* I did something wrong, commenting this part out
		Random NumberGenerator = new Random();
		int randomlyGenerated = NumberGenerator.nextInt(3);
		System.out.println(randomlyGenerated);
		*/
		// Can also be done via math class below
		
		int randomlyGenerated2 = (int)(Math.random() *3);
		// Math.random creates a double by default (0 to 1, multiply it by 3 and you get a number from 0 to 3)
		System.out.println(randomlyGenerated2);
		// the (int) is called casting. Convert types with casting
		
	}
}
