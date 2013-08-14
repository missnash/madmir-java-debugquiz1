/* -------INSTRUCTIONS-------
 * Find the errors in this code.
 * There are ten errors in total.
 * Some are obvious, some are more subtle.
 * Look for bad coding practices, as well as logic and syntax errors.
 */

import java.util.Scanner;

public class BuggyEggs {
	
	public static void main(String[] args) {
		//Declare constants and variables, initialize as appropriate
		final float PRICE_PER_DOZEN = 3.25f;
		final float PRICE_PER_SINGLE = 0.45f;
		int eggs, dozens, singles;
		float dozensCost, singlesCost, totalCost;
		Scanner kbrd = new Scanner(System.in);
		
		//User input
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		
		//This comment is whack, yo!
		dozens = eggs / 12;
		singles = eggs % 12;
		dozensCost = dozens * PRICE_PER_DOZEN;
		singlesCost = singles * PRICE_PER_SINGLE;
		totalCost = dozensCost + singlesCost;
		
		//User output
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + dozens + " dozen at $3.25, or $" + dozensCost);
		System.out.println("That's " + singles + " singles at 45 cents, or $" + singlesCost);
		System.out.println("Your total cost is $" + totalCost);
		
	
	}

}
